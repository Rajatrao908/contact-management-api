# 📇 Contact Management API

A RESTful API built using Spring Boot to manage contacts with full CRUD operations, search functionality, and secure access.

---

## 🚀 Features

* Create, Read, Update, Delete contacts
* Search contacts by:

  * First Name
  * Last Name
  * Email
* Secure APIs using **Spring Security (Basic Auth)**
* API documentation using **Swagger (OpenAPI)**
* Integrated **CI/CD using GitHub Actions**

---

## 🛠 Tech Stack

* Java 8
* Spring Boot 2.7
* Spring Data JPA
* Spring Security
* H2 / MySQL
* Swagger (Springdoc OpenAPI)
* GitHub Actions (CI/CD)

---

## 🔐 Authentication

* Basic Authentication

```
Username: admin  
Password: admin123
```

---

## 📌 API Endpoints

| Method | Endpoint                         | Description       |
| ------ | -------------------------------- | ----------------- |
| POST   | /api/contacts                    | Create contact    |
| GET    | /api/contacts                    | Get all contacts  |
| GET    | /api/contacts/{id}               | Get contact by ID |
| PUT    | /api/contacts/{id}               | Update contact    |
| DELETE | /api/contacts/{id}               | Delete contact    |
| GET    | /api/contacts/search?keyword=abc | Search contacts   |

---

## 📄 Swagger UI

Access API documentation:

👉 http://localhost:1000/swagger-ui.html

---

## ▶️ How to Run

### 1. Clone the repository

```bash
git clone https://github.com/Rajatrao908/contact-management-api.git
```

### 2. Navigate to project

```bash
cd contact-management-api
```

### 3. Run the application

```bash
mvn spring-boot:run
```

---

## ⚙️ CI/CD Pipeline

* Implemented using **GitHub Actions**
* Automatically builds the project on every push
* Ensures code quality and build success

---

## 📌 Author

**Rajat Rao**

