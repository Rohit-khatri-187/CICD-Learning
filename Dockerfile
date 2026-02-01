FROM eclipse-temurin:21-jre-alpine-3.23

WORKDIR /app
COPY target/Java-CICD-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8090
ENTRYPOINT ["java", "-jar", "app.jar"]
