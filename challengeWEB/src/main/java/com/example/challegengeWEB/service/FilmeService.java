package com.example.challegengeWEB.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.challengeWEB.client.FilmeClientOMDBFeign;
import com.exemple.challengeWEB.vo.FilmeOMDB;

@Service
public class FilmeService {
	
	@Value("${imdb.apikey}")
	private String apiKey;
	
	@Autowired
	private FilmeClientOMDBFeign filmClientOMDBFeign;
	
	public FilmeOMDB getFilme(String tema) {
		return filmClientOMDBFeign.getFilme(tema, apiKey);
	}
	
	
}
