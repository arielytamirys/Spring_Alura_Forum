package br.com.alura.forum.config.validacao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErroDeValidacaoHandler {
	
	//(exceptinon..)esta anotação é usada quando,é para ser chamado quando ouver uma excessao dentro de um controller
	//(parametro do excep) dentro do paramentro foi posto o tipo de erro na (exception)  que o metodo precisa tratar se ocorrer
	// (ResponseStatus) fala qual é o parametro que quero que ele devolva no caso 400
	
	@ResponseStatus(code =HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public List<ErroDeFormulario> handle(MethodArgumentNotValidException exception) {
		
		List<ErroDeFormulario> dto = new ArrayList<>();
		 
		
		 
		 
		 return dto;


	}

}
