package com.example.springmovie.service;

import com.example.springmovie.dto.MovieDto;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface MovieService {




    MovieDto addMovie(MovieDto movieDto, MultipartFile file) throws IOException;


    MovieDto getMovie(Integer movieId);

    List<MovieDto> getAllMovies() throws IOException;

    MovieDto updateMovie(MovieDto movieDto, Integer movieId , MultipartFile file) throws IOException;


    String deleteMovie(Integer movieId) throws IOException;


}
