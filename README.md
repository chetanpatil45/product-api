# Product API - Spring Boot CRUD REST API

A simple **Product Management REST API** built using **Java**, **Spring Boot**, **Spring Data JPA**, and **MySQL**.
This project demonstrates complete CRUD operations following the **MVC Architecture**.

---

# 🚀 Features

* RESTful API development using Spring Boot
* CRUD Operations
* MVC Architecture
* MySQL Database Integration
* JPA Repository
* Lombok Integration
* Swagger API Documentation
* Postman API Testing

---

# 🛠️ Tech Stack

* **Java**
* **Spring Boot**
* **Spring Data JPA**
* **MySQL**
* **Lombok**
* **Swagger UI**
* **Maven**

---

# 📂 Project Structure

```bash
src
 └── main
      ├── java
      │    └── com.example.productapi
      │          ├── controller
      │          ├── service
      │          ├── model
      │          ├── repository
      │          └── ProductApiApplication.java
      │
      └── resources
           ├── application.properties
           └── ...
```

---

# ⚙️ MVC Architecture

This project follows the **MVC (Model View Controller)** design pattern.

| Layer               | Description                                     |
| ------------------- | ----------------------------------------------- |
| **Controller**      | Handles HTTP Requests & API Endpoints           |
| **Service**         | Contains business logic                         |
| **Model (Product)** | Represents database entity                      |
| **Repository**      | Handles database operations using JPARepository |

---

# 🗄️ Database Configuration

Update your `application.properties` file:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/productdb
spring.datasource.username=<username>
spring.datasource.password=<password>

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

server.port=8081
```

---

# ▶️ Run the Application

### Clone the repository

```bash
git clone https://github.com/bachchhavchetan45/product-api.git
```

### Navigate to project directory

```bash
cd product-api
```

### Run the project

```bash
mvn spring-boot:run
```

---

# 📌 CRUD Operations

| Operation  | Description             |
| ---------- | ----------------------- |
| **Create** | Add a new product       |
| **Read**   | Get product details     |
| **Update** | Update existing product |
| **Delete** | Delete product          |

---

# 🔗 API Endpoints

| Method   | Endpoint                   | Description          | Auth |
| :------- | :------------------------- | :------------------- | :--- |
| `POST`   | `/api/product/add`         | Add New Product      | No   |
| `GET`    | `/api/product/{id}`        | Get Product By ID    | No   |
| `GET`    | `/api/products`            | Get All Products     | No   |
| `PUT`    | `/api/product/update/{id}` | Update Product By ID | No   |
| `DELETE` | `/api/product/delete/{id}` | Delete Product By ID | No   |

---

# 📬 Sample Request Body - To create new Product

```json
{
  "name": "Laptop",
  "price": 55000,
  "quantity": 10
}
```

---

# 🧪 API Testing with Postman

### Add Product - POSTMAN

![Postman Screenshot](https://github.com/user-attachments/assets/424dcbaf-6685-44d7-8287-7443bdd120f5)

---

# 📖 Swagger UI - API Documentation

Access Swagger UI:

```bash
http://localhost:8080/swagger-ui/
```

![Swagger UI](https://github.com/user-attachments/assets/539b2d02-2514-4c76-8723-50fa701f9d9a)

---

# 📦 Dependencies Used

```xml
<dependencies>

    <!-- Spring Boot Starter Web -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <!-- Spring Boot Starter Data JPA -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>

    <!-- MySQL Driver -->
    <dependency>
        <groupId>com.mysql</groupId>
        <artifactId>mysql-connector-j</artifactId>
        <scope>runtime</scope>
    </dependency>

    <!-- Lombok -->
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <optional>true</optional>
    </dependency>

    <!-- Swagger/OpenAPI -->
    <dependency>
        <groupId>org.springdoc</groupId>
        <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
        <version>2.5.0</version>
    </dependency>

</dependencies>
```

---

# 👨‍💻 Author

Developed using Java & Spring Boot for learning and backend API development practice.

---

# ⭐ Future Improvements

* Add Validation
* Add Exception Handling
* Implement Authentication & Authorization
* Add Pagination & Sorting
* Dockerize the Application
* Deploy on Cloud

---

# 📄 License

This project is open-source and available under the **MIT License**.
