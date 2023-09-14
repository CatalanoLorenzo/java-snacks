package org.lessons.java;

import java.util.Scanner;

public class snack1 {
	
	//Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("inserisci un numero :");
		
		int numero = input.nextInt();
		
		boolean isPair = numero %2 == 0;
		
		System.out.println(
				isPair
				? numero
						: numero + 1
				);
	}
}
