package br.com.project.bet.poo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.project.bet.poo.dtos.Evento;
import br.com.project.bet.poo.repository.EventoRepository;

@Service
public class EventoService {
	
	@Autowired
	private EventoRepository repository;

	public Evento criar(Evento dto) {
		return repository.criar(dto);
	}
	
}
