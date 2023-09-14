package org.lessons.java;

import java.util.Scanner;

public class snack5 {

	// Data una stringa in input mostrare a video quanti caratteri alfabetici
	// contiene, quanti numeri e quanti simboli non alfanumerici.Continuare a
	// chiedere una nuova stringa finchè non si inserisce 0.

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		boolean isnotzero = true; 
		char[] lettere = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'z' };
		char[] numeri = { '0','1', '2', '3', '4', '5', '6', '7', '8', '9' };

		char[] simboli= { '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '[', ']', '{', '}', '<', '>', ',', '.',
				';', ':', '-', '_', '+', '=', '|', '\\', '/', '?' };

		while (isnotzero) {

			System.out.println("scrivi una parola ... se è 0 interompe il ciclo");
			String parola = input.nextLine();
			int sommaLettere = 0;
			int sommaNumeri = 0;
			int sommaSimboli = 0;


			if (parola.equals("0")) {
				isnotzero = false;
			}
			for (int i = 0; i < parola.length(); i++) {
				char lettera = parola.charAt(i);
				
				for (int j = 0; j < lettere.length; j++) {
					if (lettere[j] == lettera)  {
						sommaLettere++;
					}
				}
				for (int k = 0; k < simboli.length; k++) {
					if (simboli[k] == lettera)  {
						sommaSimboli++;
					}
				}
				for (int h = 0; h < numeri.length; h++) {
					if (numeri[h] == lettera)  {
						sommaNumeri++;
					}
				}
			}
			System.out.println("quantita di lettere " + sommaLettere );
			System.out.println("quantita di simboli " + sommaSimboli );
			System.out.println("quantita di numeri " + sommaNumeri );

			
		

		}
		System.out.println(" fine ciclo");
		input.close();

	}
}
