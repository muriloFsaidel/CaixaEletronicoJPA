package br.com.gamastore.CEJPA.factory;

import org.springframework.validation.FieldError;

import br.com.gamastore.CEJPA.dto.validationDto;




public class ValidationDtoFactory {
	

	public static validationDto create(FieldError error) {
		validationDto dto = new validationDto();
		
		dto.fieldName = error.getField();
		dto.message = error.getDefaultMessage();
		
		return dto;
	}
}
