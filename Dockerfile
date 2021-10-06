FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8080
ADD target/aloch-sb-authorizationService-0.0.1-SNAPSHOT.jar sbapp.jar
ENTRYPOINT ["java", "-Djava.security.edg=file:/dev/./urandom","-jar", "/sbapp.jar"]