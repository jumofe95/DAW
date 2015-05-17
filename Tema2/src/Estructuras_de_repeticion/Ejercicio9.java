package Estructuras_de_repeticion;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String args[]) {

		int edad = 0, q = 0, i = 1, media = 0, max = 0, min = 0, jubilados = 0, menoresEdad = 0;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Edad: ");
		edad = teclado.nextInt();

		while (edad >= 0) {
			q = q + edad;
			
			if (i == 1) {
				max = edad;
				min = edad;
			}

			if (edad > max) {
				max = edad;
			}

			if (edad < min) {
				min = edad;
			}

			if (edad > 65) {
				jubilados++;
			}

			if (edad < 18) {
				menoresEdad++;
			}

			System.out.println("Edad: ");
			edad = teclado.nextInt();
			i++;

		}// FIN BUCLE
		
		media = q / i;
		System.out.println("Media: " + media);

		System.out.println("Edad maxima: " + max);
		System.out.println("Edad minima: " + min);

		System.out.println("Jubilados: " + jubilados);

		System.out.println("Menores de edad: " + menoresEdad);

	}// class
}// static void
