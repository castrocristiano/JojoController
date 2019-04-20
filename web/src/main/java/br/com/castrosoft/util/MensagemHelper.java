package br.com.castrosoft.util;

import java.sql.Date;
import java.time.LocalDate;

import br.com.castrosoft.commons.dto.MensagemDto;
import br.com.castrosoft.entities.Mensagem;

public class MensagemHelper {

	public static Mensagem convertDtoToEntidade(MensagemDto dto) {
		Mensagem mensagem = factory();
		mensagem.setCod(dto.getCod());
		mensagem.setData(Date.valueOf(LocalDate.now()));
		mensagem.setDescricao(dto.getDescricao());
		mensagem.setTitulo(dto.getTitulo());
		return mensagem;
	}
	
	public static Mensagem factory() {
		return new Mensagem();
	}
}
