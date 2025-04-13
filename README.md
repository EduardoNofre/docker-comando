
  <h1 align="center">
    ESTUDO DOCKER
   </h1>

 <p align="center">
  <img src="https://github.com/EduardoNofre/docker-comando/blob/main/1722494286724_image.png?raw=true" alt="Sublime's custom image"/>  
</p>

<h1 align="center">
        Preparando ambiente Docker local.
 </h1>
 
  - ### 1 - Criar uma conta no docker.<br>
  - ### 2 - Fazer o downnload do Docker Desktop de acordo com seu S.O <br>
  - ### 3 - Instalar o Docker Desktop e executar para dar start <br>
  - ### 4 - Verificar se a instalação deu certo pode executar um dos comando abaixo.<br>
    - ### 4.0 - execute o comando 'docker --version'.<br>
    - ### 4.1 - execute o comando 'docker run hello-world'.<br>
    - ### 4.2 - execute o comando 'docker ps'.<br>

<h1 align="center">
       Criando o arquivo Dockerfile ambiente Docker.
 </h1>
 
 - ### 1 - O arquivo Dockerfile contem as configuraçoes necessaria para criar a imagem da aplicação.<br>
 - ### 2 - O arquivo Dockerfile pode ser inserido ou criado na raiz do seu projeto.<br>
   - ### 3 exemplo no java.<br>

    <p align="center">
      <img src="https://github.com/EduardoNofre/docker-comando/blob/main/Dockerfile.png?raw=true" alt="Sublime's custom image"/>  
    </p>
     
    <h1 align="center">
     Exemplo de Dockerfile 
    </h1>

              ## BUILD DA APLICAÇÃO E INDICA QUAL A VERSÃO DO JAVA SERA FEITA O BUILD UTILIZANDO O MAVEN
              FROM maven:3.8.4-openjdk-17 as build
              
              ## AJUSTA DATA-HORA
              ENV TZ=America/Sao_Paulo
              
              ## COPIA SRC PARA /udemy-app/src
              COPY src /udemy-app/src
              
              ## FAZ UMA COPIA DO pom.xml PARA /udemy-app
              COPY pom.xml /udemy-app
              
              ## RETORNA PARA O DIRETORIO  /udemy-app
              WORKDIR /udemy-app
              
              ## COMANDO MAVEN
              RUN mvn clean install
              
              ## DIRETORIO JAVA 
              FROM openjdk:22-ea-16-oracle
              
              ## PEGA O build  DA APLICAÇÃO E FAZ UMA COPIA PARA /udemy-app/udemy-proto-api-0.0.1.jar
              COPY --from=build /udemy-app/target/udemy-proto-api-0.0.1.jar /udemy-app/udemy-proto-api-0.0.1.jar
              
              ## DIRETORIO /udemy-app
              WORKDIR /udemy-app
              
              ##  QUAL A PORTA A APLICAÇÃO SERA EXECUTADA
              EXPOSE 8080
              
              ##  EXECUTA OS COMANDO JAVA ABAIXO PARA O JAR udemy-proto-api-0.0.1.jar
              CMD [ "java","-jar","udemy-proto-api-0.0.1.jar"]


    <<h1 align="center">
      Criando a imagem da sua aplicação.
    </h1>

- ### 1 - Uma vez que seu Dokcerfile esteja na sua aplicação e sem erros.<br>

- ### 1.0 - Execute o comando para criar a imagem da aplicação.<br>
    - ### Sintaxe: docker build -t 'nome da imagem': tag .<br>
            Exemplo: docker build -t curso-java:1.0 . não esquecer de colocar ponto final no comando

- ### 1.1 - Execute o comando para verificar a imagem criada .<br>
    - ### Sintaxe: docker image ls<br>
            Saida:
                  REPOSITORY                   TAG       IMAGE ID       CREATED       SIZE
                  curso-java                   1.0       00a75f64ef82   2 hours ago   840MB
      
- ### 1.2 - Execute o comando para roda a imagem.<br>
     - ### Sintaxe: docker run -d -p 8080:8081 'nome da imagem ou id':tag <br>
             Exemplo: docker run -d -p 8081:8081 curso-java:1.0
       
     - ### Observação:
         **docker run -d -p 8080:8081 < id image >**. <br/>
     - ### Comando que executa a imagem <br/>
          **-d** Para subir desataxado do prompt<br/>
          **-p** Portas usada onde **8081 é a porta externa** que ficar disponivel com a aplicação e a **8080 porta interna no docker** <br/>

   Exemplo
   **Porta externa:** É a porta externa que docker ira disponibilizar '8080' <br/>
   **Porta interna:** E a porta interna está configurada em seu properties '8081'. <br/>

   **docker run -d -p 8080:8081 curso-java:1.0**

   Ao executar o comando acima a porta que ficará disponivel é **localhost:8080/java/swagger-ui/index.html**
   Ao executar pelo eclipse devido configuração da **porta '8081'** no properties ficará disponivel é **localhost:8081/java/swagger-ui/index.html**.
       

<<h1 align="center">
  Imagem criada e testada, vamos fazer push e pull da imagem.
</h1>

  - ### 1 - Vamos fazer o deploy da imagem no dockerHub.<br>
  
  - ### 2 - Devemos nos logar no dockerHub.<br>
      - ### Sintaxe: docker login <br>
                Exemplo: docker login
  
  - ### 3 - Fazendo o push da imagem.<br>
      - ### Sintaxe: docker push 'seu usuario do dockerHub'/'nome imagemi:tag' <br>
                docker push financeapp/curso-java:1.0 <br>
             
                Observação:        
                        Padrão de criação é usuario/repositorio:tag <br>
                        mesmo nome do repositorio la no dockerHub
              
  - ### 4 - Fazendo o pull da imagem.<br>
      - ### Sintaxe: docker pull 'seu usuario do dockerHub'/'nome imagemi:tag' <br>
                docker pull financeapp/curso-java:1.0

  - ### 5 - Verificando se o push funcionou.<br>
     - ### Existe duas maneiras <br>
              1 - via comando sintaxe:
                        docker search usuario do dockerHub
                exemplo:
                      docker search financeapp
       
              2 - Visitar a propria pagina do dockerHub e validar pelo repositorio.
    


