# **🎥 Movie Management Application**  
[![Java](https://img.shields.io/badge/Java-17%2B-blue?logo=java)](https://www.oracle.com/java/)  
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-2.7-green?logo=springboot)](https://spring.io/projects/spring-boot)  
[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-14-blue?logo=postgresql)](https://www.postgresql.org/)  
[![React](https://img.shields.io/badge/React-18-blue?logo=react)](https://reactjs.org/)  
[![Tailwind CSS](https://img.shields.io/badge/Tailwind_CSS-3.3-blue?logo=tailwindcss)](https://tailwindcss.com/)  
[![MIT License](https://img.shields.io/badge/License-MIT-yellow?logo=opensourceinitiative)](LICENSE)  

This is a full-stack Movie Management application with a backend built using Spring Boot and a frontend developed with React. The application allows users to manage movies, including adding, searching, and viewing movie details.

---

## **🗂️ Table of Contents**
1. [✨ Features](#-features)  
2. [🛠️ Technologies Used](#-technologies-used)  
3. [📋 Prerequisites](#-prerequisites)  
4. [⚙️ Backend Installation](#️-backend-installation)  
5. [🛠️ Backend Configuration](#-backend-configuration)  
6. [🔗 Backend API Endpoints](#-backend-api-endpoints)  
7. [💻 Frontend Installation](#-frontend-installation)  
8. [🚀 Running the Application](#-running-the-application)  
9. [🤝 Contributing](#-contributing)  
10. [📄 License](#-license)  

---

## **✨ Features**  
- **🔒 User Authentication**: Login to manage movies.  
- **🔎 Search Functionality**: Search movies by genre, release year, or actor.  
- **📱 Responsive Design**: Works well on desktop and mobile devices.  
- **🌐 RESTful API**: Efficient backend service for managing movie data.  

---

## **🛠️ Technologies Used**  

### **Backend**  
- [![Java](https://img.shields.io/badge/Java-17%2B-blue?logo=java)](https://www.oracle.com/java/)  
- [![Spring Boot](https://img.shields.io/badge/Spring_Boot-2.7-green?logo=springboot)](https://spring.io/projects/spring-boot)  
- **Spring Data JPA**: For data access and management  
- [![PostgreSQL](https://img.shields.io/badge/PostgreSQL-14-blue?logo=postgresql)](https://www.postgresql.org/)  

### **Frontend**  
- [![React](https://img.shields.io/badge/React-18-blue?logo=react)](https://reactjs.org/)  
- [![Tailwind CSS](https://img.shields.io/badge/Tailwind_CSS-3.3-blue?logo=tailwindcss)](https://tailwindcss.com/)  
- **React Router**: For handling navigation  

---

## **📋 Prerequisites**  

### **Backend**  
- [![Java](https://img.shields.io/badge/Java-17%2B-blue?logo=java)](https://www.oracle.com/java/)  
- [![PostgreSQL](https://img.shields.io/badge/PostgreSQL-14-blue?logo=postgresql)](https://www.postgresql.org/)  
- [![Maven](https://img.shields.io/badge/Maven-3.9-orange?logo=apachemaven)](https://maven.apache.org/)  

### **Frontend**  
- [![Node.js](https://img.shields.io/badge/Node.js-18+-blue?logo=nodedotjs)](https://nodejs.org/)  
- **Create React App** (optional, if you want to create a new project)  

---

## **⚙️ Backend Installation**  

1. **Clone the Repository**:  
   ```bash  
   git clone <repository-url>  
   cd backend  
#Set Up Your PostgreSQL Database:
#Create a new database (e.g., movie_management).
#Update the database configuration in src/main/resources/application.yml:
spring:  
  datasource:  
    url: jdbc:postgresql://localhost:5432/movie_management  
    username: your_username  
    password: your_password  
#Build the Project:
mvn clean install  
Run the Application:
mvn spring-boot:run  
#The application will start on http://localhost:8080.
🔗 Backend API Endpoints

#Movies

#🎬 Get All Movies

Method: GET
Endpoint: /api/v1/movie/all
Description: Fetches a list of all movies.
🔍 Search Movies

Method: POST
Endpoint: /api/v1/movie/search
Description: Searches for movies based on category and keyword.
Request Body:
{  
  "category": "genre",  
  "keyword": "Action"  
}  
💻 Frontend Installation

Navigate to Frontend Directory:
cd frontend  
Install Dependencies:
npm install  
Start the Development Server:
npm start  
The frontend application will run on http://localhost:3000.
🚀 Running the Application

Backend: Ensure PostgreSQL is running and start the backend server using Maven.
Frontend: Start the React development server with npm start.
🤝 Contributing

Contributions are welcome! Please follow these steps:

Fork the repository.
Create a new branch: git checkout -b feature-branch-name.
Commit your changes: git commit -m 'Add some feature'.
Push to the branch: git push origin feature-branch-name.
Submit a pull request.
📄 License

This project is licensed under the MIT License. Feel free to use, modify, and distribute this project as needed.

