package com.example.challengeWEB.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.challegengeWEB.service.FilmeService;
import com.exemple.challengeWEB.vo.FilmeOMDB;

@RestController
@RequestMapping("/filme")
public class FilmeController {

	@Autowired
	private FilmeService filmeService;
	
	public ResponseEntity<FilmeOMDB> getFilme(@PathVariable String tema){
		try {
			FilmeOMDB filmeOMDB = filmeService.getFilme(tema);
			return ResponseEntity.status(HttpStatus.OK).body(filmeOMDB);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
}
