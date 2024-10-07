package com.example.springmovie.service;

// Import necessary classes for handling files and exceptions
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

// Interface for file-related operations
public interface FileService {

    // Method to handle file uploads
    // Takes a path (where the file will be saved) and a MultipartFile (the file being uploaded)
    // Returns the file name or path after upload, and throws an IOException in case of failure
    String uploadFile(String path, MultipartFile file) throws IOException;

    // Method to retrieve a file (e.g., an image) as an InputStream
    // Takes the path and filename, and returns an InputStream to read the file content
    // Throws a FileNotFoundException if the file is not found
    InputStream getResourceFile(String path, String filename) throws FileNotFoundException;
}
