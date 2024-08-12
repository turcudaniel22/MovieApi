package com.example.springmovie.service;

import com.example.springmovie.dto.MovieDto;
import com.example.springmovie.entities.Movie;
import com.example.springmovie.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;
    private final FileService fileService;

    @Value("${project.poster}")
    private String path;

    @Value("${base.url}")
    private String baseUrl;

    public MovieServiceImpl(MovieRepository movieRepository, FileService fileService) {
        this.movieRepository = movieRepository;
        this.fileService = fileService;
    }

    @Override
    public MovieDto addMovie(MovieDto movieDto, MultipartFile file) throws IOException {
        // 1. Check if file already exists
        Path filePath = Paths.get(path, file.getOriginalFilename());
        if (Files.exists(filePath)) {
            throw new IOException("File already exists! Please enter another file name!");
        }

        // 2. Upload the file
        String uploadedFileName = fileService.uploadFile(path, file);

        // 3. Set the value of field 'poster' as filename
        movieDto.setPoster(uploadedFileName);

        // 4. Map DTO to Movie entity
        Movie movie = new Movie(
                null,
                movieDto.getTitle(),
                movieDto.getGenre(),
                movieDto.getDirector(),
                movieDto.getReleaseDate(),
                movieDto.getPoster(),
                movieDto.getMovieCast()
        );

        // 5. Save Movie entity
        Movie savedMovie = movieRepository.save(movie);

        // 6. Generate posterUrl
        String posterUrl = baseUrl + "/file/" + uploadedFileName;

        // 7. Map Movie entity to MovieDto

        return new MovieDto(
                savedMovie.getMovieId(),
                savedMovie.getTitle(),
                savedMovie.getGenre(),
                savedMovie.getDirector(),
                savedMovie.getReleaseDate(),
                savedMovie.getPoster(),
                posterUrl,
                savedMovie.getMovieCast()
        );
    }

    @Override
    public MovieDto getMovie(Integer movieId) {
        // 1. Fetch the Movie entity from the database
        Movie movie = movieRepository.findById(Long.valueOf(movieId))
                .orElseThrow(() -> new IndexOutOfBoundsException("Movie not found with id = " + movieId));

        // 2. Generate posterUrl
        String posterUrl = baseUrl + "/file/" + movie.getPoster();

        // 3. Map Movie entity to MovieDto
        return new MovieDto(
                movie.getMovieId(),
                movie.getTitle(),
                movie.getGenre(),
                movie.getDirector(),
                movie.getReleaseDate(),
                movie.getPoster(),
                posterUrl,
                movie.getMovieCast()
        );
    }

    @Override
    public List<MovieDto> getAllMovies() {
        // 1. Fetch all Movie entities from the database
        List<Movie> movies = movieRepository.findAll();

        // 2. Convert Movie entities to MovieDto objects
        List<MovieDto> movieDtos = movies.stream()
                .map(movie -> {
                    String posterUrl = baseUrl + "/file/" + movie.getPoster();
                    return new MovieDto(
                            movie.getMovieId(),
                            movie.getTitle(),
                            movie.getGenre(),
                            movie.getDirector(),
                            movie.getReleaseDate(),
                            movie.getPoster(),
                            posterUrl,
                            movie.getMovieCast()
                    );
                })
                .collect(Collectors.toList());

        return movieDtos;
    }



    @Override
    public MovieDto updateMovie(MovieDto movieDto, Integer movieId , MultipartFile file) throws IOException {
        Movie movieDB = movieRepository.findById(Long.valueOf(movieDto.getMovieId())).orElse(null);
        String fileName = movieDB.getPoster();
        if(file !=null ) {
            Files.deleteIfExists(Paths.get(path + File.separator + fileName));
            fileName = fileService.uploadFile(path, file);
        }
        movieDto.setPoster(fileName);
        Movie movie = new Movie(
                movieDB.getMovieId(),
                movieDto.getTitle(),
                movieDto.getGenre(),
                movieDto.getDirector(),
                movieDto.getReleaseDate(),
                movieDto.getPoster(),
                movieDto.getMovieCast());

        Movie updatedMovie = movieRepository.save(movie);

        var posterUrl = baseUrl + "/file/" + updatedMovie.getPoster();


        return new MovieDto(
                updatedMovie.getMovieId(),
                updatedMovie.getTitle(),
                updatedMovie.getGenre(),
                updatedMovie.getDirector(),
                updatedMovie.getReleaseDate(),
                updatedMovie.getPoster(),
                posterUrl,
                updatedMovie.getMovieCast()
        );
    }

    @Override
    public String deleteMovie(Integer movieId) throws IOException {
        Movie mv = movieRepository.findById(Long.valueOf(movieId)).orElse(null);
        Integer id = mv.getMovieId();
        Files.deleteIfExists(Paths.get(path + File.separator + mv.getPoster()));
        movieRepository.delete(mv);
        return "Movie object deleted with id = " + id;
    }


}
