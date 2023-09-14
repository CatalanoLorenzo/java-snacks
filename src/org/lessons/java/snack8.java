package org.lessons.java;

import java.util.Arrays;
import java.util.Random;

public class snack8 {
	// Creare un array di 10 interi randomici compresi tra 100 e 150. Stampare tutti
	// i valori contenuti nell'array (dopo averli inseriti). Stampare inoltre il
	// valore minimo, massimo e la media
	public static void main(String[] args) {
		int [] numeri = new int[10];
		Random rand = new Random();
		int numeroMin = 150;
		int numeroMax = 100;
		for (int i = 0; i < 10; i++) {
			
			int numero = rand.nextInt(100,151);
			numeri[i] = numero;
			if (numero  < numeroMin) {
				numeroMin= numeri[i];
			}
			if (numero  > numeroMax) {
				numeroMax= numeri[i];
			}
		
		}System.out.println(Arrays.toString(numeri)+numeroMin+" "+numeroMax);

}}
