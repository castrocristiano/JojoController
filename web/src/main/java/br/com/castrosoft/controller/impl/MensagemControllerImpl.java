package br.com.castrosoft.controller.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.castrosoft.commons.dto.MensagemDto;
import br.com.castrosoft.controller.MensagemController;
import br.com.castrosoft.controller.UsuarioController;
import br.com.castrosoft.entities.Mensagem;
import br.com.castrosoft.entities.Usuario;
import br.com.castrosoft.repository.MensagemRepository;
import br.com.castrosoft.util.MensagemHelper;

@Controller
public class MensagemControllerImpl implements MensagemController {
	
	@Autowired
	private MensagemRepository mensagemRepository;
	
	@Autowired 
	private UsuarioController usuarioController;
	
	@Override
	public void salvar(MensagemDto mensagemDto) {
		Mensagem mensagem = MensagemHelper.convertDtoToEntidade(mensagemDto);
		String idUsuario = mensagemDto.getIdUsuario();
		
		if (Objects.nonNull(idUsuario)) {
			Usuario usuario = usuarioController.getUsuario(mensagemDto.getIdUsuario());
			mensagem.setUsuario(usuario);
		} else {
			mensagem.setUsuario(null);
		}
		
		mensagemRepository.save(mensagem);
	}

	@Override
	public List<MensagemDto> listar() {
		Iterable<Mensagem> mensagens = mensagemRepository.findAll();
		
		ArrayList<MensagemDto> mensagensDtos = new ArrayList<>();
		
		if (Objects.nonNull(mensagens)) 
			mensagens.forEach(m -> {
				mensagensDtos.add(MensagemHelper.convertToDto(m));
			});
		
		return mensagensDtos;
	}
}
