import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent {

  employee : any = [{id:100,name:'sanket' , salary:900}, {id:100,name:'sanket' , salary:900}];
}
