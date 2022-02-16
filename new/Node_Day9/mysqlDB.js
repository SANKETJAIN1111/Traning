let app = require("express")();
let Mysql = require('mysql');
let dbURL = "mysql://root:root@localhost:3306/legato_db?debug=true&charset=BIG5_CHINESE_CI&timezone=-0700";

let port = 9099;
app.listen(port, () => console.log(`Node server running in ${port}`));
// retriving all the records
app.get('/users', (request, response) => {
    const connection = Mysql.createConnection(dbURL);
    connection.connect((err) => {
        if(err) throw err;
        console.log(`connected!`);
        var query = "SELECT * FROM employee";
        connection.query(query, (err, results)=>{
        if(err)throw err;
        response.send(JSON.stringify(results));
        }); 
        connection.commit();
        connection.end();
    });
});

app.get('/user/:id', (request, response) => {
    const connection = Mysql.createConnection(dbURL);
    connection.connect((err) => {
        let id = parseInt(request.params.id);
        if(err) throw err;
        console.log(`connected!`);
        var query = `SELECT * FROM employee where id=${id}`;
        connection.query(query, (err, results)=>{
            if(err)throw err;
             response.send(JSON.stringify(results));
        }); 
        connection.commit();
        connection.end();
    });
});
app.post('/user', (request, response) => {
    const connection = Mysql.createConnection(dbURL);
    connection.connect((err) => {
        let id = parseInt(request.query.id);
        let name = request.query.name;
        let salary = parseInt(request.query.salary);
        if(err) throw err;
        console.log(`connected!`);
       // var query = `INSERT INTO employee(id,name, salary) VALUES (${request.query.id},${request.query.name},${request.query.salary})`;
        var query = `INSERT INTO employee(id, name , salary) VALUES (${id}, '${name}' ,${salary})`;
        connection.query(query, (err, results)=>{
            if(err)throw err;
             response.send(`Data Stored Successfully`);
        }); 
        connection.commit();
        connection.end();
    });
});

app.put('/user/:id/:name/:salary', (request, response) => {
    const connection = Mysql.createConnection(dbURL);
    connection.connect((err) => {
        let id = parseInt(request.params.id);
        let name = request.params.name;
        let salary = parseInt(request.params.salary);
        if(err) throw err;
        console.log(`connected!`);
        var query = `UPDATE employee SET name = '${name}', salary=${salary} where id =${id}`;
        connection.query(query, (err, results)=>{
            if(err)throw err;
             response.send(`Data Updated Successfully`);
        }); 
        connection.commit();
        connection.end();
    });
});
app.delete('/user/:id', (request, response) => {
    const connection = Mysql.createConnection(dbURL);
    connection.connect((err) => {
        let id = parseInt(request.params.id);
        if(err) throw err;
        console.log(`connected!`);
        var query = `DELETE FROM employee where id =${id}`;
        connection.query(query, (err, results)=>{
            if(err)throw err;
             response.send(`Data Deleted Successfully `);
        }); 
        connection.commit();
        connection.end();
    });
});