import { Component } from '@angular/core';
import { NavbarService } from '../../Services/navbar.service';
import { NavbarComponent } from "../navbar/navbar.component";
import { MainnavbarComponent } from "../mainnavbar/mainnavbar.component";

@Component({
  selector: 'app-delete-donor',
  imports: [NavbarComponent, MainnavbarComponent],
  templateUrl: './delete-donor.component.html',
  styleUrl: './delete-donor.component.scss'
})
export class DeleteDonorComponent {
  

}
