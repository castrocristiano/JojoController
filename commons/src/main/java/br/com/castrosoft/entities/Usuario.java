package br.com.castrosoft.entities;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.context.annotation.Lazy;

@Entity
public class Usuario extends AbstractEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8167505519811296837L;
	@Id
	@GeneratedValue(generator = UUID)
	@GenericGenerator(name = UUID, strategy = ORG_HIBERNATE_ID_UUID_GENERATOR)
	private String id;
	@Column
	private String nome;
	@Column
	private String email;
	@Column
	private String telefone;
	@Column
	private Date dataNascimento;
	@Lazy
	@OneToMany
	private List<Endereco> enderecos;
	@Lazy
	@OneToMany
	private List<Mensagem> mensagens;
	@Column
	private String login;
	@Column
	private String senha;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public List<Mensagem> getMensagens() {
		return mensagens;
	}

	public void setMensagens(List<Mensagem> mensagens) {
		this.mensagens = mensagens;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
