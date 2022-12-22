package br.com.megasena.entities;

import java.io.FileReader;
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
		String url = "mega2022.csv";
		try {
			FileReader filereader = new FileReader(url);
			CSVReader csvReader = new CSVReader(filereader);
			String[] nextRecord;
//			List<Integer> numeros = new ArrayList<>();
			

			while ((nextRecord = csvReader.readNext()) != null) {
				for (String cell : nextRecord) {

					String[] teste = cell.split(";");

					this.dezenas.add(Integer.parseInt(teste[0]));
					this.dezenas.add(Integer.parseInt(teste[1]));
					this.dezenas.add(Integer.parseInt(teste[2]));
					this.dezenas.add(Integer.parseInt(teste[3]));
//	                Collections.sort(numbers);

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
