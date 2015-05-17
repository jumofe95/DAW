package Estructuras_de_repeticion;

import java.util.Scanner;

public class Ejercicio14 {
	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);

		int i, edad = 0, q = 0, mayores = 0, altos = 0, incedad = 0, incestatura = 0;
		double estatura = 0, w = 0;

		for (i = 1; i <= 2; i++) {
			System.out.println("ALUMNO " + i);

			System.out.println("Edad: ");
			edad = teclado.nextInt();
			q = q + edad;
			incedad++;

			System.out.println("Estatura: ");
			estatura = teclado.nextDouble();
			w = w + estatura;
			incestatura++;

			if (edad >= 18) {
				mayores++;
			}
			if (estatura >= 1.75) {
				altos++;
			}
		}

		System.out.println("Edad media: " + q / incedad);
		System.out.println("Estatura media: " + w / incestatura);
		System.out.println("Mayores de 18: " + mayores);
		System.out.println("Mas de 1,75m: " + altos);

	}
}