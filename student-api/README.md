# Students API

A simple Spring Boot API built to understand **DTOs** and the separation between API models and internal models.

The project uses an in-memory `HashMap` for storage and Java `record`s for request and response DTOs.

## Endpoints

| Method | Endpoint    | Description      |
| ------ | ----------- | ---------------- |
| `POST` | `/students` | Create a student |
| `GET`  | `/students` | Get all students |

## Create Student

The client provides the student's name, email, and age. The ID is generated automatically.

### Request

```http
POST /students
Content-Type: application/json
```

```json
{
  "name": "John",
  "email": "john@example.com",
  "age": 22
}
```

### Response

```json
{
  "id": 1,
  "name": "John",
  "email": "john@example.com",
  "age": 22
}
```

## Get All Students

```http
GET /students
```

Example response:

```json
[
  {
    "id": 1,
    "name": "john",
    "email": "john@example.com",
    "age": 22
  },
  {
    "id": 2,
    "name": "Rahul",
    "email": "rahul@example.com",
    "age": 21
  }
]
```

## Structure

```text
Controller
    ↓
Service
    ↓
Repository
    ↓
HashMap
```

DTOs are used to separate the API request/response models from the `Student` model.

```text
StudentRequest  →  Student
Student         →  StudentResponse
```

The DTOs are implemented using Java `record`s.

## Concepts

* Spring Boot REST API
* Controller / Service / Repository structure
* Request DTO
* Response DTO
* Java records
* DTO mapping
* Constructor dependency injection
* `HashMap` for in-memory storage
* Automatic ID generation
* GET and POST requests
