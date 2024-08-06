package br.com.project.bet.poo.dtos;

import java.time.LocalDateTime;
import java.util.Map;

public class EventoDto {

	private int idEvento;
	private int idAposta;
	private String nome;
	private String descricao;
	private LocalDateTime dataHoraEvento;
	private Map<String, Float> odds;
	private LocalDateTime dataHoraAposta;

	public EventoDto(int idEvento, int idAposta, String nome, String descricao, LocalDateTime dataHoraEvento,
			Map<String, Float> odds, LocalDateTime dataHoraAposta) {
		super();
		this.idEvento = idEvento;
		this.idAposta = idAposta;
		this.nome = nome;
		this.descricao = descricao;
		this.dataHoraEvento = dataHoraEvento;
		this.odds = odds;
		this.dataHoraAposta = dataHoraAposta;
	}

	public int getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}

	public int getIdAposta() {
		return idAposta;
	}

	public void setIdAposta(int idAposta) {
		this.idAposta = idAposta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getDataHoraEvento() {
		return dataHoraEvento;
	}

	public void setDataHoraEvento(LocalDateTime dataHoraEvento) {
		this.dataHoraEvento = dataHoraEvento;
	}

	public Map<String, Float> getOdds() {
		return odds;
	}

	public void setOdds(Map<String, Float> odds) {
		this.odds = odds;
	}

	public LocalDateTime getDataHoraAposta() {
		return dataHoraAposta;
	}

	public void setDataHoraAposta(LocalDateTime dataHoraAposta) {
		this.dataHoraAposta = dataHoraAposta;
	}
	
	public void cadastrarEvento() {
		
	}

}
