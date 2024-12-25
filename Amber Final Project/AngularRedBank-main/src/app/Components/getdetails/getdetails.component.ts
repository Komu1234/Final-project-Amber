import { Component } from '@angular/core';
import { AuthService } from '../../auth.service';
import { Auth } from '../../auth';

@Component({
  selector: 'app-getdetails',
  imports: [],
  templateUrl: './getdetails.component.html',
  styleUrl: './getdetails.component.scss'
})
export class GetdetailsComponent {

  auth:Auth[]=[];
  displayval:string='';
  constructor(private authService:AuthService){}

  ngOnInit(){
    this.getUsers();
  }

  getUsers(){
    this.authService.gets().subscribe(data=>{
      this.auth=data;


    })
  }

  getId(val:string){
      console.log(val)
      this.displayval=val 
    }


  


}
