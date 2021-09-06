package com.thisisspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thisisspringboot.model.Favourites;

public interface FavouriteRepository extends JpaRepository<Favourites, Integer> {

	Favourites save(Favourites favourites);
	
}
	
