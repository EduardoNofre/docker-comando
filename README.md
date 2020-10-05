## docker-comando

1 - Lista de comando docker.<br/>
    O docker desde de 2017 dividiu os comando em dois grupos **comando de gerenciamento** e **comandos**<br/>
    Para ver todas essa lista digite no docker o seguinte comando: **docker --help** irá lista todos os camando de forma organizada la você verá **comando de gerenciamento** e **comandos**<br/>
Exemplo:<br/>
    docker <comando> <sub-comando> <opções><br/>

Comandos mais usados:<br/>
    1 - **docker info** Esse te dará todas as informaçoes do docker instalado na sua maquina ou servidor.<br/>
    2 - **docker version**. Versão do docker instalada<br/>
    3 - **docker inspect**. Esse comando server para inspecionar sua imagem, container e volume Exemplo: **docker inspect**<**idimage**><br/>
    4 - **docker container rm < id container >**. Este comando remove container <br/>
    5 - **docker container rm -f < id container >**. Este comando força a remoção do container <br/>
    6 - **docker volume create vol-keycloack**. Esse comando cria um volume com o nome de **vol-keycloack** <br/>
    7 - **docker run -d -p 8081:8080 < id image >**. Comando que executa a imagem **-d** para subir desataxado **-p** portas usada onde 8081 é a porta externa e a 8080 porta interna no docker <br/>
    8 - **docker container run -d --name < defini um nome  > -v < nome volume >:/var/lib/docker/volumes/vol-jenkins/_data < idimage >**. Aqui executamos uma imagem **--name** damos uma nome para o container **-v** nome do volume **:** caminho onde se encontra o volume por fim o **< id imagem >**  <br/>
    9 - **docker ps**. Lista todos os container que estão em execução<br/>
   10 - **docker ps -a**. Lista todos os container que estão em execução e os que foram interrompidos<br/>
   11 - **docker container stop < id container >**. Esse comando para o container<br/>
   12 - **docker container start < id container >**.Esse comando inicia o container<br/>
   13 - **docker container ls -a -q**. Lista somente os id's de todos os container <br/>
   14 - **docker container rm $(docker container ls -a -q)**. Remove todos os container<br/>
   15 - **docker run -d -P < idimage >**. Note que neste caso não informei a porta e ainda usei o **-P** maisculo neste caso o docker gera as porta de forma aleatória <br/>
   16 - **docker container logs < id container >**. Exibe o log do container <br/>
   17 - **docker container top < id container >**. Exibe Todos os processo do container<br/>
   18 - **docker container stats** Esse comando é bom para saber o quanto de recurso esta sendo utlizando .<br/>
   19 - **docker container stats < id container >**. Agora para saber o quanto de recurso o seu contatiner esta utilizando<br/>
   20 - **docker network ls**. Lista as redes do docker<br/>
   21 - **docker network inspect < id rede >**. Inspenciona a rede do seu docker<br/>
   22 - **docker network inspect < nome da rede >**. Exibe os containers que estão pendurado na rede<br/>
   23 - **docker network create < nome da rede que deseja>**. Esse comando cria uma rede com o nome desajado<br/>
   24 - **docker network create < nome da rede que deseja> --subnet 192.168.134.0/24 --gateway  192.168.134.1**. Com esse comando você cria a sua rede com um range de IP<br/>
   25 - **docker network rm < nome da rede que deseja>**. Este comando deleta a rede desejada<br/>
   26 - **docker container run --name < nome container> -d --network < nome da rede que deseja >  < id imagem >**. Este comando associa o container a uma rede.<br/>
   27 - **docker network prune**. Remove todas as redes que não estão sendo usadas<br/>
   28 - ** **.<br/>
         
    
 
