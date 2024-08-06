package br.com.project.bet.poo.dtos;

import java.time.LocalDateTime;

public class Evento {

	private int idEvento;
    private int idAposta;
    private String nome;
    private String descricao;
    private LocalDateTime dataHoraEvento;
    private String odds; // Para armazenar como JSON em formato de string... verificar melhor opção
    private LocalDateTime dataHoraAposta;

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

    public String getOdds() {
        return odds;
    }

    public void setOdds(String odds) {
        this.odds = odds;
    }

    public LocalDateTime getDataHoraAposta() {
        return dataHoraAposta;
    }

    public void setDataHoraAposta(LocalDateTime dataHoraAposta) {
        this.dataHoraAposta = dataHoraAposta;
    }
}