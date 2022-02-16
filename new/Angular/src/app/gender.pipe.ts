import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'genderFormat'
})
export class GenderPipe implements PipeTransform {

  transform(value: string,gender: string): string {
    if(gender=="Male")
    {
      return "Mr. " +value;
    }else{
      return "Mrs. " +value;
    }
   
  }

}
