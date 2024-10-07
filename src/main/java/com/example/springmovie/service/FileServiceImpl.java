package com.example.springmovie.service;

// Import necessary classes for file handling
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

@Service // Marks this class as a Spring service component, making it eligible for dependency injection
public class FileServiceImpl implements FileService {

    @Override
    public String uploadFile(String path, MultipartFile file) throws IOException {
        // Get the original name of the file that was uploaded
        String fileName = file.getOriginalFilename();

        // Construct the full file path (path where the file will be stored + file name)
        String filePath = path + File.separator + fileName;

        // Create a File object for the directory where the file will be saved
        File f = new File(path);

        // Check if the directory exists; if not, create it
        if (!f.exists()) {
            f.mkdir(); // Creates the directory if it doesn't exist
        }

        // Copy the uploaded file to the destination path
        Files.copy(file.getInputStream(), Paths.get(filePath));

        // Return the file name after the upload process is completed
        return fileName;
    }

    @Override
    public InputStream getResourceFile(String path, String fileName) throws FileNotFoundException {
        // Construct the full path of the file to retrieve (directory path + file name)
        String filePath = path + File.separator + fileName;

        // Return a FileInputStream for reading the file content
        // Throws FileNotFoundException if the file doesn't exist
        return new FileInputStream(filePath);
    }
}
