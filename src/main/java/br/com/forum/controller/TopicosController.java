package br.com.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.forum.controller.dto.TopicoDto;
import br.com.forum.modelo.Curso;
import br.com.forum.modelo.Topico;

@RestController
public class TopicosController {

	@RequestMapping("/topicos")
	public List<TopicoDto> lista() {
		Topico topico = new Topico("Dúvida", "Duvida com Spring", new Curso("Spring", "Programação"));
		
		
		return TopicoDto.converter(Arrays.asList(topico, topico, topico));
	}
	
}
