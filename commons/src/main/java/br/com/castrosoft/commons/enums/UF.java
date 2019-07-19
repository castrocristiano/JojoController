package br.com.castrosoft.commons.enums;

public enum UF {
	RS("RS");
	
	private String UF;
	
	private UF(String uf) {
		UF = uf;
	}
	
	public String value() {
		return UF;
	}
}
