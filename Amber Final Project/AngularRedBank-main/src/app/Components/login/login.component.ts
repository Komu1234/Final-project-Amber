import { Component } from '@angular/core';
import {FormsModule} from '@angular/forms'
import { DashboardComponent } from '../dashboard/dashboard.component';
import { Router, RouterLink } from '@angular/router';
import { SignUpComponent } from '../sign-up/sign-up.component';
import { MainnavbarComponent } from '../mainnavbar/mainnavbar.component';

@Component({
  selector: 'app-login',
  imports:[DashboardComponent,SignUpComponent,RouterLink,MainnavbarComponent],
  templateUrl: './login.component.html',
  styleUrl: './login.component.scss'
})
export class LoginComponent {
  
  constructor(private router:Router){}

 openDash(pageName:String): void{
  this.router.navigate([`${pageName}`]);
 }

 username: string = '';
 password: string = '';
 rememberMe: boolean = false;

 onSubmit() {
   if (this.username && this.password) {
     console.log('Login successful!', {
       username: this.username,
       rememberMe: this.rememberMe,
     });
   } else {
     console.error('Please fill out all required fields.');
    }
  }




    
}
