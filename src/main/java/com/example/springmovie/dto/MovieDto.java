package com.example.springmovie.dto;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieDto {
    @NotNull
    private Integer movieId;


    @NotBlank(message = "provide a title")
    private String title;


    @NotBlank(message = "provide a genre")
    private String genre;


    @NotBlank(message = "provide a director")
    private String director;


    @NotNull
    private Integer releaseDate;


    @NotBlank(message = "Please provide movie's poster!")
    private String poster;

    @NotBlank(message = "Please provide poster's url!")
    private String posterUrl;


    private Set<String> movieCast;
}
