FROM openjdk:8u151-jdk-alpine3.7
RUN mkdir /app
COPY ./target/hello-service-swarm.jar /app/
WORKDIR /app
EXPOSE 8080
CMD ["java", "-jar", "/app/hello-service-swarm.jar"]
