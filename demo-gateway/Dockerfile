FROM openjdk:17.0.1-jdk-slim
WORKDIR /app
COPY target/demo-gateway-*-SNAPSHOT.jar ./demo-gateway.jar
EXPOSE 3001
ENTRYPOINT java $JAVA_OPTIONS -jar demo-gateway.jar
