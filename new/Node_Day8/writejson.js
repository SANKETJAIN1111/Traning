const fs = require('fs');

const user = [{"name":"Aman", "age":22}, {"name":"sanket", "age":26}];
user.push({"name":"Naman", "age":26});
const data =JSON.stringify(user);
fs.writeFile('User.json',data, (err)=>{
    if(err) {throw err};
    console.log("JSON data is Saved.");

} );

fs.readFile('User.json','utf-8', (err, data)=>{
    if(err) {throw err};
    const user = JSON.parse(data.toString())
    //let length = user.push({"name":"Mayank", "age":22});
    for(let i =0, len=user.length; i<len;i++)
    {
        console.log("JSON data => name : "+user[i].name+" age : "+ user[i].age);
    }
    user.forEach(element => {
        console.log("JSON data => name : "+element.name+" age : "+ element.age);
    });
} );