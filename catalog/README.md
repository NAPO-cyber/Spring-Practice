# Product Catalog API

A simple Spring Boot REST API for managing products using an in-memory `HashMap`.

Product IDs are automatically generated, so the user only needs to provide the product name.

## Endpoints

| Method | Endpoint                 | Description         |
| ------ | ------------------------ | ------------------- |
| GET    | `/catalog/products`      | Get all products    |
| GET    | `/catalog/products/{id}` | Get a product by ID |
| POST   | `/catalog/products`      | Create a product    |
| DELETE | `/catalog/products/{id}` | Delete a product    |

## Create Product

### Request

```http
POST /catalog/products
Content-Type: application/json
```

```json
{
  "name": "Keyboard"
}
```

The ID is generated automatically.

### Response

```json
{
  "id": 1,
  "name": "Keyboard"
}
```

## Get All Products

```http
GET /catalog/products
```

Example response:

```json
[
  {
    "id": 1,
    "name": "Keyboard"
  },
  {
    "id": 2,
    "name": "Mouse"
  }
]
```

## Get Product by ID

```http
GET /catalog/products/1
```

## Delete Product

```http
DELETE /catalog/products/1
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

## Concepts

* Spring Boot REST API
* Controller / Service / Repository structure
* `HashMap` for in-memory storage
* Constructor dependency injection
* Automatic ID generation
* GET, POST and DELETE requests
