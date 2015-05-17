package Vectores;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);

		int vector[] = new int[10];
		int i;

		for (i = 0; i < 10; i++) {
			System.out.println("Número: ");
			vector[i] = teclado.nextInt();
		}
	
		i=0;
		boolean ordenado = true;
		
		while (ordenado && i<9) {
			if (vector[i] > vector[i + 1]) {
				ordenado = false;
			}
			i++;
		}

		if (ordenado == true) {
			System.out.println("Está ordenado.");
		}

		if (ordenado == false) {
			System.out.println("No está ordenado.");
		}

	}
}
