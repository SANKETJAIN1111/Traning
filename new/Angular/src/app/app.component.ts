import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'my-first-app';
  users=[ {name:'ram',gender:'Male'}, {name:'shyam',gender:'Male'},
  {name:'sita',gender:'Female'},
  {name:'gita',gender:'Female'}];
}
