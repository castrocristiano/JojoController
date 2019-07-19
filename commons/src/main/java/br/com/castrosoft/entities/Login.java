package br.com.castrosoft.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Login extends AbstractEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5318702473107015186L;
	@Id
	@GeneratedValue(generator = UUID)
	@GenericGenerator(name = UUID, strategy = ORG_HIBERNATE_ID_UUID_GENERATOR)
	private String id;
	@Column
	private String login;
	@Column
	private String senha;
	@OneToOne
	private Usuario usuario;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
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
