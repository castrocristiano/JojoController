package br.com.castrosoft.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.castrosoft.entities.Endereco;

public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}
