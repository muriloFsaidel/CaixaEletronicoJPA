package br.com.gamastore.CEJPA.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.gamastore.CEJPA.dto.SaqueDto;
import br.com.gamastore.CEJPA.factory.SaqueFactory;
import br.com.gamastore.CEJPA.forms.SaqueForm;

@Service
public class ATMService {
	
	private  List<Integer> notas;
	private  static List<SaqueDto> extrato = new ArrayList<SaqueDto>();	
	private  List<String> retorno;
	private  int quantidade;
	
	public ATMService() {
		notas = new ArrayList<Integer>();
		notas.add(100);
		notas.add(50);
		notas.add(20);
		notas.add(10);
		notas.add(5);		
		
		retorno = new ArrayList<String>();
	}
	
	public List<String> sacar(SaqueForm form){
			SaqueDto saqueATM = SaqueFactory.create(form);
			extrato.add(saqueATM);
			retorno.clear();
			
			
				if(form.valor >= notas.get(0)) {
					
					quantidade = Integer.parseInt(String.valueOf(form.valor / 100));
					
					for(int i = 0; i < quantidade; i++) {
						retorno.add("$100");
					}
					
					form.valor = form.valor - (quantidade * 100);
				}
				
				if(form.valor >= notas.get(1)) {
					
					quantidade = Integer.parseInt(String.valueOf(form.valor / 50));
					
					for(int i = 0; i < quantidade;i++) {
						retorno.add("$50");
					}
					
					form.valor = form.valor - (quantidade * 50);
				}
				
				if(form.valor >= notas.get(2)) {
					quantidade = Integer.parseInt(String.valueOf(form.valor / 20));
					
					for(int i = 0; i < quantidade;i++) {
						retorno.add("$20");
					}
					
					form.valor = form.valor - (quantidade * 20);
				}
				
				if(form.valor >= notas.get(3)) {
					quantidade = Integer.parseInt(String.valueOf(form.valor / 10));
					
					for(int i = 0; i < quantidade;i++) {
						retorno.add("$10");
					}
					
					form.valor = form.valor - (quantidade * 10);
				}
				
				if(form.valor >= notas.get(4)) {
					quantidade = Integer.parseInt(String.valueOf(form.valor / 5));
					
					for(int i = 0; i < quantidade;i++) {
						retorno.add("$5");
					}
					
					form.valor = form.valor - (quantidade * 5);
				}		
				
			return retorno;
			
			
		}
	
	
	public List<SaqueDto> historico(){
		return extrato;
		
	}
		
		
}
	
	
	
	


