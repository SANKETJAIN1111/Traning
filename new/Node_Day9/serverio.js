const { Socket } = require('socket.io');

let app = require('express')();

let http = require('http').Server(app);

let io = require('socket.io')(http);

app.get('/',(request, response)=>{
    response.sendFile(__dirname + "/client.html");

});
http.listen(9095, ()=>console.log('Server running in 9095'));
io.on('connection', (socket)=>{
    console.log('client is connected to server : ' + Socket.connected);
    socket.on("clientMessage",(msg)=>{
        socket.emit("messageKey", msg);
    });
});
