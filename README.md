# Product API

- Created by Java & Spring Boot.
- Maintained MVC (Model View Controller) architecture - **Controller, Service & Product**.
- Used Lombok & Swagger for API Documentation.
- Use JPARepository and MySQL for database.

### CRUD Operations
- **Create :** create resource
- **Read   :** read resource
- **Update :** update 
- **Delete :** delete


### API Endpoints

- `/api/product/add`           - Add product.
- `/api/product/{id}`          - Get product by ID.
- `/api/products`              - Get All products.
- `/api/product/update/{id}`   - Update product with it's ID.
- `/api/product/delete/{id}`   - Delete product with it's ID.


| Method | Endpoint | Description | Auth |
| :--- | :--- | :--- | :--- |
| `GET` | `/api/product/add` | Add New product. | Yes |
| `GET` | `/api/product/{id}` | Get Product by Id. | No |
| `POST` | `/api/products` | Get All Products | Admin |
| `PUT` | `/api/product/update/{id}` | Update Product with it's Id. | Admin |
| `DELETE` | `/api/product/delete/{id}` | Delete Product by it's Id. | Admin |


   
### Add Product - POSTMAN
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/424dcbaf-6685-44d7-8287-7443bdd120f5" />
