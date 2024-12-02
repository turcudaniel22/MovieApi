# **🎥 Movie Management Application**  
[![Java](https://img.shields.io/badge/Java-17%2B-blue?logo=java)](https://www.oracle.com/java/)  
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-2.7-green?logo=springboot)](https://spring.io/projects/spring-boot)  
[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-14-blue?logo=postgresql)](https://www.postgresql.org/)  
[![React](https://img.shields.io/badge/React-18-blue?logo=react)](https://reactjs.org/)  
[![Tailwind CSS](https://img.shields.io/badge/Tailwind_CSS-3.3-blue?logo=tailwindcss)](https://tailwindcss.com/)  
[![MIT License](https://img.shields.io/badge/License-MIT-yellow?logo=opensourceinitiative)](LICENSE)  

🚀 Spring Boot MovieAPI Backend

The Spring Boot MovieAPI Backend is a powerful Java 17 application crafted to manage movie data efficiently. It prioritizes performance, security, and modularity, incorporating features like file handling, pagination, JWT authentication, and a three-layered architecture. Explore a seamless movie data experience with this backend! 🎥🍿

🚀 Technology Used:

☕ Java
🍃 Spring Boot
🌐 Spring MVC
🛢️ Spring Data JPA
📑 Pagination and Sorting
📁 File Handling
🔐 JWT Authentication
🐬 MySQL Database
🌟 Key Features

File Handling:

📁 Seamless media storage for efficient retrieval.
🖼️ Manages images and other movie-related assets.
Pagination:

🔍 Enhances data presentation.
🚀 Optimizes resource usage.
📑 Retrieves data in manageable chunks for improved performance.
JWT Authentication:

🔐 Prioritizes security.
🔑 Implements JSON Web Token (JWT) authentication.
🛡️ Ensures only authorized users access and interact with sensitive movie data.
Three-Layered Architecture:

🏗️ Modular codebase for maintainability and scalability.
🎯 Separation into presentation, business logic, and data access layers.
🔍 Facilitates easier debugging, testing, and future enhancements.
🚀 MovieAPI Endpoints

🔗 Add Movie:

POST http://localhost:8080/api/v1/movie/add-movie
🔍 Get All Movies:

GET http://localhost:8080/api/v1/movie/all
🔍 Get Movie by ID:

GET http://localhost:8080/api/v1/movie/1
📁 Get Profile Picture:

GET http://localhost:8080/file/profile-pic
🔄 Update Movie by ID:

PUT http://localhost:8080/api/v1/movie/update/1
❌ Delete Movie by ID:

DELETE http://localhost:8080/api/v1/movie/delete/2
📑 Get Movies with Pagination:

GET http://localhost:8080/api/v1/movie/allMoviesPage?pageNumber=0&pageSize=2
📑 Get Movies with Sorting:

GET http://localhost:8080/api/v1/movie/allMoviesPageSort?sortBy=title
📝 User Registration:

POST http://localhost:8080/api/v1/auth/register
🔒 User Login:

POST http://localhost:8080/api/v1/auth/login
🚀 Cloning the Project

To kickstart your journey with the MovieAPI project, follow these simple steps:

Clone the Repository:

git clone https://github.com/Vikashkatiyar/Movie_Api_Backend.git
Navigate to the Project Directory:

cd Movie_Api_Backend
Configure Application Properties:

Open src/main/resources/application.properties.
Modify the database connection details to match your MySQL setup.
Create MySQL Database:

Execute the SQL script provided in src/main/resources/sql-scripts to set up the necessary database tables.
mysql -u your_username -p < create_database.sql
Build and Run the Application:

Using Maven:
./mvnw clean install
./mvnw spring-boot:run
Access the API Endpoints:

Once the application is running, explore the MovieAPI by accessing the defined endpoints.
Now you're all set! Dive into the MovieAPI project, manage movie-related data effortlessly, and feel free to contribute or report issues. Happy coding! 🎬🍿

🌟 Project Author

Daniel

📧 Email: turcudanieli22@gmail.com

Feel free to reach out to the author for any inquiries, feedback, or collaboration opportunities related to the MovieAPI project. Your input is valuable! 🚀
