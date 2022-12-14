package br.com.alura.forum.config.validacao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErroDeValidacaoHandler {
	
	@Autowired
	private MessageSource messageSource;
	//(parametro do excep) dentro do paramentro foi posto o tipo de erro na (exception)  que o metodo precisa tratar se ocorrer
		// (ResponseStatus) fala qual é o parametro que quero que ele devolva no caso 400
		
	//(exceptinon..)esta anotação é usada quando,é para ser chamado quando ouver uma excessao dentro de um controller
	
	@ResponseStatus(code =HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public List<ErroDeFormulario> handle(MethodArgumentNotValidException exception) {
		
		List<ErroDeFormulario> dto = new ArrayList<>();
		 
		List<FieldError> fieldErrors = exception.getBindingResult().getFieldErrors();
		 fieldErrors.forEach(e -> {
			  String menssagem =messageSource.getMessage(e,LocaleContextHolder.getLocale());
			  ErroDeFormulario erro = new ErroDeFormulario (e.getField() , menssagem );
			  dto.add(erro);
			  
		 });

		
		 return dto;


	}

}
