package org.lessons.java;

import java.util.Scanner;

public class snack7 {
	// Scrivere un programma che dati dei secondi li converta in ore, minuti,
	// secondi e mostri a video la stringa generata (secondi → “hh:mm:ss”)
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("scrivi un numero");
		
		int secondi = input.nextInt();
		
		int sommaMinuti = 0;
		int sommaOra = 0 ;
		int sommaSecondi = 0 ;
		
		sommaOra = secondi / 3600 ;
		sommaMinuti = secondi %3600/ 60;
		sommaSecondi = secondi %60; 
		
		System.out.println(sommaOra + ":" + sommaMinuti + ":" + sommaSecondi);
		
		//un ora è 3600 secondi
		// un minuto è 60 secondi 
	}
}