O docker desde de 2017 dividiu os comando em dois grupos **comando de gerenciamento** e **comandos**<br/>
Para ver todas essa lista digite no docker o seguinte comando: **docker --help** irá lista todos os camando de forma organizada la você verá **comando de gerenciamento** e **comandos**<br/>
    
Exemplo:<br/>
    **docker < comando > < sub-comando > < opções >**<br/>


<<h1 align="center">
  Comandos docker comuns
</h1>

  1 - **docker info** Esse te dará todas as informaçoes do docker instalado na sua maquina ou servidor.<br/>
  2 - **docker version**. Versão do docker instalada<br/>
  3 - **docker inspect**. Esse comando server para inspecionar sua imagem, container e volume Exemplo: **docker inspect**<**idimage**><br/>
  4 - **docker run -d -p 8081:8080 < id image >**. Comando que executa a imagem **-d** para subir desataxado **-p** portas usada onde 8081 é a porta externa e a 8080 porta interna no docker <br/>
  5 - **docker ps**. Lista todos os container que estão em execução<br/>
  6 - **docker ps -a**. Lista todos os container que estão em execução e os que foram interrompidos<br/>
  7 - **docker run -d -P < idimage >**. Note que neste caso não informei a porta e ainda usei o **-P** maisculo neste caso o docker gera as porta de forma aleatória <br/>
  7 - **docker build -t 'nome da imagem':tag**. monta uma imagem <br/>
    

  <h1 align="center">
  Comandos para image
  </h1>
  
  01 - **docker image ls**  Lista as imagens <br/>
  02 - **docker rmi < id image >** remove a image<br/>
  04 - **docker image pull < id image >** download da imagem<br/>
  05 - **docker push < id image >** upload da imagem para docoker Hub<br/>
  05 - **docker prune** upload da imagem para docoker Hub<br/>
  06 - **docker image prune -a**  remove todas as image<br/>

  <h1 align="center">
  Comandos para container
  </h1>

   01 - **docker container ls **. Lista container <br/>
   02 - **docker container ls -a -q**. Lista somente os id's de todos os container <br/>
   03 - **docker container rm < id container >**. Este comando remove container <br/>
   04 - **docker container rm -f < id container >**. Este comando força a remoção do container <br/>
   05 - **docker container stop < id container >**. Esse comando para o container<br/>
   06 - **docker container start < id container >**.Esse comando inicia o container<br/>
   07 - **docker container rm $(docker container ls -a -q)**. Remove todos os container<br/>
   08 - **docker container logs < id container >**. Exibe o log do container <br/>
   09 - **docker container top < id container >**. Exibe Todos os processo do container<br/>
   10 - **docker container stats** Esse comando é bom para saber o quanto de recurso esta sendo utlizando .<br/>
   11 - **docker container stats < id container >**. Agora para saber o quanto de recurso o seu contatiner esta utilizando<br/>
   12 - **docker container run --name < nome container> -d --network < nome da rede que deseja >  < id imagem >**. Este comando associa o container a uma rede.<br/>
   13 - **docker container run -d --name < defini um nome  > -v < nome volume >:/var/lib/docker/volumes/vol-jenkins/_data < idimage >**. Aqui executamos uma imagem **--name** daremos um nome para o container **-v** nome do volume **:** caminho onde se encontra o volume por fim o **< id imagem >**  <br/>

  <h1 align="center">
  Comandos para rede
  </h1>
  
   01 - **docker volume create vol-keycloack**. Esse comando cria um volume com o nome de **vol-keycloack** <br/>
   02 - **docker network ls**. Lista as redes do docker<br/>
   03 - **docker network inspect < id rede >**. Inspenciona a rede do seu docker<br/>
   04 - **docker network inspect < nome da rede >**. Exibe os containers que estão pendurado na rede<br/>
   05 - **docker network create < nome da rede que deseja>**. Esse comando cria uma rede com o nome desajado<br/>
   06 - **docker network create < nome da rede que deseja> --subnet 192.168.134.0/24 --gateway  192.168.134.1**. Com esse comando você cria a sua rede com um range de IP<br/>
   07 - **docker network rm < nome da rede que deseja>**. Este comando deleta a rede desejada<br/>
   08 - **docker network prune**. Remove todas as redes que não estão sendo usadas<br/>
         
- ### Anotaçoes:
   
- sudo docker ps -a<br/>
lista todos os container em execução<br/>
sudo docker ps<br/>

- Stop container <br/>
sudo docker stop <id container><br/>

- executar<br/>
sudo docker run -d -p 8080:8080 <id image or id container><br/>

- remover um container<br/>
sudo docker rm id container<br/>

- executar um container com um nome:<br/>
docker run --name <seu nome> -d -p 8080:8080 <id image><br/>

- executar comando dentro do seu container<br/>
docker exec  <id container> <br/>

- keyclocakc com nome e passando a porta e excutando em segundo plano<br/>
sudo docker run --name keycloack -d -p 8080:8080 -e KEYCLOAK_USER=admin -e KEYCLOAK_PASSWORD=admin quay.io/keycloak/keycloak:11.0.2<br/>
 
