package Vectores_y_Matrices;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);

		int vector[][] = new int[4][4];
		int aux[] = new int[4];
		int i, j;
		int cambiar1, cambiar2;

		for (i = 0; i < 4; i++) {
			System.out.println("Fila " + i);
			for (j = 0; j < 4; j++) {
				vector[i][j] = teclado.nextInt();
			}
		}

		for (i = 0; i < 4; i++) {

			for (j = 0; j < 4; j++) {
				System.out.print(vector[i][j]);
			}
			System.out.println();
		}

		System.out.println("Fila a cambiar (0-3): ");
		cambiar1 = teclado.nextInt();

		aux = vector[cambiar1];

		System.out.println("Cambiar la fila " + cambiar1+ " por la fila (0-3): ");
		cambiar2 = teclado.nextInt();

		vector[cambiar1] = vector[cambiar2];
		vector[cambiar2] = aux;

		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				System.out.print(vector[i][j]);
			}
			System.out.println();
		}

	}
}
