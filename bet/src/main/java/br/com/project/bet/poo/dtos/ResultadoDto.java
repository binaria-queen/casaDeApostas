package br.com.project.bet.poo.dtos;

public class ResultadoDto {

	private int idResultado;
	private int idEvento;
	private int idAposta;
	private String resultadoAposta;
	private float odd;

	public ResultadoDto(int idResultado, int idEvento, int idAposta, String resultadoAposta, float odd) {
		super();
		this.idResultado = idResultado;
		this.idEvento = idEvento;
		this.idAposta = idAposta;
		this.resultadoAposta = resultadoAposta;
		this.odd = odd;
	}

	public int getIdResultado() {
		return idResultado;
	}

	public void setIdResultado(int idResultado) {
		this.idResultado = idResultado;
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

	public String getResultadoAposta() {
		return resultadoAposta;
	}

	public void setResultadoAposta(String resultadoAposta) {
		this.resultadoAposta = resultadoAposta;
	}

	public float getOdd() {
		return odd;
	}

	public void setOdd(float odd) {
		this.odd = odd;
	}

	public void calcularResultadoAposta() {
		
	}
}
