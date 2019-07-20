package br.com.castrosoft.util;

import br.com.castrosoft.commons.dto.UsuarioDto;
import br.com.castrosoft.entities.Mensagem;
import br.com.castrosoft.entities.Usuario;

public class UsuarioHelper {

	public static Usuario convertDtoToEntidade(UsuarioDto dto) {
		Usuario usuario = new Usuario();
		return usuario;
	}
	
	public static UsuarioDto convertEndidade(Usuario usuario) {
		UsuarioDto dto = new UsuarioDto();
		return dto;
	}
	
	public static Mensagem factory() {
		return new Mensagem();
	}
}
