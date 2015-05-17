package Vectores;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);

		String paises[] = new String[5];
		int i;
		int j;
		int k;
		String aux;

		for (i = 0; i < 5; i++) {
			System.out.print("Nombre de pais: ");
			paises[i] = teclado.next();
		}

		for (j = 0; j < 4; j++) {
			for (k = 0; k < 4; k++) {
				if (paises[k].compareTo(paises[k + 1]) > 0) {
					aux = paises[k];
					paises[k] = paises[k + 1];
					paises[k + 1] = aux;
				}
			}
		}

		
		System.out.println();
		System.out.println("Paises ordenados alfabeticamente: ");

		for (j = 0; j < 5; j++) {
			System.out.println(paises[j]);
		}
	}
}
