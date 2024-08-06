package br.com.project.bet.poo.dtos;

public class PessoaDto {

	private int idPessoa;
	private String nome;
	private String email;
	private String senha;

	public PessoaDto(int idPessoa, String nome, String email, String senha) {
		super();
		this.idPessoa = idPessoa;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}

	public int getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public PessoaDto autenticarLogin(PessoaDto login) {
		return login;
		
	}
	
	public void realizarLogout() {
		
	}

}
