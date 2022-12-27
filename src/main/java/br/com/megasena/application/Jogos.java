package br.com.megasena.application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Jogos {
	public static void main(String[] args) {
		List<Integer> dezenas = new ArrayList();
		dezenas.add(38);
		dezenas.add(56);
		dezenas.add(41);
		dezenas.add(10);
		dezenas.add(53);
		dezenas.add(23);
		dezenas.add(37);
		dezenas.add(45);
		dezenas.add(8);
		dezenas.add(49);
		dezenas.add(17);
		dezenas.add(1);	
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos jogos deseja fazer?");
		int x = sc.nextInt();
		
		System.out.println("MEGA DA VIRADA\n");
		System.out.println("*****************************");
		
		for (int i=0;i < x;i++){
			Collections.shuffle(dezenas);
			for (int j = 1; j<=6;j++) {
				System.out.print(dezenas.get(j)+ " ");
			}
			System.out.println();
			System.out.println("--------------------");
			

		}
		System.out.println("*****************************");
		
		sc.close();

}
}