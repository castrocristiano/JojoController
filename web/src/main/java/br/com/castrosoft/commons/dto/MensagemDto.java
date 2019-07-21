package br.com.castrosoft.commons.dto;

import java.sql.Date;

import br.com.castrosoft.commons.enums.EMensagens;

public class MensagemDto {
	private String titulo;
	private String descricao;
	private Integer cod;
	private String idUsuario;
	private Date data;

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
	
	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
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

	public void setData(Date data) {
		this.data = data;
	}
	
	public Date getData() {
		return data;
	}

}
