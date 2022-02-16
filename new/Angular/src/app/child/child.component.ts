import { Component, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent {

  @Input()
  username='Bruce';

  @Output()
  eventCounter: EventEmitter <Number>= new EventEmitter<Number>();
  counter : number=0;
  childCounter: number = 0;
  incrementCounter(){
    this.counter=this.counter+1;
    this.childCounter++;
    this.eventCounter.emit(this.counter);
    this.counter=0;
  }

}
