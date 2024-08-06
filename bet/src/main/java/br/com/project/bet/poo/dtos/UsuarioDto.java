package br.com.project.bet.poo.dtos;

import java.util.List;

public class UsuarioDto extends PessoaDto {

	private int idConta; 
	private int idUsuario;
	
	public UsuarioDto(int idPessoa, String nome, String email, String senha) {
		super(idPessoa, nome, email, senha);
	}

	public int getIdConta() {
		return idConta;
	}

	public void setIdConta(int idConta) {
		this.idConta = idConta;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	public void cadastrarUsuario(UsuarioDto usuario) {
		
	}
	
	public UsuarioDto editarPerfil(UsuarioDto usuario) {
		return usuario;
	}
	
	public void deletarConta(UsuarioDto usuario) {
		
	}
	
	public List<ApostaDto> listarHistoricoApostas(){
		return null;
	}
	
	public void realizarAposta() {
		
	}
}
