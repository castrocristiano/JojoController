package br.com.castrosoft.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.castrosoft.entities.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, String> {

}
