# Book API

A small Spring Boot CRUD API built to practice CRUD operations and `ResponseEntity`.

## Base Path

```text
/books
```

## Endpoints

| Method   | Endpoint      | Description         |
| -------- | ------------- | ------------------- |
| `POST`   | `/books`      | Create a book       |
| `GET`    | `/books`      | Get all books       |
| `GET`    | `/books/{id}` | Get a book by ID    |
| `PUT`    | `/books/{id}` | Update a book       |
| `DELETE` | `/books/{id}` | Delete a book by ID |
| `DELETE` | `/books`      | Delete all books    |

## Example Request

### POST `/books`

```json
{
  "title": "Clean Code",
  "author": "Robert C. Martin"
}
```

Example response:

```json
{
  "id": 1,
  "title": "Clean Code",
  "author": "Robert C. Martin"
}
```

## HTTP Response Statuses

The API uses `ResponseEntity` to control the HTTP response.

| Status           | Usage                      |
| ---------------- | -------------------------- |
| `200 OK`         | Successful GET/PUT request |
| `201 CREATED`    | Book successfully created  |
| `204 NO CONTENT` | Successful DELETE          |
| `404 NOT FOUND`  | Book does not exist        |

## Concepts Covered

* CRUD operations
* `@RestController`
* `@RequestMapping`
* `@GetMapping`
* `@PostMapping`
* `@PutMapping`
* `@DeleteMapping`
* `@PathVariable`
* `@RequestBody`
* `ResponseEntity`
* HTTP status codes
* Controller → Service → Repository
* In-memory storage using `HashMap`

## Technologies

* Java
* Spring Boot
* Maven
* HashMap
