package br.com.gamastore.CEJPA.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SaqueDto {

	private LocalDateTime dataHora;
	public int valor;


	public LocalDateTime getDataHora() {
		return dataHora;
	}
	
	public int getValor() {
		return valor;
	}

	public SaqueDto(int sValor) {
		this.dataHora = LocalDateTime.now();
		this.valor = sValor;
	}
}
