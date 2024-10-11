package br.com.serratec.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.serratec.biblioteca.domain.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>{

}
