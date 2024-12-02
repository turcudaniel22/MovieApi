# 🚀 **Spring Boot MovieAPI Backend**

![Java](https://img.shields.io/badge/Java-17-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.5.6-brightgreen)
![MySQL](https://img.shields.io/badge/MySQL-8.0-blue)
![License](https://img.shields.io/badge/License-MIT-yellowgreen)
![Maven](https://img.shields.io/badge/Maven-3.8.1-orange)
![Issues](https://img.shields.io/github/issues/Vikashkatiyar/Movie_Api_Backend?color=yellow)

The Spring Boot MovieAPI Backend is a powerful Java 17 application crafted to manage movie data efficiently. It prioritizes performance, security, and modularity, incorporating features like file handling, pagination, JWT authentication, and a three-layered architecture. Explore a seamless movie data experience with this backend! 🎥🍿

---

## 🌐 **Technology Used**

- ☕ **Java 17**
- 🍃 **Spring Boot**
- 🌐 **Spring MVC**
- 🛢️ **Spring Data JPA**
- 📑 **Pagination and Sorting**
- 📁 **File Handling**
- 🔐 **JWT Authentication**
- 🐬 **PostgressSql Database**

---

## 🌟 **Key Features**

### **File Handling**
- 📁 Seamless media storage for efficient retrieval.
- 🖼️ Manages images and other movie-related assets.

### **Pagination**
- 🔍 Enhances data presentation.
- 🚀 Optimizes resource usage.
- 📑 Retrieves data in manageable chunks for improved performance.

### **JWT Authentication**
- 🔐 Prioritizes security.
- 🔑 Implements JSON Web Token (JWT) authentication.
- 🛡️ Ensures only authorized users access and interact with sensitive movie data.

### **Three-Layered Architecture**
- 🏗️ Modular codebase for maintainability and scalability.
- 🎯 Separation into presentation, business logic, and data access layers.
- 🔍 Facilitates easier debugging, testing, and future enhancements.

---

## 🚀 **MovieAPI Endpoints**

### **🔗 Add Movie**
- **Method**: POST  
- **Endpoint**: `http://localhost:8080/api/v1/movie/add-movie`

### **🔍 Get All Movies**
- **Method**: GET  
- **Endpoint**: `http://localhost:8080/api/v1/movie/all`

### **🔍 Get Movie by ID**
- **Method**: GET  
- **Endpoint**: `http://localhost:8080/api/v1/movie/{id}`

### **📁 Get Profile Picture**
- **Method**: GET  
- **Endpoint**: `http://localhost:8080/file/profile-pic`

### **🔄 Update Movie by ID**
- **Method**: PUT  
- **Endpoint**: `http://localhost:8080/api/v1/movie/update/{id}`

### **❌ Delete Movie by ID**
- **Method**: DELETE  
- **Endpoint**: `http://localhost:8080/api/v1/movie/delete/{id}`

### **📑 Get Movies with Pagination**
- **Method**: GET  
- **Endpoint**: `http://localhost:8080/api/v1/movie/allMoviesPage?pageNumber=0&pageSize=2`

### **📑 Get Movies with Sorting**
- **Method**: GET  
- **Endpoint**: `http://localhost:8080/api/v1/movie/allMoviesPageSort?sortBy=title`

### **📝 User Registration**
- **Method**: POST  
- **Endpoint**: `http://localhost:8080/api/v1/auth/register`

### **🔒 User Login**
- **Method**: POST  
- **Endpoint**: `http://localhost:8080/api/v1/auth/login`

---

## 🚀 **Cloning the Project**

To kickstart your journey with the MovieAPI project, follow these simple steps:


🌍 Access the API Endpoints

Once the application is running, you can explore the MovieAPI by accessing the defined endpoints.

🤝 Contributing


This project is licensed under the MIT License. Feel free to use, modify, and distribute this project as needed.

🌟 Project Author

Daniel
📧 Email: turcudanieli22@gmail.com
