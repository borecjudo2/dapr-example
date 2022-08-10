FROM openjdk:17.0.1-jdk-slim
WORKDIR /app
COPY target/demo-greeting-*-SNAPSHOT.jar ./demo-greeting.jar
EXPOSE 3000
ENTRYPOINT java $JAVA_OPTIONS -jar demo-greeting.jar
