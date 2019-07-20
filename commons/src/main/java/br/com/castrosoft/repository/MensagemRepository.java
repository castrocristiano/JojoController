package br.com.castrosoft.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.castrosoft.entities.Mensagem;

public interface MensagemRepository extends CrudRepository<Mensagem, String> {

}
