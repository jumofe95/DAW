package Estructuras_de_repeticion;

import java.util.Scanner;

public class EjercicioPPT69 {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);

		int i, j;
		int familias, hijos = 0, edad_hijo = 0;
		int num_max_hijos = 0, num_min_hijos = 0, num_media_hijos = 0;
		int edad_max_hijos = 0, edad_min_hijos = 0, edad_media_hijos = 0;
		int suma_hijos = 0, suma_edad_hijo = 0;

		System.out.println("Numero de familias: ");
		familias = teclado.nextInt();

		for (i = 1; i <= familias; i++) {
			System.out.println("Numero de hijos de familia " + i + ":");
			hijos = teclado.nextInt();
			suma_hijos = suma_hijos + hijos;

			if (i == 1) {
				num_max_hijos = hijos;
				num_min_hijos = hijos;
			}

			if (hijos > num_max_hijos) {
				num_max_hijos = hijos;
			}

			if (hijos < num_min_hijos) {
				num_min_hijos = hijos;
			}

			for (j = 1; j <= hijos; j++) {
				System.out.println("Edad de hijo " + j + ":");
				edad_hijo = teclado.nextInt();
				suma_edad_hijo = suma_edad_hijo + edad_hijo;

				if (i == 1 && j == 1) {
					edad_max_hijos = edad_hijo;
					edad_min_hijos = edad_hijo;
				}

				if (edad_hijo > edad_max_hijos) {
					edad_max_hijos = edad_hijo;
				}

				if (edad_hijo < edad_min_hijos) {
					edad_min_hijos = edad_hijo;
				}

			}// for hijos

		}// for familias

		System.out.println("Número máximo de hijos por familia: "+ num_max_hijos);
		System.out.println("Número minimo de hijos por familia: "+ num_min_hijos);
		num_media_hijos = suma_hijos / familias;
		System.out.println("Promedio de hijos por familia: " + num_media_hijos);

		System.out.println("Hijo mayor: " + edad_max_hijos);
		System.out.println("Hijo menor: " + edad_min_hijos);
		
		edad_media_hijos = suma_edad_hijo / suma_hijos;
		System.out.println("Edad media de hijos: " + edad_media_hijos);

	}
}












