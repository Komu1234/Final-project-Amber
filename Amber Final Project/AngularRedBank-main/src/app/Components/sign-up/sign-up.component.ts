import { Component } from '@angular/core';
import { MainnavbarComponent } from '../mainnavbar/mainnavbar.component';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/internal/Observable';
import { FormBuilder, FormGroup, Validators,ReactiveFormsModule } from '@angular/forms';

import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';


@Component({
  selector: 'app-sign-up',
  imports: [MainnavbarComponent],
  templateUrl: './sign-up.component.html',
  styleUrl: './sign-up.component.scss'
})
export class SignUpComponent {

  registerForm!: FormGroup;
  count: number = 0;
  accountTable: any[] = []; // This will store the registered accounts

  constructor(private fb: FormBuilder, private http: HttpClient) {}

  ngOnInit(): void {
    // Initialize the registration form with validators
    this.registerForm = this.fb.group({
      email: ['', [Validators.required, Validators.email]],
      name: ['', [Validators.required, Validators.minLength(5)]],
      username: ['', [Validators.required]],
      password: ['', [Validators.required, Validators.minLength(6)]],
      cpassword: ['', [Validators.required, Validators.equalTo('password')]]
    });
  }

  // Submit handler
  onSubmit(): void {
    if (this.registerForm.valid) {
      const { email, name, username, password } = this.registerForm.value;
      const passInsert = `<span class='masked' id='passhide${this.count}'>${password}</span>
                          <i class='fa fa-eye tablepass' id='iconPass${this.count}' 
                             (click)='togglePasswordVisibility(passhide${this.count}, iconPass${this.count})'></i>`;

      // Check for existing email or username
      if (!this.checkExistingAccount(email, 'email') && !this.checkExistingAccount(username, 'username')) {
        this.count += 1;
        this.accountTable.push([this.count, email, username, name, passInsert]);
        

        // Optionally, send the registration data to the backend
        this.registerUser({ email, name, username, password }).subscribe(response => {
          console.log('User registered:', response);
        });

        // Reset form after submission
        this.registerForm.reset();
      }
    }
  }

  // API call to register a user
  registerUser(userData: any): Observable<any> {
    return this.http.post('/api/register', userData);
  }

  // Check if the email or username already exists
  checkExistingAccount(text: string, type: string): boolean {
    return this.accountTable.some(row => row[1] === text || row[2] === text);
  }

  // Toggle password visibility
  togglePasswordVisibility(PassId: string, IconId: string): void {
    const icon = document.getElementById(IconId);
    const pass = document.getElementById(PassId);
    
    icon?.classList.toggle("fa-eye-slash");
    pass?.classList.toggle("masked");
  }
}
