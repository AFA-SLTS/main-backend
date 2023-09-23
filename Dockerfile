FROM openjdk:20-jre-slim

WORKDIR /app

COPY build/libs/main-backend-0.0.1-SNAPSHOT.jar /app/main.jar

EXPOSE 8080

# Command to run the Spring Boot application
CMD ["java", "-jar", "main.jar"]
