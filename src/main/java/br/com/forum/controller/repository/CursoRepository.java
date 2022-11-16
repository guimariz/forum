package br.com.forum.controller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.forum.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer>  {

	Curso findByNome(String nome);

}
