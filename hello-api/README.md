# Hello API

A small Spring Boot project to learn the fundamentals of building REST APIs.

## Endpoints

### GET `/hello`

Returns:

```text
Hello World
```

### GET `/hello/{name}`

Returns a greeting using the provided name.

Example:

```text
GET /hello/Gopal
```

Response:

```text
Hello, Gopal
```

## Technologies

* Java
* Spring Boot
* Maven

## Run the Project

Clone the repository and run:

```bash
mvn spring-boot:run
```

The application runs on:

```text
http://localhost:8080
```
