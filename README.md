# contador-livros-kafka
Microservicos java para testes de integracao com kafka, docker, Java 11, Kafdrop, lombok

Docker Compose Yml

Baixar ou executar o docker dentro da basta que se localiza esse docker-compose-yml. O docker compose a grosso modo é uma receita de bolo para o docker baixar imagens do que está descrito nele e criar containers configurados assim como o docker-compose manda. E para executar o docker-compose utilizamos o comando

docker-compose up -d

O arquivo chamado comands.txt com comandos utilizando.

Nome do topico a ser criado "contador"

![image](https://user-images.githubusercontent.com/6165929/176976443-76a7c9d8-e24a-46e3-92b4-9ac8b55f5b9d.png)


Livros GET > http://localhost:8080/livros

Ao buscar um livro especifico por ID o mesmo sera registrado no contador

Buscar Livor por ID GET > localhost:8080/livros/01

Listar contador > localhost:8085/contador


Evidencia de testes:

![image](https://user-images.githubusercontent.com/6165929/176976739-7c879769-992c-42cb-bbe1-c0b6dbbed61c.png)

![image](https://user-images.githubusercontent.com/6165929/176976750-61abb7ad-0e29-40be-be2f-aac3e258b982.png)


![image](https://user-images.githubusercontent.com/6165929/176976712-187f573d-1db6-4b4a-bcb4-a5922f0e2cd3.png)
