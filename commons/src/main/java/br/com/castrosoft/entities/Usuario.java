package br.com.castrosoft.entities;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

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
	@OneToMany
	private List<Endereco> endereco;
	@OneToOne
	private Login login;

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

	public List<Endereco> getEndereco() {
		return endereco;
	}

	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
