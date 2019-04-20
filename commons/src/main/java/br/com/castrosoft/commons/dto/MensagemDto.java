package br.com.castrosoft.commons.dto;

import br.com.castrosoft.commons.enums.EMensagens;

public class MensagemDto {
	private String titulo;
	private String descricao;
	private Integer cod;

	public MensagemDto() {
		super();
	}

	public MensagemDto(EMensagens eMensagens) {
		cod = eMensagens.getCod();
		descricao = eMensagens.getDescricao();
		titulo = eMensagens.getTitulo();
	}
	
	public MensagemDto(EMensagens eMensagens, String descricao) {
		this(eMensagens);
		this.descricao = descricao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
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

}
