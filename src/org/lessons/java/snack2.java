package org.lessons.java;

import java.util.Random;

public class snack2 {

	// Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e
	// una lista di cognomi, e da queste vuole mostrare a video una falsa lista di
	// invitati con nome e cognome.

	public static void main(String[] args) {
		
		String[] listaNomi = {"Lorenzo","Giuseppe","Luca","Mattia","Domiziano"};
		
		String[] listaCognomi = {"Catalano","Sciacca","Macedone","Volpe","De Santis"};
		
		for (int i = 0; i < 10; i++) {
			
			Random random = new Random();
			
			int nomeRandom = random.nextInt(listaNomi.length);
			
			int cognomeRandom = random.nextInt(listaCognomi.length);
			
			System.out.println(listaNomi[nomeRandom] + " " + listaCognomi[cognomeRandom]);
			
			
		}

	}
}
