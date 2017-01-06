package com.webssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webssm.entities.Language;
import com.webssm.service.LanguageService;

@RestController
@RequestMapping("/language")
public class LanguageController {
	
	@Autowired
	private LanguageService languageService;
	
    @RequestMapping(path = "", method= RequestMethod.GET)
    public List<Language> getLanguages() {
    	return languageService.getLanguages();
    }
}
