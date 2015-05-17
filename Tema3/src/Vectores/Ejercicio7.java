package Vectores;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);

		int n, i, min = 0, min2 = 0;

		System.out.println("Cantidad de numeros: ");
		n = teclado.nextInt();

		int vector[] = new int[n];

		for (i = 0; i < n; i++) {
			System.out.println("Numero: ");
			vector[i] = teclado.nextInt();

			if (i == 0) {
				min = vector[i];
			}

			if (vector[i] < min) {
				min = vector[i];
			}
		}

		System.out.println("Numero minimo: " + min);

		for (i = 0; i < n; i++) {
			if (min == vector[i]) {
				min2++;
			}
		}

		if (min2 > 1) {
			System.out.println("Se repite");
		}

		if (min2 == 1) {
			System.out.println("No se repite");
		}
	}
}