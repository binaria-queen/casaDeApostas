package br.com.project.bet.poo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import br.com.project.bet.poo.dtos.Evento;
import br.com.project.bet.poo.mapper.EventoRowMapper;

@Repository
public class EventoRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private static final String INSERT_EVENT = "INSERT INTO eventos (idAposta, nome, descricao, dataHoraEvento, odds, dataHoraAposta) VALUES (?, ?, ?, ?, ?, ?)";

	private final RowMapper<Evento> eventoRowMapper = new EventoRowMapper();

	public Evento criar(Evento evento) {
		jdbcTemplate.update(INSERT_EVENT, eventoRowMapper);
		return evento;
	}

}
