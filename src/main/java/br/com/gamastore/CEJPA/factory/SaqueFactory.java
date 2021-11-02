package br.com.gamastore.CEJPA.factory;

import br.com.gamastore.CEJPA.dto.SaqueDto;
import br.com.gamastore.CEJPA.forms.SaqueForm;


public class SaqueFactory {
	
	public static SaqueDto create(SaqueForm form) {
		return new SaqueDto(form.valor);
	}

}
