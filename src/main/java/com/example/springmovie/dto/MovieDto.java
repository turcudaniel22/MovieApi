package com.example.springmovie.dto;

// Import necessary annotations and classes for validation and data mapping
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data // Lombok annotation to automatically generate getter, setter, equals, hashCode, and toString methods
@NoArgsConstructor // Lombok annotation to generate a no-arguments constructor
@AllArgsConstructor // Lombok annotation to generate a constructor with all class fields as parameters
public class MovieDto {

    @NotNull // Validation annotation to ensure this field cannot be null
    private Integer movieId; // Unique identifier for the movie

    @NotBlank(message = "Provide a title") // Ensures that this string is not null or blank (non-empty and non-whitespace)
    private String title; // Title of the movie

    @NotBlank(message = "Provide a genre") // Ensures that the genre is provided and not blank
    private String genre; // Genre of the movie

    @NotBlank(message = "Provide a director") // Ensures that the director field is not blank
    private String director; // Director of the movie

    @NotNull // Ensures that the release date is provided and not null
    private Integer releaseDate; // Release year of the movie

    @NotBlank(message = "Please provide the movie's poster!") // Ensures that the poster file name or description is provided
    private String poster; // Name or file reference for the movie's poster

    @NotBlank(message = "Please provide the poster's URL!") // Ensures that the URL for the poster is provided and not blank
    private String posterUrl; // URL where the movie's poster is hosted

    // A set of movie cast members, representing actors or characters in the movie
    private Set<String> movieCast;
}
