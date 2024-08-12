# MyCalendar
Uma API do Java Spring para realizar o envio de convites de um evento através da API do Google Calendar e deixar agendado o evento.



Este projeto foi feito apenas para fins academicos sem fins lucrativos.



O projeto foi realizado no intuito de utilizar novas tecnologias como Google Agenda para deixar em seu calendario marcado algum evento ou alguma reunião importante que uma pessoa possa ter. 


## O que o projeto utilizou?



O projeto utilizou o Java Spring Maven apenas para o envio dos convites através da api do google que se encontra no pom.xml

```
		<dependency>
            <groupId>com.google.api-client</groupId>
            <artifactId>google-api-client</artifactId>
            <version>2.1.3</version>
        </dependency>
        <dependency>
            <groupId>com.google.oauth-client</groupId>
            <artifactId>google-oauth-client</artifactId>
            <version>1.34.1</version>
        </dependency>
        <dependency>
            <groupId>com.google.apis</groupId>
            <artifactId>google-api-services-calendar</artifactId>
            <version>v3-rev20220715-2.0.0</version>
        </dependency>
        <dependency>
            <groupId>com.google.apis</groupId>
            <artifactId>google-api-services-tasks</artifactId>
            <version>v1-rev20210709-2.0.0</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/com.google.oauth-client/google-oauth-client-java6 -->
        <dependency>
            <groupId>com.google.oauth-client</groupId>
            <artifactId>google-oauth-client-java6</artifactId>
            <version>1.11.0-beta</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/com.google.oauth-client/google-oauth-client-jetty -->
        <dependency>
            <groupId>com.google.oauth-client</groupId>
            <artifactId>google-oauth-client-jetty</artifactId>
            <version>1.34.1</version>
        </dependency>
```

Também é necessario se logar como desenvolvedor da aplicação no Google Cloud e criar um projeto lá para a criação da credencial. Se caso o projeto for executado sem o arquivo da credencial que deverá ser colocado dentro da pasta resources, vai ocorrer o seguinte erro:
```
java.lang.RuntimeException: Erro Desconhecido
	at com.MyCalendar.demo.facade.ConectCalendarFacade.getCredentials(ConectCalendarFacade.java:59) ~[classes/:na]
	at com.MyCalendar.demo.facade.ConectCalendarFacade.getCalendarService(ConectCalendarFacade.java:66) ~[classes/:na]
	at com.MyCalendar.demo.service.EventCreateService.<init>(EventCreateService.java:26) ~[classes/:na]
	at com.MyCalendar.demo.config.Instantiation.run(Instantiation.java:16) ~[classes/:na]
	at org.springframework.boot.SpringApplication.lambda$callRunner$5(SpringApplication.java:790) ~[spring-boot-3.3.2.jar:3.3.2]
	at org.springframework.util.function.ThrowingConsumer$1.acceptWithException(ThrowingConsumer.java:83) ~[spring-core-6.1.11.jar:6.1.11]
	at org.springframework.util.function.ThrowingConsumer.accept(ThrowingConsumer.java:60) ~[spring-core-6.1.11.jar:6.1.11]
	at org.springframework.util.function.ThrowingConsumer$1.accept(ThrowingConsumer.java:88) ~[spring-core-6.1.11.jar:6.1.11]
	at org.springframework.boot.SpringApplication.callRunner(SpringApplication.java:798) ~[spring-boot-3.3.2.jar:3.3.2]
	at org.springframework.boot.SpringApplication.callRunner(SpringApplication.java:789) ~[spring-boot-3.3.2.jar:3.3.2]
	at org.springframework.boot.SpringApplication.lambda$callRunners$3(SpringApplication.java:774) ~[spring-boot-3.3.2.jar:3.3.2]
	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184) ~[na:na]
	at java.base/java.util.stream.SortedOps$SizedRefSortingSink.end(SortedOps.java:357) ~[na:na]
	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:510) ~[na:na]
	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499) ~[na:na]
	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151) ~[na:na]
	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174) ~[na:na]
	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234) ~[na:na]
	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:596) ~[na:na]
	at org.springframework.boot.SpringApplication.callRunners(SpringApplication.java:774) ~[spring-boot-3.3.2.jar:3.3.2]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:342) ~[spring-boot-3.3.2.jar:3.3.2]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1363) ~[spring-boot-3.3.2.jar:3.3.2]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1352) ~[spring-boot-3.3.2.jar:3.3.2]
	at com.MyCalendar.demo.MyCalendarApplication.main(MyCalendarApplication.java:10) ~[classes/:na]
```

Para saber sobre a API do google e gerar o arquivo de credencial para utilizar o sistema acesse o site: 



https://developers.google.com/calendar/api/guides/overview?hl=pt-br



Para desenvolvimento Java da api: 



https://developers.google.com/calendar/api/quickstart/java?hl=pt-br


## Autor
Matheus Marano :)