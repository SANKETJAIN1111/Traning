import { ValueConverter } from '@angular/compiler/src/render3/view/template';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent {

 firstname: string ='alex';
 users =['Sachin', 'Virat', 'Bumra', 'Bala ji'];

clicks:any=0;
numberOfClicks(value:any)
{
  this.clicks = this.clicks+value;
}
}
