package br.com.castrosoft;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.castrosoft.commons.dto.UsuarioDto;
import br.com.castrosoft.controller.UsuarioController;

@RestController
public class UsuarioService {
	@Autowired
	private UsuarioController usuarioController;

	@GetMapping(path = "/usuario/list")
	public List<UsuarioDto> list() {
		return usuarioController.getUsuarios();
	}
}
