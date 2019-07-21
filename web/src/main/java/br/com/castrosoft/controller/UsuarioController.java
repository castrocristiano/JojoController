package br.com.castrosoft.controller;

import java.util.List;

import br.com.castrosoft.commons.dto.UsuarioDto;
import br.com.castrosoft.entities.Usuario;

public interface UsuarioController {
	
	public List<UsuarioDto> getUsuarios();
	
	public Usuario salvarUsuario(UsuarioDto usuario);
}
