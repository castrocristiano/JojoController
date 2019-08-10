package br.com.castrosoft.util;

import br.com.castrosoft.commons.dto.UsuarioDto;
import br.com.castrosoft.entities.Usuario;

public class UsuarioHelper {

	public static Usuario convertDtoToEntidade(UsuarioDto dto) {
		Usuario usuario = new Usuario();
		usuario.setDataNascimento(dto.getDataNascimento());
		usuario.setEmail(dto.getEmail());
		usuario.setEnderecos(EnderecoHelper.convertToEnderecosEntidade(dto.getEnderecos()));
		usuario.setId(dto.getId());
		usuario.setLogin(dto.getLogin());
		usuario.setNome(dto.getNome());
		usuario.setSenha(dto.getSenha());
		usuario.setTelefone(dto.getTelefone());
		return usuario;
	}
	
	public static UsuarioDto convertEndidade(Usuario usuario) {
		UsuarioDto dto = new UsuarioDto();
		dto.setDataNascimento(usuario.getDataNascimento());
		dto.setEmail(usuario.getEmail());
		dto.setEnderecos(EnderecoHelper.convertToEnderecosDtos(usuario.getEnderecos()));
		dto.setId(usuario.getId());
		dto.setLogin(usuario.getLogin());
		dto.setNome(usuario.getNome());
		dto.setSenha(usuario.getSenha());
		dto.setTelefone(usuario.getTelefone());
		return dto;
	}
	
	public static Usuario factory(String id) {
		Usuario u = new Usuario();
		u.setId(id);
		return u;
	}
}
