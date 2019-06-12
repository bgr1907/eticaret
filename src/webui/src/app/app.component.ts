import {Component, OnInit} from '@angular/core';
import {AuthenticationService} from "./security/authentication.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit{

  activeUser = {};



  constructor(private authenticationService: AuthenticationService){
  }


  ngOnInit(){
    this.activeUser = JSON.parse(localStorage.getItem('currentUser'));
  }

}
