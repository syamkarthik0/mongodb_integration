package com.example.demo.controller;

import com.example.demo.entity.Movie;
import com.example.demo.service.MovieService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")  // Set a base path for your API endpoints
public class HomeController {

    @GetMapping("/home")  // Adjusted endpoint
    public String home() {
        return "Welcome to the API";
    }
}
