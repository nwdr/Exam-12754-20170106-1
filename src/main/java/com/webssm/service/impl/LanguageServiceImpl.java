package com.webssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webssm.entities.Language;
import com.webssm.mapper.LanguageMapper;
import com.webssm.service.LanguageService;

@Service
public class LanguageServiceImpl implements LanguageService {

	@Autowired
	private LanguageMapper languageMapper;
	
	@Override
	public List<Language> getLanguages() {
		return languageMapper.select();
	}

}
