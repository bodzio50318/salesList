# Use the official OpenJDK base image with Java 17
FROM adoptopenjdk:17-jre-hotspot

# Set the working directory inside the container
WORKDIR /app

# Copy the Java 17 Spring Boot application JAR file to the container
COPY salesList-0.0.1-SNAPSHOT.jar app.jar

# Expose the port on which your Spring Boot application listens (change the port if needed)
EXPOSE 8080

# Define the startup command to run your Java 17 Spring Boot application
CMD ["java", "-jar", "app.jar"]
