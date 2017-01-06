package com.webssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.webssm.entities.Film;
import com.webssm.service.FilmService;

@RestController
@RequestMapping("/update")
public class UpdateController {
	
	@Autowired
	private FilmService filmService;
	
    @RequestMapping(path = "", method= RequestMethod.GET)
    public void update(@RequestParam(name = "film_id", required = false) int film_id,
            @RequestParam(name = "title", required = false, defaultValue = "") String title,
            @RequestParam(name = "description",required = false, defaultValue = "") String description,
            @RequestParam(name = "language_id",required = false) int language_id) {
    	Film film = new Film();
    	film.setFilm_id(film_id);
    	film.setTitle(title);
    	film.setDescription(description);
    	film.setLanguage_id(language_id);
    	filmService.update(film);
    }
}
