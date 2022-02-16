let x=20, y=30 , z=0;
z=x+y;
console.log(`z=${z}`);
setTimeout(()=>{console.log('this is inside the callback');},1000);
console.log('last line ! ');
