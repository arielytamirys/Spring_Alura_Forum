package controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;

@RestController
public class TopicosController {

	@GetMapping("/topicos")
	public List<TopicoDto> lista() {
		Topico topico = new Topico("duvida com Spring", "Programação", new Curso("Spring", "Programação"));

		return TopicoDto.converter(Arrays.asList(topico, topico, topico));
	}
}
