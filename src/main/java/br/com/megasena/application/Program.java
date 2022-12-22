package br.com.megasena.application;

import br.com.megasena.entities.Numeros;

public class Program {
	public static void main(String[] args) {
		Numeros numeros = new Numeros();
		numeros.alimentarDezenas();
		

				
	            for(int i = 0; i < numeros.getDezenas().size();i++) {
	            	System.out.println(numeros.getDezenas().get(i));
	            }
	            
	}

}
