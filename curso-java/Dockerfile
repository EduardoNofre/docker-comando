## BUILD DA APLICAÇÃO E INDICA QUAL A VERSÃO DO JAVA SERA FEITA O BUILD 
FROM maven:3.8.4-openjdk-17 as build

##AJUSTA DATA-HORA
ENV TZ=America/Sao_Paulo

## COPIA SRC PARA /udemy-app/src
COPY src /java-estudos/src

## FAZ UMA COPIA DO pom.xml PARA /udemy-app
COPY pom.xml /java-estudos

## RETORNA PARA O DIRETORIO  /udemy-app
WORKDIR /java-estudos

## COMANDO MAVEN
RUN mvn clean install

## DIRETORIO JAVA 
FROM openjdk:22-ea-16-oracle

## PEGA O build  DA APLICAÇÃO E FAZ UMA COPIA PARA /udemy-app/udemy-proto-api-0.0.1.jar
COPY --from=build /java-estudos/target/curso-java.jar /java-estudos/curso-java.jar

## DIRETORIO /udemy-app
WORKDIR /java-estudos

##  QUAL A PORTA A APLICAÇÃO SERA EXECUTADA
EXPOSE 8080

##  EXECUTA OS COMANDO JAVA ABAIXO PARA O JAR udemy-proto-api-0.0.1.jar
CMD [ "java","-jar","udemy-proto-api-0.0.1.jar"]

