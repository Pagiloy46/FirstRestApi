# Task 2 – Spring Boot REST API

This project is created as part of Task 2 and demonstrates a simple REST API built with Spring Boot.
The application follows a layered architecture and uses REST principles to create and retrieve resources.

---

## Project Description

The goal of Task 2 is to implement a RESTful backend application using Spring Boot.
The project contains a REST controller, service layer, repository layer, and a domain model.
No database is used — a simple in-memory structure (HashMap) simulates data storage.

---

## Technologies Used

- Java
- Spring Boot
- Spring Web
- Maven

---

## Project Structure

src/main/java/com/example/first_rest_api
├── product
│ ├── api
│ │ └── ProductController.java
│ ├── domain
│ │ └── Product.java
│ ├── repository
│ │ └── ProductRepository.java
│ ├── service
│ │ └── ProductService.java
│ └── support
└── FirstRestApiApplication.java


---

## Application Layers

### Domain Layer
Contains the `Product` class which represents the main business entity.

### Repository Layer
Implements an in-memory data storage using `HashMap`.
Responsible for saving and retrieving products.

### Service Layer
Contains business logic and connects controller with repository.
Uses constructor-based dependency injection.

### API Layer
Implements REST endpoints using `@RestController`.

---

## REST Endpoints

### Create Product

POST /api/v1/products

Request body (JSON):
```json
{
  "name": "iPhone"
}

Response:
{
  "id": 1,
  "name": "iPhone"
}


Get Product by ID
GET /api/v1/products/{id}

Response:
{
  "id": 1,
  "name": "iPhone"
}
