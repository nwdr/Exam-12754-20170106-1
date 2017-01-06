package com.webssm.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webssm.entities.Film;
import com.webssm.mapper.FilmMapper;
import com.webssm.service.FilmService;

@Service
public class FilmServiceImpl implements FilmService {

	@Autowired
	private FilmMapper filmMapper;
	
	@Override
	public List<Film> select() {
		return filmMapper.select();
	}

	@Override
	public Film getById(int id) {
		return filmMapper.getById(id);
	}

	@Override
	public void update(Film film) {
		filmMapper.update(film);
	}

	@Override
	public void delete(int id){
		
			filmMapper.delete(id);
		
	}

}
