package br.com.project.bet.poo.dtos;

import java.time.LocalDateTime;

public class ApostaDto {

	private int idAposta;
	private int idUsuario;
	private int idEvento;
	private float valorApostado;
	private float oddAcumulado;
	private LocalDateTime dataHoraAposta;
	private String status;

	public ApostaDto(int idAposta, int idUsuario, int idEvento, float valorApostado, float oddAcumulado,
			LocalDateTime dataHoraAposta, String status) {
		super();
		this.idAposta = idAposta;
		this.idUsuario = idUsuario;
		this.idEvento = idEvento;
		this.valorApostado = valorApostado;
		this.oddAcumulado = oddAcumulado;
		this.dataHoraAposta = dataHoraAposta;
		this.status = status;
	}

	public int getIdAposta() {
		return idAposta;
	}

	public void setIdAposta(int idAposta) {
		this.idAposta = idAposta;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}

	public float getValorApostado() {
		return valorApostado;
	}

	public void setValorApostado(float valorApostado) {
		this.valorApostado = valorApostado;
	}

	public float getOddAcumulado() {
		return oddAcumulado;
	}

	public void setOddAcumulado(float oddAcumulado) {
		this.oddAcumulado = oddAcumulado;
	}

	public LocalDateTime getDataHoraAposta() {
		return dataHoraAposta;
	}

	public void setDataHoraAposta(LocalDateTime dataHoraAposta) {
		this.dataHoraAposta = dataHoraAposta;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public void addEventos(EventoDto dto) {
		
	}
	
	public String atualizarStatusDaAposta() {
		return status;
	}

}
