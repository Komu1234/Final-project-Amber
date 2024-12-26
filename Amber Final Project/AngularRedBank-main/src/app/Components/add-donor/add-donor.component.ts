import { Component } from '@angular/core';
import { AuthService } from '../../auth.service';
import { NavbarService } from '../../Services/navbar.service';
import { NavbarComponent } from '../navbar/navbar.component';
import { CommonModule } from '@angular/common';
import { Client } from '../../Class/Client';
import { FormControl, FormGroup, FormsModule, NgForm } from '@angular/forms';

@Component({
  selector: 'app-add-donor',
  imports: [NavbarComponent,CommonModule,FormsModule,AddDonorComponent],
  templateUrl: './add-donor.component.html',
  styleUrl: './add-donor.component.scss'
})
export class AddDonorComponent {
    constructor(private navbarservice:NavbarService){
    
      }
      ngOnDestroy(): void {
          this.navbarservice.display();
      }
    
      ngOnInit(): void {
        this.navbarservice.hide();
      }

      student= new FormGroup({
        name:new FormControl(),
        gender : new FormControl(),
         dob : new FormControl(),
        mobileno : new FormControl(),
        emailid : new FormControl(),
        bloodgroup : new FormControl(),
        address : new FormControl(),
        bloodunit : new FormControl()
      });

      handleSubmit(addForm:NgForm):void{

        // document.getElementById('add-donor-form').click();  
        // this.student
      }
}
