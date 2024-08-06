package br.com.project.bet.poo.dtos;

public class AdministradorDto extends PessoaDto {

	private int idPessoa;
	
	public AdministradorDto(int idPessoa, String nome, String email, String senha) {
		super(idPessoa, nome, email, senha);
	}

	public int getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}
	
	public void cadastrarEvento(EventoDto evento) {
		
	}
	
	public EventoDto editarEvento(EventoDto evento) {
		return null;
		
	}
	
	public void excluirEvento(EventoDto evento) {
		
	}
	
}
