package br.com.gamastore.CEJPA.forms;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

//import com.fasterxml.jackson.annotation.JsonSubTypes.Type;

//import javax.validation.constraints.*;

public class SaqueForm {

	@NotNull @Min(5)
	public int valor;

}
