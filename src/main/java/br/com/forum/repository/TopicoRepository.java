package br.com.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Integer> {

	List<Topico> findByCursoNome(String nomeCurso);

}
