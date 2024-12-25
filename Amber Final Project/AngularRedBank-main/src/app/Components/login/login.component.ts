import { Component } from '@angular/core';
import {FormsModule} from '@angular/forms'
import { DashboardComponent } from '../dashboard/dashboard.component';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  imports:[DashboardComponent],
  templateUrl: './login.component.html',
  styleUrl: './login.component.scss'
})
export class LoginComponent {
  
  constructor(private router:Router){}

 openDash(pageName:String): void{
  this.router.navigate([`${pageName}`]);
 }

  

    
}
