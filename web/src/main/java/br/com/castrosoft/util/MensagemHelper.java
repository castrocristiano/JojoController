package br.com.castrosoft.util;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Objects;

import br.com.castrosoft.commons.dto.MensagemDto;
import br.com.castrosoft.entities.Mensagem;
import br.com.castrosoft.entities.Usuario;

public class MensagemHelper {

	public static Mensagem convertDtoToEntidade(MensagemDto dto) {
		Mensagem mensagem = factory();
		Usuario usuario = UsuarioHelper.factory(dto.getIdUsuario());
		
		mensagem.setCod(dto.getCod());
		mensagem.setData(Date.valueOf(LocalDate.now()));
		mensagem.setDescricao(dto.getDescricao());
		mensagem.setTitulo(dto.getTitulo());
		mensagem.setUsuario(usuario);
		return mensagem;
	}
	
	public static Mensagem convertDtoToEntidade(MensagemDto dto, Usuario usuario) {
		Mensagem mensagem = convertDtoToEntidade(dto);
		mensagem.setUsuario(usuario);
		return mensagem;
	}
	
	public static Mensagem factory() {
		return new Mensagem();
	}

	public static MensagemDto convertToDto(Mensagem dto) {
		MensagemDto mensagem = new MensagemDto();
		Usuario usuario = dto.getUsuario();
		
		if (Objects.nonNull(usuario))
			mensagem.setIdUsuario(dto.getUsuario().getId());
		
		mensagem.setCod(dto.getCod());
		mensagem.setData(dto.getData());
		mensagem.setDescricao(dto.getDescricao());
		mensagem.setTitulo(dto.getTitulo());
		
		return mensagem;
	}

}
