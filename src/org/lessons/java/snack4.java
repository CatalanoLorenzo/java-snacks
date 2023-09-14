package org.lessons.java;

import java.util.Scanner;

public class snack4 {

	// Data in input una stringa verificare se è palindroma

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String parola = input.nextLine();

		input.close();

		char[] parolaSplit = parola.toCharArray();
		String  parolaSplitRevers = "" ;

		for (int i = parolaSplit.length - 1; i >= 0; i-- ) {
			
				parolaSplitRevers += parolaSplit[i];
			
		}

		System.out.println( parolaSplitRevers + " " + parola );
		System.out.println(parolaSplitRevers.equals(parola)? "è un palindromi" : "non è un palindromo");
	}

}
