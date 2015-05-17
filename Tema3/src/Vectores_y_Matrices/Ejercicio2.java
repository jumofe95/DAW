package Vectores_y_Matrices;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);

		int vector[][] = new int[3][3];
		int i, j;
		int sumaPositivos = 0, sumaNegativos = 0;

		for (i = 0; i < 3; i++) {
		System.out.print("Vector "+i+": ");
			for (j = 0; j < 3; j++){
				vector[i][j] = teclado.nextInt();
				if (vector[i][j] >= 0) {
				sumaPositivos = sumaPositivos + vector[i][j];
			} else if (vector[i][j] < 0) {
				sumaNegativos = sumaNegativos + vector[i][j];
			}
			}
			
		}
		System.out.println("Suma de todos los positivos: " + sumaPositivos);
		System.out.println("Suma de todos los negativos: " + sumaNegativos);
	}
}
