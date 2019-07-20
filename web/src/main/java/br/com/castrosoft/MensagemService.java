package br.com.castrosoft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.castrosoft.commons.dto.AcaoDto;
import br.com.castrosoft.commons.dto.MensagemDto;
import br.com.castrosoft.commons.enums.EMensagens;
import br.com.castrosoft.controller.MensagemController;

@RestController
public class MensagemService {
	
	@Autowired
	private MensagemController mensagemController;
	
	@GetMapping("/")
    public MensagemDto home() {
		MensagemDto m = new MensagemDto(EMensagens.BEM_VINDO);
		mensagemController.salvar(m);
        return m;
    }
	
	@PostMapping(path = "/acao")
	public MensagemDto acao(@RequestBody AcaoDto acao) {
		MensagemDto m = new MensagemDto(EMensagens.ACAO, acao.getDescricao());
		mensagemController.salvar(m);
		return m;
	}
	
}
