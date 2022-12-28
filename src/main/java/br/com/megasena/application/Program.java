package br.com.megasena.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

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
			System.out.println(list.size());
			System.out.println("*************************");
			
			Map<Integer, List<Integer>> cont = new LinkedHashMap<>();
			for (int i = 0; i < list.size(); i++) {
			    int n = list.get(i);
			    if (!cont.containsKey(n)) {
			        cont.put(n, new ArrayList<>());
			    }
			    // adiciona "i" na lista de posições em que o número aparece
			    cont.get(n).add(i);
			}

			for (Entry<Integer, List<Integer>> entry : cont.entrySet()) {
			    List<Integer> posicoes = entry.getValue();
			    
			    if (posicoes.size() > 1) {
			    	
			        System.out.printf("Número %d se repete %d vezes nas posições: %s\n", entry.getKey(), posicoes.size(), posicoes);
			    }
			}
			
        
			    
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}