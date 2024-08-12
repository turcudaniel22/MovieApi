package com.example.springmovie.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Data
public class Movie {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer movieId;

    @Column(nullable = false, length = 200)
    @NotBlank(message = "Provide a title")
    private String title;

    @Column(nullable = false, length = 200)
    @NotBlank(message = "Provide a genre")
    private String genre;

    @Column(nullable = false, length = 200)
    @NotBlank(message = "Provide a director")
    private String director;

    @NotNull(message = "Provide a release date")
    private Integer releaseDate;

    @Column(nullable = false)
    @NotBlank(message = "Please provide the movie's poster!")
    private String poster;

    @ElementCollection
    @CollectionTable(name = "movie_cast")
    private Set<String> movieCast;
}
