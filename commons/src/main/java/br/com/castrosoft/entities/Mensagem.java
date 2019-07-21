package br.com.castrosoft.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.context.annotation.Lazy;

@Entity
public class Mensagem extends AbstractEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7243870579746745439L;
	@Id
	@GeneratedValue(generator = UUID)
	@GenericGenerator(name = UUID, strategy = ORG_HIBERNATE_ID_UUID_GENERATOR)
	private String id;
	@Column
	private String titulo;
	@Column
	private String descricao;
	@Column
	private Integer cod;
	@Column
	private Date data;
	@ManyToOne
	@JoinColumn
	@Lazy
	private Usuario usuario;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
