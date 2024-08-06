package br.com.project.bet.poo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.project.bet.poo.dtos.Evento;
import br.com.project.bet.poo.service.EventoService;

@RequestMapping("/api")
@RestController
public class EventoController {
	
	@Autowired
	private EventoService service;
	
	public ResponseEntity<Evento> criarEvento(@RequestBody Evento evento) {
		Evento eventoCriado = service.criar(evento);
		return new ResponseEntity<Evento>(eventoCriado, HttpStatus.CREATED);
		
	}
	
}
