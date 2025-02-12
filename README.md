If you're not using a database and instead using a `Map` for in-memory storage, you can update the `README.md` to reflect that. Here's the revised version of the `README.md` for your project:

---

# Order Management System with Ports and Adapters Architecture

This is a Spring Boot application that demonstrates the **Ports and Adapters** (Hexagonal) architecture. The application manages orders and provides a REST API for creating and retrieving orders. It uses a clean separation of concerns between the core business logic (domain), external interfaces (ports), and technology-specific implementations (adapters). Instead of a database, it uses an in-memory `Map` for storing orders.

---

## Table of Contents
1. [Features](#features)
2. [Technologies Used](#technologies-used)
3. [Project Structure](#project-structure)
4. [Setup and Installation](#setup-and-installation)
5. [Running the Application](#running-the-application)
6. [API Documentation](#api-documentation)
7. [Testing](#testing)
8. [Contributing](#contributing)

---

## Features
- **Ports and Adapters Architecture**: Clean separation of business logic from external systems.
- **REST API**: Exposes endpoints for creating and retrieving orders.
- **In-Memory Storage**: Uses a `Map` for storing orders (no database required).
- **Layered Design**: Domain, application, and infrastructure layers are clearly separated.
- **Testable**: Core business logic can be tested in isolation using mock adapters.

---

## Technologies Used
- **Spring Boot**: Backend framework for building the application.
- **Maven**: Build and dependency management.
- **Lombok**: Reduces boilerplate code (optional).
- **REST API**: Exposes endpoints for order management.

---

## Project Structure
The project follows a clean architecture with the following structure:

```
src/main/java/com/example/order
├── OrderApplication.java              # Main application class
├── application
│   └── OrderService.java              # Application service layer
├── domain
│   └── Order.java                     # Domain model (Order entity)
├── ports
│   ├── OrderRepository.java           # Port for order persistence
│   └── OrderNotifier.java             # Port for order notifications
└── adapters
    ├── rest
    │   └── OrderController.java       # REST adapter (primary adapter)
    ├── database
    │   └── OrderRepositoryImpl.java   # In-memory storage adapter (Map-based)
    └── notifications
        └── ConsoleOrderNotifier.java  # Notification adapter (secondary adapter)
```

---

## Setup and Installation

### Prerequisites
- Java 17 or later
- Maven 3.x
- VS Code or any IDE with Java support

### Steps
1. **Clone the repository**:
   ```bash
   git clone https://github.com/your-username/order-management-system.git
   cd order-management-system
   ```

2. **Build the project**:
   ```bash
   ./mvnw clean install
   ```

3. **Run the application**:
   ```bash
   ./mvnw spring-boot:run
   ```

4. Access the application at `http://localhost:8080`.

---

## Running the Application
1. Start the application:
   ```bash
   ./mvnw spring-boot:run
   ```

2. Use **Postman** or **curl** to interact with the API:
   - **Create an Order**:
     ```bash
     curl -X POST -H "Content-Type: application/json" -d '{"id":"1","productName":"Laptop","quantity":1}' http://localhost:8080/orders
     ```
   - **Get an Order**:
     ```bash
     curl http://localhost:8080/orders/1
     ```

3. Check the console logs for notifications:
   ```
   Notification: Order created for product - Laptop
   ```

---

## API Documentation
### Endpoints
- **POST /orders**: Create a new order.
  - Request Body:
    ```json
    {
      "id": "1",
      "productName": "Laptop",
      "quantity": 1
    }
    ```
  - Response: HTTP 200 (Success).

- **GET /orders/{id}**: Retrieve an order by ID.
  - Response:
    ```json
    {
      "id": "1",
      "productName": "Laptop",
      "quantity": 1
    }
    ```

---

## Testing
### Unit Tests
- Run unit tests for the `OrderService`:
  ```bash
  ./mvnw test
  ```

### Integration Tests
- Integration tests for the `OrderController` and `OrderRepositoryImpl` are included. Run them using:
  ```bash
  ./mvnw verify
  ```

---

## Contributing
Contributions are welcome! If you'd like to contribute, please follow these steps:
1. Fork the repository.
2. Create a new branch (`git checkout -b feature/your-feature-name`).
3. Commit your changes (`git commit -m 'Add some feature'`).
4. Push to the branch (`git push origin feature/your-feature-name`).
5. Open a pull request.

---


## Acknowledgments
- Inspired by **Alistair Cockburn's** Hexagonal Architecture.
- Built with ❤️ using **Spring Boot**.

---