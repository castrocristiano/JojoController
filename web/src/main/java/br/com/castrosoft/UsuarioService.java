package br.com.castrosoft;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.castrosoft.commons.dto.UsuarioDto;
import br.com.castrosoft.controller.UsuarioController;
import br.com.castrosoft.entities.Usuario;
import br.com.castrosoft.util.UsuarioHelper;

@RestController()
public class UsuarioService {
	@Autowired
	private UsuarioController usuarioController;

	@GetMapping(path = "usuario/list")
	public List<UsuarioDto> list() {
		return usuarioController.getUsuarios();
	}
	
	@PostMapping(path = "usuario/salvar")
	public UsuarioDto salvarUsuario(@RequestBody UsuarioDto usuario) {
		Usuario usuarioSalvo = usuarioController.salvarUsuario(usuario);
		return UsuarioHelper.convertEndidade(usuarioSalvo);
	}
}
