let app= require('express')();
let MongoClient= require('mongodb').MongoClient;
let dbURL="mongodb://localhost:27017";
let port =9092;
app.listen(port, () => console.log(`Node server running in ${port}`));
app.get('/users',(request,response)=>{
   // let id = parseInt(request.params.id);
    MongoClient.connect(dbURL,{useNewUrlParser:true},(err,client)=>{
       if(!err){
            let myDB = client.db('mydb');
            let doc = myDB.collection("user").find();
            let array = [] ;
            let x=0;
            doc.forEach((record)=>{
                array.push(record);
                x++;
            }, ()=> { 
                if(x==0)
                {
                    response.json({error:"No records found"});
                }
                else{
                    response.json(array);
                }
                client.close();
            });
        }
    });
});
app.get('/user/:id',(request,response)=>{
    let id = parseInt(request.params.id);
    MongoClient.connect(dbURL,{useNewUrlParser:true},(err,client)=>{
        if(!err){
            let myDB = client.db('mydb');
            let doc = myDB.collection("user").find({_id:id});
            let array = [] ;
            let x=0;
            doc.forEach((record)=>{
                array.push(record);
                x++;
            }, ()=> { 
                if(x==0)
                {
                    response.json({error:"No records found"});
                }
                else{
                    response.json(array);
                }
                client.close();
            });
        }
    });
});
app.post('/user',(request,response)=>{
        let id = parseInt(request.query.id);
        let name = request.query.name;
        let salary = parseInt(request.query.salary);
        MongoClient.connect(dbURL,{useNewUrlParser:true},(err,client)=>{
            if(err) throw err;
            {
                var data= {_id:id,name:name,salary:salary};
                let myDB = client.db('mydb');  
                   myDB.collection("user").insertOne(data,(err,res)=>
                   {
                       if(err) throw err ; 
                    response.send(`1 Document Stored Successfully !!! ${res.insertedCount}`);
                    client.close();
                   });
            }
        });
});
app.put('/user/:id/:name/:salary',(request,response)=>{
    let id = parseInt(request.params.id);
    let name = request.params.name;
    let salary = parseInt(request.params.salary);
    MongoClient.connect(dbURL,{useNewUrlParser:true},(err,client)=>{
        if(err) throw err;
            let myDB = client.db('mydb');
            var findwith = {_id:id};
            var setData = {$set:{name:name,salary:salary}};
             myDB.collection("user").updateOne(findwith,setData,(err,res)=>{
                if(err) throw err;
                response.send(` document(s) Updated`);
                client.close();
             });
        });
});
app.delete('/user/:id',(request,response)=>{
    let id = parseInt(request.params.id);
    MongoClient.connect(dbURL,{useNewUrlParser:true},(err,client)=>{
        if(err) throw err;
            let myDB = client.db('mydb');
            var myquery = {_id:id};
                let delete_data = myDB.collection("user").deleteOne(myquery,(err,res)=>{
                    if(err)throw err;
                    response.send(`document deleted!!`);
                    client.close();
                }); 
    });
});