package br.com.castrosoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.castrosoft.commons.dto.MensagemDto;
import br.com.castrosoft.entities.Mensagem;
import br.com.castrosoft.repository.MensagemRepository;
import br.com.castrosoft.util.MensagemHelper;

@Controller
public class MensagemController {
	@Autowired
	private MensagemRepository mensagemRepository;
	
	
	public void salvar(MensagemDto mensagemDto) {
		Mensagem mensagem = MensagemHelper.convertDtoToEntidade(mensagemDto);
		mensagemRepository.save(mensagem);
	}
}
