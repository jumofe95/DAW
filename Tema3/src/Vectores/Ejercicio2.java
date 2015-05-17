package Vectores;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);

		int vector1[] = new int[4];
		int vector2[] = new int[4];
		int suma[] = new int[4];
		int i;

		System.out.println("Vector 1:");
		for (i = 0; i < 4; i++) {
			System.out.println("Numero " + i + ": ");
			vector1[i] = teclado.nextInt();
		}

		System.out.println("Vector 2:");
		for (i = 0; i < 4; i++) {
			System.out.println("Numero " + i + ": ");
			vector2[i] = teclado.nextInt();
		}

		System.out.println("Sumas de vectores: ");
		for (i = 0; i < 4; i++) {
			System.out.println("Numero " + i + ": " + (vector1[i] + vector2[i]));
		}

	}
}
