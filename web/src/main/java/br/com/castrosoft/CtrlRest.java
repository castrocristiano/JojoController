package br.com.castrosoft;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.castrosoft.commons.dto.EMensagens;
import br.com.castrosoft.commons.enums.Mensagem;

@RestController
public class CtrlRest {
	
	@RequestMapping("/")
    public Mensagem home() {
        return new Mensagem(EMensagens.BEM_VINDO);
    }
}
