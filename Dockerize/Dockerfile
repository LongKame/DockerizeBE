FROM openjdk:17
VOLUME /tmp
EXPOSE 8080
COPY target/Dockerize-0.0.1-SNAPSHOT.jar dockerize.jar
ENTRYPOINT ["java","-jar","/dockerize.jar"]
