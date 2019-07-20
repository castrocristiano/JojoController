package br.com.castrosoft.controller;

import java.util.List;

import br.com.castrosoft.commons.dto.UsuarioDto;

public interface UsuarioController {
	
	public List<UsuarioDto> getUsuarios();
}
