package Vectores;

import java.util.Scanner;
public class Ejercicio8 {
	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);

		int sueldos[] = new int[5];
		int i;
		int f;
		int j;
		int aux;
		
		for (i = 0; i < 5; i++) {
			System.out.print("Sueldo " + (i+1) + ":");
			sueldos[i] = teclado.nextInt();
		}

		for (f = 0; f < 4; f++) {
			for (j = 0; j < 4; j++) {
				if (sueldos[j] > sueldos[j + 1]) {
					aux = sueldos[j];
					sueldos[j] = sueldos[j + 1];
					sueldos[j + 1] = aux;
				}
			}
		}
		
		System.out.println();
		System.out.println("Sueldos ordenados de menor a mayor: ");

		for (j = 0; j < 5; j++) {
			System.out.println(sueldos[j]);
		}
	}
}