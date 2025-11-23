# FROM maven AS builder
# WORKDIR /usr/src/
# COPY pom.xml .
# RUN mvn -B dependency:go-offline
#
# COPY . .
# RUN mvn package

# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the jar file into the container
COPY target/SignUp-0.0.1-SNAPSHOT.jar app.jar

# Expose the port the app runs on (adjust this if your app uses a different port)
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]
