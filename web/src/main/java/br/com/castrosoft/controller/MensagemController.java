package br.com.castrosoft.controller;

import java.util.List;

import br.com.castrosoft.commons.dto.MensagemDto;

public interface MensagemController {

	void salvar(MensagemDto mensagemDto);

	List<MensagemDto> listar();

}