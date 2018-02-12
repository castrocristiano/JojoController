package br.com.castrosoft;

public enum EMensagens {
	BEM_VINDO(1,  "Boas vindas", "Bem vindo");
	
	EMensagens(int cod, String titulo, String descricao) {
		this.cod = cod;
		this.titulo = titulo;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getDescricao() {
		return descricao;
	}

	private int cod;
	private String titulo;
	private String descricao;

}
