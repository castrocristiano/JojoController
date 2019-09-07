package br.com.castrosoft.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import br.com.castrosoft.commons.dto.MensagemDto;
import br.com.castrosoft.commons.dto.UsuarioDto;
import br.com.castrosoft.entities.Usuario;

public class UsuarioHelper {

	public static Usuario convertDtoToEntidade(UsuarioDto dto) {
		Usuario usuario = new Usuario();
		usuario.setDataNascimento(dto.getDataNascimento());
		usuario.setEmail(dto.getEmail());
		usuario.setEnderecos(EnderecoHelper.convertToEnderecosEntidade(dto.getEnderecos()));
		usuario.setId(dto.getId());
		usuario.setNome(dto.getNome());
		usuario.setTelefone(dto.getTelefone());
		return usuario;
	}
	
	public static Usuario convertDtoToEntidade(UsuarioDto dto, String login, String senha) {
		Usuario usuario = convertDtoToEntidade(dto);
		usuario.setLogin(login);
		usuario.setSenha(senha);
		return usuario;
	}
	
	public static UsuarioDto convertEndidade(Usuario usuario) {
		UsuarioDto dto = new UsuarioDto();
		List<MensagemDto> mensagens = new ArrayList<>();
		if (Objects.nonNull(usuario.getMensagens())) {
			usuario.getMensagens().forEach(m -> {
				mensagens.add(MensagemHelper.convertToDto(m));
			});
		}
		dto.setDataNascimento(usuario.getDataNascimento());
		dto.setEmail(usuario.getEmail());
		dto.setEnderecos(EnderecoHelper.convertToEnderecosDtos(usuario.getEnderecos()));
		dto.setMensagens(mensagens);
		dto.setId(usuario.getId());
		dto.setNome(usuario.getNome());
		dto.setTelefone(usuario.getTelefone());
		return dto;
	}
	
	public static Usuario factory(String id) {
		Usuario u = new Usuario();
		u.setId(id);
		return u;
	}
}
