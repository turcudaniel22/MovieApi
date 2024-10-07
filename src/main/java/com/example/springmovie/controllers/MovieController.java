package com.example.springmovie.controllers;

// Import necessary classes and annotations
import com.example.springmovie.dto.MovieDto;
import com.example.springmovie.service.MovieService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController // Marks the class as a REST controller that handles HTTP requests
@RequestMapping("/api/v1/movie") // Base path for all routes in this controller (e.g., "/api/v1/movie")
public class MovieController {

    private final MovieService movieService; // Service to handle movie-related business logic

    // Constructor-based dependency injection to initialize movieService
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    // Endpoint for adding a new movie with a poster image
    @PostMapping("/add-movie")
    public ResponseEntity<MovieDto> addMovieHandler(@RequestPart MultipartFile file,
                                                    @RequestPart String movieDto) throws IOException {
        // Converts the JSON string into a MovieDto object
        MovieDto dto = convertToMovieDto(movieDto);
        // Calls the movieService to add the movie and returns the created movie along with HTTP status 201 (CREATED)
        return new ResponseEntity<>(movieService.addMovie(dto, file), HttpStatus.CREATED);
    }

    // Endpoint for retrieving a movie by its ID
    @GetMapping("/{movieId}")
    public ResponseEntity<MovieDto> getMovieHandler(@PathVariable Integer movieId) {
        // Fetches the movie by ID and returns it with HTTP status 200 (OK)
        return ResponseEntity.ok(movieService.getMovie(movieId));
    }

    // Endpoint to retrieve all movies, allowing cross-origin requests from a specific origin (React app on localhost)
    @CrossOrigin(origins = "http://localhost:5173") // Allow requests from React app
    @GetMapping("/all")
    public ResponseEntity<List<MovieDto>> getAllMovieHandler() throws IOException {
        // Fetches and returns a list of all movies with HTTP status 200 (OK)
        return ResponseEntity.ok(movieService.getAllMovies());
    }

    // Endpoint for updating a movie's details by its ID, with an optional new poster image
    @PutMapping("/update-movie/{movieId}")
    public ResponseEntity<MovieDto> updateMovieHandler(@PathVariable Integer movieId,
                                                       @RequestBody MultipartFile file,
                                                       @RequestPart String movieDtoObj) throws IOException {
        // If no new file is provided, keep the existing file as null
        if(file.isEmpty()) file = null;
        // Converts the JSON string into a MovieDto object
        MovieDto movieDto = convertToMovieDto(movieDtoObj);
        // Calls the movieService to update the movie and returns the updated movie with HTTP status 200 (OK)
        return ResponseEntity.ok(movieService.updateMovie(movieDto, movieId, file));
    }

    // Endpoint for deleting a movie by its ID
    @DeleteMapping("/delete/{movieId}")
    public ResponseEntity<String> deleteMovieHandler(@PathVariable Integer movieId) throws IOException {
        // Deletes the movie and returns a success message with HTTP status 200 (OK)
        return ResponseEntity.ok(movieService.deleteMovie(movieId));
    }

    // Private helper method to convert a JSON string to a MovieDto object using Jackson ObjectMapper
    private MovieDto convertToMovieDto(String movieDtoObj) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        // Deserialize the JSON string into a MovieDto object
        return objectMapper.readValue(movieDtoObj, MovieDto.class);
    }
}
