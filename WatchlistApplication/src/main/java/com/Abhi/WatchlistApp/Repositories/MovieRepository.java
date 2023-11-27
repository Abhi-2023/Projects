package com.Abhi.WatchlistApp.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Abhi.WatchlistApp.Entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer>{

}
