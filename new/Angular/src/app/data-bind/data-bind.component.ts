import { Component, OnInit } from '@angular/core';
@Component({
  selector: 'app-data-bind',
  templateUrl: './data-bind.component.html',
  styleUrls: ['./data-bind.component.css']
})
export class DataBindComponent  {
  username : string ='alex';
  lastname : string ='';
  toggleButton : boolean =true;
  handleChange(v : string ):void{
    this.username=v;
    this.toggleButton=false;
  }
  disableButton(l:string):void{
    this.lastname=l;
    this.toggleButton=!this.toggleButton;
  }
}
