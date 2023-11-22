FROM openjdk:17-jdk-oracle
WORKDIR /app
COPY ./target/freelancer-0.0.1-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "app.jar"]
