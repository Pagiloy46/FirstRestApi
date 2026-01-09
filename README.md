Product REST API – Task 2
Project Overview

This project is a RESTful API for product management implemented using Spring Boot.
The application was developed step by step according to Task 2 (A–H) from the provided PDF file.

The goal of this task was to gradually build a REST API with:
REST endpoints
Swagger documentation
Validation and exception handling
CRUD operations
Database integration
Final testing
Technologies Used
Java
Spring Boot
Spring Web
Spring Validation
Swagger (OpenAPI 3)
H2 Database
Maven

TASK 2.A – Creating the Base REST Application

At this stage, a basic Spring Boot REST application was created.
Implemented:
Spring Boot project initialization
Basic package structure:
api
service
repisitory
domain
support
Basic REST controller
Application successfully starts on port 8080

TASK 2.B – Adding Swagger UI

Swagger (OpenAPI 3) was added to document and test the REST API.

Result:
Automatic API documentation generated
Interactive UI for testing endpoints
Swagger UI is available at:
http://localhost:8080/swagger-ui/index.html
<img width="1919" height="1048" alt="Знімок екрана 2026-01-09 154717" src="https://github.com/user-attachments/assets/29aece33-f39d-4667-8965-7b0e2a88f639" />
<img width="2539" height="1308" alt="Знімок екрана 2026-01-09 154843" src="https://github.com/user-attachments/assets/c017492c-e300-49e8-91ce-601a1dc2f2b9" />
<img width="2553" height="1140" alt="Знімок екрана 2026-01-09 154851" src="https://github.com/user-attachments/assets/5d9a37de-9222-4d5a-b73d-f5127157296d" />

TASK 2.C – Adding Another Endpoint

An additional REST endpoint was implemented to retrieve a product by its ID.

Endpoint:
GET /api/v1/products/{id}
Behavior:
Returns product if it exists
Returns 400 NOT FOUND if the product does not exist
<img width="1919" height="1022" alt="Знімок екрана 2026-01-09 183747" src="https://github.com/user-attachments/assets/cec05e9d-7f6c-4a9a-bc46-9ab0a1d10e64" />
<img width="2558" height="1186" alt="Знімок екрана 2026-01-09 160031" src="https://github.com/user-attachments/assets/2f1a8f50-bad0-4e32-8f3b-53068b8b6d80" />

TASK 2.D – Exception Handling

Global exception handling was implemented using @RestControllerAdvice.

Implemented:
Custom exception ProductNotFoundException
Centralized exception handling
Consistent error responses

Error response example:
HTTP Status: 404
JSON body with:
error message
timestamp
<img width="2545" height="1319" alt="Знімок екрана 2026-01-09 184123" src="https://github.com/user-attachments/assets/5ba8fb47-4182-4bc8-9fa5-84abc4f1b8db" />

TASK 2.E – Adding the PUT Method

The PUT method was added to update an existing product.

Endpoint:
PUT /api/v1/products/{id}

Behavior:
Updates product name
Returns updated product
Returns 404 NOT FOUND if product does not exist

I connected this task with F, so you can see screenshots over there.

TASK 2.F – Adding GET ALL and DELETE Methods

Two additional endpoints were implemented.

Get all products:
GET /api/v1/products
Returns a list of all products.

Delete product:
DELETE /api/v1/products/{id}
Deletes product by ID.

If the product does not exist, a 404 NOT FOUND error is returned.
<img width="2554" height="1302" alt="Знімок екрана 2026-01-09 185330" src="https://github.com/user-attachments/assets/ba61b98a-2017-4c79-90fe-4f0c1390159a" />
<img width="2554" height="1338" alt="Знімок екрана 2026-01-09 185411" src="https://github.com/user-attachments/assets/79d3b641-c808-40cd-bd22-b6d3ae8ae04e" />
<img width="2554" height="1328" alt="Знімок екрана 2026-01-09 185421" src="https://github.com/user-attachments/assets/0c0e41ee-3e84-45e3-8f4f-c7c98d10df5f" />

TASK 2.G – Adding a Database

An H2 in-memory database was added to persist product data.

Configuration:
H2 Console enabled
JDBC URL: jdbc:h2:mem:testdb
Username: sa
Password: (empty)
H2 Console available at:
http://localhost:8080/h2-console

The database stores product data and reflects all CRUD operations.
<img width="745" height="522" alt="Знімок екрана 2026-01-09 191312" src="https://github.com/user-attachments/assets/09d69994-b6f9-466f-9c83-5c1748611f0b" />
<img width="2556" height="1179" alt="Знімок екрана 2026-01-09 191657" src="https://github.com/user-attachments/assets/beb08856-ca3a-4ac3-ab61-185072416e73" />

TASK 2.H – Final Tests

At the final stage, the application was tested using Swagger UI and H2 Console.

Tested operations:
CREATE product (POST)
UPDATE product (PUT)
DELETE product (DELETE)

Database changes were verified using:

SELECT * FROM PRODUCTS;

This confirms that REST operations correctly modify database records.
<img width="2546" height="485" alt="Знімок екрана 2026-01-09 192321" src="https://github.com/user-attachments/assets/5f25bca8-4584-4915-8ffd-efa0631c391d" />
<img width="2553" height="1315" alt="Знімок екрана 2026-01-09 192418" src="https://github.com/user-attachments/assets/b3608377-d7f6-4069-9d01-5894f1654af0" />
<img width="2557" height="823" alt="Знімок екрана 2026-01-09 192424" src="https://github.com/user-attachments/assets/1bac1c49-430a-4493-9bc0-e364c83d3043" />
<img width="2558" height="1255" alt="Знімок екрана 2026-01-09 192453" src="https://github.com/user-attachments/assets/7422227b-b862-4c97-9e7a-742549150eae" />
<img width="2557" height="874" alt="Знімок екрана 2026-01-09 192504" src="https://github.com/user-attachments/assets/08d59d12-25d6-4967-b75c-bbeceb4ae261" />

Final Conclusion

All tasks from Task 2.A to Task 2.H were successfully completed according to the PDF requirements.
The project demonstrates a complete REST API with documentation, validation, exception handling, database integration, and final testing.
