package com.example.springmovie.repositories;

// Import the necessary classes from Spring Data JPA and your entity
import com.example.springmovie.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

// This interface extends JpaRepository to provide CRUD operations for the Movie entity
public interface MovieRepository extends JpaRepository<Movie, Long> {
    // JpaRepository provides all the basic CRUD and pagination methods, no need to define them here
}
