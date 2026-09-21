# Spring Boot REST API with Gradle

A simple REST API built using **Java, Spring Boot, and Gradle**. This project demonstrates the basic structure of a Spring Boot REST application, Gradle build management, and creating HTTP GET endpoints.

## Features

* Spring Boot REST API
* REST Controller implementation
* HTTP GET endpoint
* Gradle-based build system
* Java 21
* Spring Boot dependency management
* Gradle Wrapper support
* Simple API response for testing

## Tech Stack

* **Java 21**
* **Spring Boot**
* **Spring Web**
* **Gradle**
* **REST API**
* **Git & GitHub**

## Project Structure

```text
gradle-springboot-rest-api/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── springbootGradle/
│   │   │           └── gradle/
│   │   │               └── Restapi/
│   │   │                   ├── GradleApplication.java
│   │   │                   └── controller.java
│   │   │
│   │   └── resources/
│   │       └── application.properties
│   │
│   └── test/
│
├── gradle/
│   └── wrapper/
│
├── build.gradle
├── settings.gradle
├── gradlew
├── gradlew.bat
└── README.md
```

## How It Works

The application follows a simple REST request flow:

```text
Client
   ↓
HTTP GET Request
   ↓
REST Controller
   ↓
Response
   ↓
Client
```

The application runs on port **8081**.

## API Endpoint

### GET `/info`

Returns a simple message from the REST controller.

**Endpoint:**

```text
GET http://localhost:8081/info
```

**Example response:**

```text
Hello, this is a REST API!
```

## Requirements

Before running the project, make sure you have:

* Java 21 or later
* Git
* Gradle Wrapper included with the project

You do **not** need to install Gradle separately when using the Gradle Wrapper.

## Run the Project

### Windows

```bash
gradlew.bat bootRun
```

### Linux / macOS

```bash
./gradlew bootRun
```

After the application starts, open:

```text
http://localhost:8081/info
```

## Build the Project

### Windows

```bash
gradlew.bat build
```

### Linux / macOS

```bash
./gradlew build
```

## Run Tests

### Windows

```bash
gradlew.bat test
```

### Linux / macOS

```bash
./gradlew test
```

## Gradle Configuration

This project uses the **Gradle Wrapper**, which makes it easier to build and run the application without requiring a separate Gradle installation.

Important Gradle files:

* `build.gradle` — project dependencies and build configuration
* `settings.gradle` — project settings
* `gradlew` — Gradle Wrapper for Linux/macOS
* `gradlew.bat` — Gradle Wrapper for Windows
* `gradle/wrapper/` — Gradle Wrapper configuration

## Application Configuration

The application is configured to run on port **8081**.

```properties
spring.application.name=gradle
server.port=8081
```

## Concepts Demonstrated

This project demonstrates:

* Spring Boot application structure
* REST API development
* `@RestController`
* `@GetMapping`
* HTTP GET requests
* Gradle dependency management
* Gradle Wrapper
* Application configuration
* Basic backend project structure

## Future Improvements

Possible improvements for future versions include:

* Add multiple REST endpoints
* Implement CRUD operations
* Introduce Service and Repository layers
* Add DTOs
* Add database integration
* Add MySQL or PostgreSQL
* Add Spring Data JPA / Hibernate
* Add request validation
* Add global exception handling
* Add unit and integration tests
* Add Swagger / OpenAPI documentation
* Add Spring Security
* Add JWT authentication
* Add Docker support
* Add GitHub Actions CI/CD

## Learning Goal

This project is part of my **Java Backend Development learning journey**, focusing on building REST APIs with **Spring Boot and Gradle**.

## Author

**Avnika Chouhan**

Java Backend Developer learning and building with:

`Java` • `Spring Boot` • `Gradle` • `Maven` • `REST APIs`

## License

This project is created for **learning and educational purposes**.
