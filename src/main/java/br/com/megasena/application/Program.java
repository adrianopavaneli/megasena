package br.com.megasena.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Program {
	public static void main(String[] args) {
		String path = "mega2022.csv";

		List<Integer> list = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			line = br.readLine();
			while (line != null) {
				String[] vect = line.split(";");
				for (int i = 0; i < 6; i++) {
					Integer number = Integer.parseInt(vect[i]);
					list.add(number);
				}
				line = br.readLine();

			}
			Map<Integer, Integer> contagem = new HashMap<Integer, Integer>();
		      //Passo 1: Montar um mapa que associa o valor a quantas vezes ele pareceu
		        for (int valor : list) {
		           if (!contagem.containsKey(valor)) {
		               contagem.put(valor, 0);
		           }
		           contagem.put(valor, contagem.get(valor)+1);
		        } 
		      //Passo 2: Criar um TreeSet que ordene pela contagem
		        Set<Map.Entry<Integer, Integer>> valores = new TreeSet<Map.Entry<Integer, Integer>>(
		           new Comparator<Map.Entry<Integer, Integer>>() {
		              public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
		                  return o1.getValue().compareTo(o2.getValue());
		              }
		           });
		        valores.addAll(contagem.entrySet());
		        
		        int exibidos = 0;
		        for (Map.Entry<Integer, Integer> valor : valores) {
		           System.out.printf("Número: %d   Vezes: %d", valor.getKey(), valor.getValue());
		           exibidos++;
		           System.out.println();
		           if (exibidos == 60) break;
		        }
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
