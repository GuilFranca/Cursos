const http = require('http');

http.createServer((requisicao,resposta)=>{
    resposta.writeHead(200,{
        'Content-Type':'text/plain'
    });
    resposta.write('CFB Cursos\n');
    resposta.end();

}).listen(1337);