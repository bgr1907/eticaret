import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  activeUser:{};
  show:boolean=false;
  ngOnInit(){
    this.activeUser= JSON.parse(localStorage.getItem('currentUser'));
    for (var i in this.activeUser){
      if(i==="role"){
        if(this.activeUser[i]==="ADMIN"){
          this.show=true;
        }
      }
    }
    }
}
