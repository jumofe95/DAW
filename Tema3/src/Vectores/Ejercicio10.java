package Vectores;

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);

		int numeros[] = new int[10];
		int i, j;

		for (i = 0; i < 10; i++) {
			System.out.println("Numero " + (i + 1) + ":");
			numeros[i] = teclado.nextInt();
		}

		for (i = 0; i < 10; i++) {
			for (j = 1; j <= numeros[i]; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
