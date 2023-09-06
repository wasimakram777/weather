# Use an official lightweight Java runtime as the base image
FROM openjdk:17

# Set the working directory in the container to /app
WORKDIR /app

# Copy the local JAR file into the container
COPY build/libs/weather-0.0.1-SNAPSHOT.jar /app/weatherservice.jar
RUN  chmod +x /app/weatherservice.jar
# Set the container's entry point to run the JAR file
ENTRYPOINT ["java", "-jar", "/app/weatherservice.jar"]

# Expose the application's port (assuming it's 8080)
EXPOSE 8080
