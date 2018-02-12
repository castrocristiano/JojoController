package br.com.castrosoft;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CtrlRest {
	
	@RequestMapping("/")
    public Mensagem home() {
		Mensagem mensagem = new Mensagem();
		mensagem.setCod(1);
		mensagem.setDescricao("Bem vindo!");
		mensagem.setTitulo("Boas vindas");
        return mensagem;
    }
}
