package com.example.demo.repository;

import com.example.demo.entity.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface MovieRepository extends MongoRepository<Movie, String> {
    List<Movie> findByGenre(String genre);
    List<Movie> findByPopularTrue();
}