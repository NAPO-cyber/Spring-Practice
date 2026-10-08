# User Registration API

A simple Spring Boot API built to practice request validation using Bean Validation.

## Endpoint

| Method | Endpoint          | Description         |
| ------ | ----------------- | ------------------- |
| `POST` | `/users/register` | Register a new user |

## Request

```http
POST /users/register
Content-Type: application/json
```

```json
{
  "username": "John",
  "email": "john@example.com",
  "password": "password123",
  "age": 22
}
```

## Validation Rules

| Field      | Rules                          |
| ---------- | ------------------------------ |
| `username` | Required, minimum 8 characters |
| `email`    | Required, valid email format   |
| `password` | Required, minimum 8 characters |
| `age`      | Minimum 18                     |

## Example Response

For a valid request:

```text
User registered successfully
```

For an invalid request, Spring returns a validation error response.

## Concepts

* Spring Boot REST API
* `@Valid`
* Bean Validation
* `@NotBlank`
* `@Size`
* `@Email`
* `@Min`
* Request DTO using Java `record`
* Request validation
