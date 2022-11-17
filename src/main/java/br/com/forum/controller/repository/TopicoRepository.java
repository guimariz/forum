package br.com.forum.controller.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Integer> {

	Page<Topico> findByCursoNome(String nomeCurso, Pageable paginacao);

}
