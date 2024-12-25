import { Component } from '@angular/core';
import { RouterLink, RouterOutlet } from '@angular/router';
import { HomeComponent } from '../home/home.component';
import { LoginComponent } from '../login/login.component';
import { AboutComponent } from '../about/about.component';
import { SignUpComponent } from '../sign-up/sign-up.component';
import { ContactusComponent } from '../contactus/contactus.component';

@Component({
  selector: 'app-mainnavbar',
  imports: [RouterOutlet, HomeComponent, LoginComponent, AboutComponent, SignUpComponent, ContactusComponent,RouterLink],
  templateUrl: './mainnavbar.component.html',
  styleUrl: './mainnavbar.component.scss'
})
export class MainnavbarComponent {

}
