package br.com.megasena.entities;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;

public class Numeros {
	private List<Integer> dezenas;

	public List<Integer> getDezenas() {
		return dezenas;
	}

	public void setDezenas(List<Integer> dezenas) {
		this.dezenas = dezenas;
	}

	public void alimentarDezenas() {
		
		try {
			 
	        // Create an object of filereader
	        // class with CSV file as a parameter.
			String url = "mega2022.csv";
	        FileReader filereader = new FileReader(url);
	 
	        // create csvReader object passing
	        // file reader as a parameter
	        CSVReader csvReader = new CSVReader(filereader);
	        String[] nextRecord;
//	        List<Integer> this.dezenas = new ArrayList<>();
	 
	        // we are going to read data line by line
	        while ((nextRecord = csvReader.readNext()) != null) {
	            for (String cell : nextRecord) {
//	                System.out.print(cell);
	                String[] teste = cell.split(";");
	                
	                this.dezenas.add(Integer.parseInt(teste[0]));
	                this.dezenas.add(Integer.parseInt(teste[1]));
	                this.dezenas.add(Integer.parseInt(teste[2]));
	                this.dezenas.add(Integer.parseInt(teste[3]));
//	                this.dezenas.sort(null);
	                System.out.println();
//	                numbers = this.dezenas;
	                
	            }
	            for(int i = 0; i < this.dezenas.size();i++) {
	            	System.out.println(i + this.dezenas.get(i));
	            }
	            System.out.println();
	        }
	        
	    }
	    catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}
