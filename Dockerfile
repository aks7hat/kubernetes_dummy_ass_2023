FROM openjdk:8-jdk-alpine
RUN mkdir /app
WORKDIR /app
COPY target/KubernetesAssignment-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "KubernetesAssignment-0.0.1-SNAPSHOT.jar"]