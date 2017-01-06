package com.webssm.service;

import java.sql.SQLException;
import java.util.List;

import com.webssm.entities.Film;

public interface FilmService {
	List<Film> select();
	
	Film getById(int id);
	
	void update(Film film);
	
	void delete(int id) throws SQLException;
}
