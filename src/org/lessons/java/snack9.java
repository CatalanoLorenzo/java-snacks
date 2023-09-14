package org.lessons.java;

import java.util.Scanner;

public class snack9 {
	// Chiedere all'utente numeri interi e calcolarene la somma. Continuare a
	// chiedere numeri, finche' la sommatoria non supera il valore `1000`
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("scrivi un numero");

		int numero = input.nextInt();
		int somma = 0;
		boolean emille = false;
		while (!emille) {
			somma += numero;
			if(somma > 1000) {
				emille = true;
				System.out.println("la Somma è maggiore di 1000");
				break;
			}
			System.out.println("la Somma è : " + somma);

			System.out.println("scrivi un numero");
			numero = input.nextInt();
		}
		input.close();
	}
}
