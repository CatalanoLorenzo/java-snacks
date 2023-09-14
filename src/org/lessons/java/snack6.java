package org.lessons.java;

import java.util.Scanner;

public class snack6 {
	// Dato un numero sotto forma di stringa, convertirlo in intero senza utilizzare
	// funzioni già pronte.Possibile usare solo :
	// - cicli
	// - chartAt
	// - if / switch
	// Es. “25” come stringa deve essere convertito in intero 25.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("scrivi un numero");
		String numero = input.nextLine();
		System.out.println("il numero che hai scritto è " + numero);
		int risultato = 0;
		for (int i = 0; i < numero.length(); i++) {
			char digit = numero.charAt(i);
			if (digit >= '0' && digit <= '9') {
				int numericValue = digit - '0';
				risultato = risultato * 10 + numericValue;
			} else {
				System.out.println("La stringa contiene caratteri non numerici.");
				return;
			}
		}
		System.out.println("il numero che hai scritto è " + risultato);
	}
}
