package br.com.castrosoft.commons.dto;

import java.sql.Date;
import java.util.List;

import br.com.castrosoft.entities.Endereco;
import br.com.castrosoft.entities.Mensagem;

public class UsuarioDto {
	private String id;
	private String nome;
	private String email;
	private String telefone;
	private Date dataNascimento;
	private List<EnderecoDto> enderecos;
	private String login;
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

	public List<EnderecoDto> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<EnderecoDto> enderecos) {
		this.enderecos = enderecos;
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

	@Override
	public String toString() {
		return "UsuarioDto [id=" + id + ", nome=" + nome + ", email=" + email + ", telefone=" + telefone
				+ ", dataNascimento=" + dataNascimento + ", enderecos=" + enderecos + ", login=" + login + ", senha="
				+ senha + "]";
	}

}
