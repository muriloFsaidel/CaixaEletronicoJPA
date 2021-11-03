package br.com.gamastore.CEJPA.config;

//import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//import org.springframework.context.MessageSource;
//import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import br.com.gamastore.CEJPA.dto.validationDto;
import br.com.gamastore.CEJPA.factory.ValidationDtoFactory;


//import org.springframework.beans.factory.annotation.Autowired;

//import br.com.gamastore.rentcar2.dto.validationDto;


@RestControllerAdvice//manipula as exceções MethodArgumentNotValidException em qualquer classe
public class ValidationHandler {
	
	//@Autowired
	//private MessageSource messageSource;
	
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	//manipulador de exceção
	@ExceptionHandler(MethodArgumentNotValidException.class)	
	public List<validationDto> handle(MethodArgumentNotValidException exception) {
	
	//forma automática de fazer traduções das mensagens de acordo com o header da requisição		
	List<FieldError> erros = exception.getBindingResult().getFieldErrors();
	return erros.stream().map(ValidationDtoFactory::create).collect(Collectors.toList());
	
	}
	
	/* forma manual de fazer traduções das mensagens de acordo com o header da requisição
	List<validationDto> dtos = new ArrayList<validationDto>(); 
					
	erros.forEach( e -> {	
        validationDto dto = new validationDto();
		dto.fieldName = e.getField();
		dto.message = messageSource.getMessage(e, LocaleContextHolder.getLocale());
		dtos.add(dto);
	});
	
	return dtos;
	*/
	
	
	
	

}


