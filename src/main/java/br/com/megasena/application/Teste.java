package br.com.megasena.application;



import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.opencsv.CSVReader;

public class Teste {
	public static void main(String[] args) {
			try {
			 
	        // Create an object of filereader
	        // class with CSV file as a parameter.
			String url = "mega2022.csv";
	        FileReader filereader = new FileReader(url);
	 
	        // create csvReader object passing
	        // file reader as a parameter
	        CSVReader csvReader = new CSVReader(filereader);
	        String[] nextRecord;
	        List<Integer> numbers = new ArrayList<>();
	 
	        // we are going to read data line by line
	        while ((nextRecord = csvReader.readNext()) != null) {
	            for (String cell : nextRecord) {
//	                System.out.print(cell);
	                String[] teste = cell.split(";");
	                
	                numbers.add(Integer.parseInt(teste[0]));
	                numbers.add(Integer.parseInt(teste[1]));
	                numbers.add(Integer.parseInt(teste[2]));
	                numbers.add(Integer.parseInt(teste[3]));
//	                numbers.sort(null);
	                System.out.println();
	                
	            }
	            
	        }
	        for(int i = 0; i < numbers.size();i++) {
            	System.out.println(numbers.get(i));
            }
            System.out.println();
	        Map<Integer, Integer> contagem = new HashMap<Integer, Integer>();
	      //Passo 1: Montar um mapa que associa o valor a quantas vezes ele pareceu
	        for (int valor : numbers) {
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
	           if (exibidos == 20) break;
	        }
	        
	        
	    }
	    catch (Exception e) {
	        e.printStackTrace();
	    }
	}}