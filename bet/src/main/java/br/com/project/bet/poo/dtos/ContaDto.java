package br.com.project.bet.poo.dtos;

public class ContaDto {

	private int idConta;
	private float saldo;

	public ContaDto(int idConta, float saldo) {
		super();
		this.idConta = idConta;
		this.saldo = saldo;
	}

	public int getIdConta() {
		return idConta;
	}

	public void setIdConta(int idConta) {
		this.idConta = idConta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public void depositar(String valor) {

	}

	public void atualizarSaldo(String valor) {

	}

	public void sacar(String valor) {

	}
}
