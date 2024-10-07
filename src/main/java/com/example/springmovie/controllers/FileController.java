package com.example.springmovie.controllers;

// Import necessary classes and annotations
import com.example.springmovie.service.FileService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;

@RestController // Indicates that this class is a REST controller that handles HTTP requests and returns JSON or other content
@RequestMapping("/file/") // Base path for all the routes in this controller, e.g., "/file/"
public class FileController {

    private final FileService fileService; // Service to handle file operations

    // Constructor-based dependency injection to initialize the fileService
    public FileController(FileService fileService) {
        this.fileService = fileService;
    }

    @Value("${project.poster}") // Injects the value of the "project.poster" property from the application configuration
    private String path; // Path to the directory where files will be uploaded

    // HTTP POST method for uploading files
    @PostMapping("/upload")
    public ResponseEntity<String> uploadFileHandler(@RequestPart MultipartFile file) throws IOException {
        // Calls the fileService to handle file upload and returns the name of the uploaded file
        String uploadedFileName = fileService.uploadFile(path, file);
        // Returns a success message with the name of the uploaded file
        return ResponseEntity.ok("File uploaded : " + uploadedFileName);
    }

    // HTTP GET method to serve a file by its name
    @GetMapping(value = "/{fileName}")
    public void serveFileHandler(@PathVariable String fileName, HttpServletResponse response) throws IOException {
        // Retrieve the file as an InputStream from the fileService
        InputStream resourceFile = fileService.getResourceFile(path, fileName);
        // Set the response content type to PNG image
        response.setContentType(MediaType.IMAGE_PNG_VALUE);
        // Copy the file content to the HTTP response output stream
        StreamUtils.copy(resourceFile, response.getOutputStream());
    }
}
