package org.lessons.java;

public class snack3 {

	// Crea un array di numeri interi e fai la somma di tutti gli elementi  che sono
	// in posizione dispari

	public static void main(String[] args) {

		int[] listaNumeri = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int somma = 0;

		for (int i = 0; i < listaNumeri.length; i++) {

			boolean isPair = i % 2 == 0;

			if (!isPair) {

				somma += listaNumeri[i];

			}
		}
		System.out.println(somma);
	}
}
