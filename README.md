# Movie Management Application

This is a full-stack Movie Management application with a backend built using **Spring Boot** and a frontend developed with **React**. The application allows users to manage movies, including adding, searching, and viewing movie details.

## Table of Contents

1. [Features](#features)
2. [Technologies Used](#technologies-used)
3. [Prerequisites](#prerequisites)
4. [Backend Installation](#backend-installation)
5. [Backend Configuration](#backend-configuration)
6. [Backend API Endpoints](#backend-api-endpoints)
7. [Frontend Installation](#frontend-installation)
8. [Frontend Usage](#frontend-usage)
9. [Running the Application](#running-the-application)
10. [Contributing](#contributing)
11. [License](#license)

## Features

- **User Authentication**: Login to manage movies.
- **Search Functionality**: Search movies by genre, release year, or actor.
- **Responsive Design**: Works well on desktop and mobile devices.
- **RESTful API**: Efficient backend service for managing movie data.

## Technologies Used

### Backend
- **Java**: Version 17 or later
- **Spring Boot**: Framework for building the application
- **Spring Data JPA**: For data access and management
- **PostgreSQL**: Database for storing movie data

### Frontend
- **React**: JavaScript library for building user interfaces
- **Tailwind CSS**: Utility-first CSS framework for styling
- **React Router**: For handling navigation

## Prerequisites

### Backend
Make sure you have the following installed:
- [JDK 17](https://openjdk.java.net/install/) or later
- [PostgreSQL](https://www.postgresql.org/download/) database server
- [Maven](https://maven.apache.org/install.html)

### Frontend
- [Node.js](https://nodejs.org/en/download/) (for npm)
- [Create React App](https://create-react-app.dev/docs/getting-started/) (optional, if you want to create a new project)

## Backend Installation

1. **Clone the Repository**:

   ```bash
   git clone <repository-url>
   cd backend
Set Up Your PostgreSQL Database:

Create a new database (e.g., movie_management).

Update the database configuration in src/main/resources/application.yml:
spring:
datasource:
url: jdbc:postgresql://localhost:5432/movie_management
username: your_username
password: your_password
Build the Project:
mvn clean install
Run the Application:
mvn spring-boot:run
The application will start on http://localhost:8080
Backend Configuration
You can configure your application in src/main/resources/application.yml. Modify settings like database connections and logging levels here.
spring:
jpa:
database: POSTGRESQL
show-sql: true
hibernate:
ddl-auto: update

datasource:
driverClassName: org.postgresql.Driver
url: jdbc:postgresql://localhost:5432/movie_management
username: your_username
password: your_password
Backend API Endpoints
Movies
Get All Movies

Method: GET
Endpoint: /api/v1/movie/all
Description: Fetches a list of all movies.
Search Movies

Method: POST
Endpoint: /api/v1/movie/search
Description: Searches for movies based on category and keyword.
{
"category": "genre",
"keyword": "Action"
}
[
{
"movieId": 1,
"title": "Action Movie",
"genre": "Action",
"director": "John Doe",
"releaseDate": "2024-08-14",
"poster": "http://example.com/poster.jpg",
"movieCast": ["Jane Smith", "John Johnson"]
}
]
