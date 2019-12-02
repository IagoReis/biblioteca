package br.com.mundodev.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.mundodev.biblioteca.model.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, String> {
	
}
