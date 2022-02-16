const { request, response } = require('express');
let bodyParser = require('body-parser');
let app = require('express')();
let fs=require('fs');
let os =require('os');
let port = 9091;
app.use([bodyParser.json(),bodyParser.text()]);
//app.use();
app.get('/listUsers', (request, response)=>{
    fs.readFile(__dirname+"/"+'User.json','utf-8', (err, data)=>{
        if(err) {throw err};
        const user = JSON.parse(data.toString())
        response.json(user);
    } );
});
app.get('/user/:name', (request, response)=>{
    fs.readFile(__dirname+"/"+'User.json','utf-8', (err, data)=>{
        if(err) {throw err};
        const user = JSON.parse(data.toString());
        let username;
        for(let i =0, len=user.length; i<len;i++)
        {
        if(user[i].name==request.params.name)
        {
            username = user[i];
        }
        }
        response.json(username);
    } );
});
app.put('/updateUser/:name/:age', (request, response)=>{
    let complete ;
    var body = request.body;
        let username = request.params.name;
        let age = request.params.age;
        complete =`username : ${username} , age : ${age}`;
        response.json(complete);
        console.log(`Data Changed`)
});
app.delete('/', (request, response)=>{
    response.send(`Delete Request from /`)
});
app.post('/addUser', (request, response)=>{
   console.log(request.body);
   console.log(request.body);
   let content = request.body;
   response.json(content);
});
var server = app.listen(port,()=>console.log(`Server Port :  ${port} Host : ${os.hostname()}`));