package com.example.springmovie.service;

// Import necessary classes for handling movie data and files
import com.example.springmovie.dto.MovieDto;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

// Interface for movie-related business logic
public interface MovieService {

    // Adds a new movie to the system
    // Takes a MovieDto containing movie details and a MultipartFile for the movie poster
    // Returns the created MovieDto object, throws IOException for file handling issues
    MovieDto addMovie(MovieDto movieDto, MultipartFile file) throws IOException;

    // Retrieves a specific movie by its ID
    // Takes the movieId as a parameter and returns the corresponding MovieDto
    MovieDto getMovie(Integer movieId);

    // Retrieves a list of all movies in the system
    // Returns a list of MovieDto objects, throws IOException for any file access issues
    List<MovieDto> getAllMovies() throws IOException;

    // Updates the movie details for a specific movie
    // Takes a MovieDto with updated details, the movieId of the movie to be updated, and an optional MultipartFile for the new poster
    // Returns the updated MovieDto object, throws IOException for file handling issues
    MovieDto updateMovie(MovieDto movieDto, Integer movieId, MultipartFile file) throws IOException;

    // Deletes a specific movie from the system
    // Takes the movieId as a parameter and returns a string message confirming deletion
    // Throws IOException for file access issues
    String deleteMovie(Integer movieId) throws IOException;

}
