package org.lessons.java;

import java.util.Arrays;
import java.util.Random;

public class snack10 {
	// Creare un array di 10 elementi randomici compresi tra 100 e 1000 e stampare:
	// - tutti gli elementi pari
	// - tutti gli elementi dispari
	// - tutti gli elementi in indice pari
	// - tutti gli elementi in indice dispari
	public static void main(String[] args) {
		int[] numeri = new int[10];
		
		int[] elementiIndexDispari = new int[5];
		int[] elementiIndexPari = new int[5];

		Random rand = new Random();
		int numeriPariTot = 0;
		int idexPari = 0;
		int indexDispari = 0;

		for (int i = 0; i < 10; i++) {
			
			int numero = rand.nextInt(100, 151);
			numeri[i] = numero;
			
			if(numero % 2 == 0) {
				numeriPariTot++;
			}
			
			if (i % 2 == 0) {
				elementiIndexPari[idexPari] = i;
				idexPari++;
			} else {
				elementiIndexDispari[indexDispari] = i;
				indexDispari++;
			}

		}
		int[] elementiPari = new int[numeriPariTot];
		int[] elementiDispari = new int[10 - numeriPariTot];
		int indicePari = 0;
		int indiceDispari = 0;
		for (int i = 0; i < numeri.length; i++) {
			if(numeri[i] %2 == 0) {
				elementiPari[indicePari] = numeri[i] ;
				indicePari++;
			}else {
				elementiDispari[indiceDispari] = numeri[i];
				indiceDispari++;
			}
			
		}
		System.out.println(Arrays.toString(numeri));
		System.out.println(Arrays.toString(elementiIndexPari));
		System.out.println(Arrays.toString(elementiIndexDispari));
		System.out.println(Arrays.toString(elementiDispari));
		System.out.println(Arrays.toString(elementiPari));
	}
}
