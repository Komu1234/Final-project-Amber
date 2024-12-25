import { Component } from '@angular/core';
import { HomeComponent } from '../home/home.component';
import { LoginComponent } from '../login/login.component';
import { AboutComponent } from '../about/about.component';
import { SignUpComponent } from '../sign-up/sign-up.component';
import { ContactusComponent } from '../contactus/contactus.component';
import { RouterLink, RouterOutlet } from '@angular/router';
import { DeleteDonorComponent } from '../delete-donor/delete-donor.component';
import { GetdetailsComponent } from '../getdetails/getdetails.component';

@Component({
  selector: 'app-navbar',
  imports: [RouterOutlet,HomeComponent, LoginComponent, GetdetailsComponent, AboutComponent, SignUpComponent, ContactusComponent,DeleteDonorComponent, RouterLink],
  templateUrl: './navbar.component.html',
  styleUrl: './navbar.component.scss'
})
export class NavbarComponent {

}
