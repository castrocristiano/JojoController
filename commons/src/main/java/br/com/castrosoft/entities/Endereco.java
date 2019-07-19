package br.com.castrosoft.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

import br.com.castrosoft.commons.enums.UF;

@Entity
public class Endereco extends AbstractEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5157074402219304813L;
	@Id
	@GeneratedValue(generator = UUID)
	@GenericGenerator(name = UUID, strategy = ORG_HIBERNATE_ID_UUID_GENERATOR)
	private String id;
	@Column
	private String logradouro;
	@Column
	private Integer numero;
	@Column
	private String bairro;
	@Column
	private Integer cep;
	@Column
	private String cidade;
	@Column
	private UF uf;
	@ManyToOne
	@JoinColumn
	private Usuario usuario;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public UF getUf() {
		return uf;
	}

	public void setUf(UF uf) {
		this.uf = uf;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
