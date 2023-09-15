FROM openjdk:8-jre-alpine3.9

RUN apk --no-cache add curl \
&& apk --no-cache add bash \
&& apk --no-cache add tzdata \
&& apk --no-cache add procps \
&& apk --no-cache add net-tools \
&& apk --no-cache add busybox-extras 

##AJUSTA DATA-HORA
ENV TZ=America/Sao_Paulo

##abaixo colocar o nome do jar
COPY ./cobranca-integracao-service.jar ./cobranca-integracao-service.jar
ENTRYPOINT exec java $JAVA_OPTS -jar cobranca-integracao-service.jar
