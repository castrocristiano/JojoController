package br.com.castrosoft.commons.dto;

import br.com.castrosoft.commons.enums.EMensagens;

public class Mensagem {
	public String titulo;
	public String descricao;
	public Integer cod;
	
	public Mensagem() {
		super();
	}

	public Mensagem(EMensagens eMensagens) {
		cod = eMensagens.getCod();
		descricao = eMensagens.getDescricao();
		titulo = eMensagens.getTitulo();
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getCod() {
		return cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}
