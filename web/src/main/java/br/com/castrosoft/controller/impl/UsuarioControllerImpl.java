package br.com.castrosoft.controller.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.castrosoft.commons.dto.UsuarioDto;
import br.com.castrosoft.controller.UsuarioController;
import br.com.castrosoft.entities.Usuario;
import br.com.castrosoft.repository.UsuarioRepository;
import br.com.castrosoft.util.UsuarioHelper;

@Controller
public class UsuarioControllerImpl implements UsuarioController {
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public List<UsuarioDto> getUsuarios() {
		Iterable<Usuario> usuarios = usuarioRepository.findAll();
		ArrayList<UsuarioDto> dtos = new ArrayList<>();

		if (Objects.nonNull(usuarios))
			usuarios.forEach(u -> {
				dtos.add(UsuarioHelper.convertEndidade(u));
			});

		return dtos;
	}

	@Override
	public Usuario salvarUsuario(UsuarioDto usuario, String login, String senha) {
		Usuario eUsuario = UsuarioHelper.convertDtoToEntidade(usuario, login, senha);
		Usuario salvo = usuarioRepository.save(eUsuario);
		return salvo;
	}

	@Override
	public Usuario getUsuario(String idUsuario) {
		Usuario usuario = usuarioRepository.findOne(idUsuario);
		return usuario;
	}

	@Override
	public Usuario salvarUsuario(UsuarioDto usuario) {
		Usuario salvo = usuarioRepository.save(UsuarioHelper.convertDtoToEntidade(usuario));
		return salvo;
	}

}
