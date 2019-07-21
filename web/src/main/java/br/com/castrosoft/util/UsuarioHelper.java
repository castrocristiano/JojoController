package br.com.castrosoft.util;

import br.com.castrosoft.commons.dto.UsuarioDto;
import br.com.castrosoft.entities.Mensagem;
import br.com.castrosoft.entities.Usuario;

public class UsuarioHelper {

	public static Usuario convertDtoToEntidade(UsuarioDto dto) {
		Usuario usuario = new Usuario();
		usuario.setDataNascimento(dto.getDataNascimento());
		usuario.setEmail(dto.getEmail());
		usuario.setEnderecos(dto.getEnderecos());
		usuario.setId(dto.getId());
		usuario.setLogin(dto.getLogin());
		usuario.setMensagens(dto.getMensagens());
		usuario.setNome(dto.getNome());
		usuario.setSenha(dto.getSenha());
		usuario.setTelefone(dto.getTelefone());
		return usuario;
	}
	
	public static UsuarioDto convertEndidade(Usuario usuario) {
		UsuarioDto dto = new UsuarioDto();
		dto.setDataNascimento(usuario.getDataNascimento());
		dto.setEmail(usuario.getEmail());
		dto.setEnderecos(usuario.getEnderecos());
		dto.setId(usuario.getId());
		dto.setLogin(usuario.getLogin());
		dto.setMensagens(usuario.getMensagens());
		dto.setNome(usuario.getNome());
		dto.setSenha(usuario.getSenha());
		dto.setTelefone(usuario.getTelefone());
		return dto;
	}
	
	public static Mensagem factory() {
		return new Mensagem();
	}
}
