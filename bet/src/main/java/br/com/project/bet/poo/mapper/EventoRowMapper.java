package br.com.project.bet.poo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

import org.springframework.jdbc.core.RowMapper;

import br.com.project.bet.poo.dtos.Evento;

public class EventoRowMapper implements RowMapper<Evento> {

	@Override
    public Evento mapRow(ResultSet rs, int rowNum) throws SQLException {
		Evento event = new Evento();
        event.setIdEvento(rs.getInt("idEvento"));
        event.setIdAposta(rs.getInt("idAposta"));
        event.setNome(rs.getString("nome"));
        event.setDescricao(rs.getString("descricao"));
        event.setDataHoraEvento(rs.getObject("dataHoraEvento", LocalDateTime.class));
        event.setOdds(rs.getString("odds"));
        event.setDataHoraAposta(rs.getObject("dataHoraAposta", LocalDateTime.class));
        return event;
    }
}
