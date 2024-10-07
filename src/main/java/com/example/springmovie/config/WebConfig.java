package com.example.springmovie.config;

// Import the necessary Spring Framework classes
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration // This annotation indicates that this class contains Spring bean configurations.
public class WebConfig implements WebMvcConfigurer { // Implements WebMvcConfigurer to customize Spring MVC configurations

    // Override the default method to customize CORS (Cross-Origin Resource Sharing) settings
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Add CORS mapping for all endpoints under /api/** path
        registry.addMapping("/api/**")
                // Allow CORS requests only from the specified origin (e.g., your React app running on localhost)
                .allowedOrigins("http://localhost:8080") // Allow your React app's origin
                // Allow these HTTP methods for cross-origin requests
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                // Allow any HTTP headers in the cross-origin requests
                .allowedHeaders("*")
                // Allow sending cookies and credentials in CORS requests
                .allowCredentials(true);
    }
}
