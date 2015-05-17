package Vectores;

import java.util.Scanner;

public class PPT23 {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);

		String nombres[] = new String[4];
		int edades[] = new int[4];
		int i;

		for (i = 0; i < 4; i++) {
			System.out.print("Nombre: ");
			nombres[i] = teclado.next();

			System.out.print("Edad de "+nombres[i]+ ": ");
			edades[i] = teclado.nextInt();
		}

		System.out.println("Mayores de edad: ");

		for (i = 0; i < 4; i++) {
			if (edades[i] >= 18) {
				System.out.println(nombres[i]);
			}
		}
	}
}
