package com.indracompany.treinamento.util;

public class NomeUtil {

	public static void validaNome(String nome) {
	
			if (nome == null) {
	            throw new RuntimeException("Erro de Preenchimento de String");
	        }
	        
	        if (nome.isEmpty()) {
	            throw new RuntimeException("Erro de Preenchimento de String");
	        }
	        
	        if (nome.trim().isEmpty()) {
	            throw new RuntimeException("Erro de Preenchimento de String");
	        }
	}

}