package br.com.gamastore.CEJPA.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import br.com.gamastore.CEJPA.dto.SaqueDto;
import br.com.gamastore.CEJPA.forms.SaqueForm;
import br.com.gamastore.CEJPA.service.ATMService;

@RestController
@RequestMapping("/terminal")
public class TerminalController {

		@Autowired
		private ATMService service;
		
		
		@PostMapping(value = "/saque")
		public ResponseEntity<List<String>> realizarSaque(@RequestBody @Valid SaqueForm form){
			
			
				if(form.valor % 5 == 0 && form.valor > 4) {
					List<String> retorno = service.sacar(form);
					return ResponseEntity.ok(retorno);
				}
				else {
					List<String> retorno = new ArrayList<String>();
					retorno.add("Para sacar, Digite somente valores múltiplos de 5, maiores que 4 e m");
					return ResponseEntity.ok(retorno);
				}			
		}
		
				
		@GetMapping(value = "/extrato")
		public ResponseEntity<List<SaqueDto>> buscarExtrato(){

			return ResponseEntity.ok(service.historico());
		}
		
		
				
		
		
						
		
}			
			
				
			
		
		
		
		
		



