## docker-comando

1 - Lista de comando docker.<br/>
    O docker desde de 2017 dividiu os comando em dois grupos **comando de gerenciamento** e **comandos**<br/>
    Para ver todas essa lista digite no docker o seguinte comando: **docker --help** irá lista todos os camando de forma organizada la você verá **comando de gerenciamento** e **comandos**<br/>
Exemplo:<br/>
    docker <comando> <sub-comando> <opções><br/>

Comandos mais usados:<br/>
    1 - **docker info** Esse te dará todas as informaçoes do docker.<br/>
    2 - **docker version**. Versão do docker instalada<br/>
    3 - **docker inspect**. Esse comando server para inspecionar sua imagem, container e volume Exemplo: **docker inspect**<**idimage**><br/>
    4 - **docker container rm < idcontainer >**. Este comando remove container <br/>
    5 - **docker container rm -f < idcontainer >**. Este comando força a remoção do container <br/>
    6 - **docker volume create vol-keycloack**. Esse comando cria um volume com o nome de **vol-keycloack** <br/>
    7 - **docker run -d -p 8081:8080 < idimage >**. Comando que executa a imagem **-d** para subir desataxado **-p** portas usada onde 8081 é a porta externa e a 8080 porta interna no docker <br/>
    8 - **docker container run -d --name < defini um nome  > -v < nome volume >:/var/lib/docker/volumes/vol-jenkins/_data < idimage >**. Aqui executamos uma imagem **--name** damos uma nome para o container **-v** nome do volume **:** caminho onde se encontra o volume por fim o **< id imagem >**  <br/>
    9 - ** **.<br/>
   10 - ** **.<br/>
   11 - ** **.<br/>
   12 - ** **.<br/>
   13 - ** **.<br/>
   14 - ** **.<br/>
   14 - ** **.<br/>
    
 
