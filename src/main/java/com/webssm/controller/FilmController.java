package com.webssm.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webssm.entities.Film;
import com.webssm.service.FilmService;

@RestController
@RequestMapping("/film")
public class FilmController {
    
	@Autowired
    private FilmService filmService;

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Film getById(@PathVariable("id") int id) {
        return filmService.getById(id);
    }

    @RequestMapping(path = "", method = RequestMethod.GET)
    public List<Film> select() {
        return filmService.select();
    }
    
    @RequestMapping(path = "/delete/{id}", method = RequestMethod.GET)
    public void delete(@PathVariable("id") int id) {
        try {
			filmService.delete(id);
		} catch (SQLException e) {
			if(e.getClass().getName().equals("com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException")){
				
			}
			e.printStackTrace();
		}
    }
}
