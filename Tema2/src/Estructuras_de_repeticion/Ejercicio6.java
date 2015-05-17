package Estructuras_de_repeticion;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);

		int codigo, alquilada, suma_alquilada = 0;

		int menos_alquilada = 0, cod_menos_alquilada = 0;
		int alquilada1 = 0, cod_alquilada1 = 0;
		int alquilada2 = 0, cod_alquilada2 = 0;

		int cont = 0, alquiladas_mas_de_veinte = 0, alquilada_menos_de_cinco = 0, entre_siete_y_quince = 0;
		double porcentaje_20 = 0, porcentaje_5 = 0, porcentaje_715;

		System.out.println("Codigo: ");
		codigo = teclado.nextInt();

		while (codigo >= 0 && codigo <= 999) {
			cont++;
			System.out.println("Veces alquilada: ");
			alquilada = teclado.nextInt();
			suma_alquilada = suma_alquilada + alquilada;

			// dos peliculas mas alquiladas
			if (cont == 1) {
				alquilada1 = alquilada;
				alquilada2 = 0;
				menos_alquilada = alquilada;

				cod_alquilada1 = codigo;
				cod_alquilada2 = codigo;
				cod_menos_alquilada = codigo;
			}

			else if (alquilada > alquilada1) {
				alquilada2 = alquilada1;
				alquilada1 = alquilada;

				cod_alquilada2 = cod_alquilada1;
				cod_alquilada1 = codigo;
			}

			else if (alquilada > alquilada2) {
				alquilada2 = alquilada;

				cod_alquilada2 = codigo;
			}

			// pelicula menos alquilada
			if (alquilada < menos_alquilada) {
				menos_alquilada = alquilada;

				cod_menos_alquilada = codigo;
			}

			// porcentaje mas de 20 veces
			if (alquilada > 20) {
				alquiladas_mas_de_veinte++;
			}

			// porcentaje menos de 5 veces
			if (alquilada < 5) {
				alquilada_menos_de_cinco++;
			}

			// porcentaje entre 7 y 15 veces
			if (alquilada < 15 && alquilada > 7) {
				entre_siete_y_quince++;
			}

			System.out.println("Codigo: ");
			codigo = teclado.nextInt();
		}// fin bucle

		System.out.println("Codigo de la pelicula mas alquilada: "+ cod_alquilada1);

		System.out.println("Codigo de la segunda pelicula mas alquilada: "+ cod_alquilada2);

		System.out.println("Codigo de la pelicula menos alquilada: "+ cod_menos_alquilada);

		porcentaje_20 = 100 * (alquiladas_mas_de_veinte / (double) cont);
		System.out.println("Porcentaje de peliculas alquiladas mas de 20 veces: "+ porcentaje_20);

		porcentaje_5 = 100 * (alquilada_menos_de_cinco / (double) cont);
		System.out.println("Porcentaje de peliculas alquiladas menos de 5 veces: "+ porcentaje_5);

		porcentaje_715 = 100 * (entre_siete_y_quince / (double) cont);
		System.out.println("Porcentaje de peliculas alquiladas entre 7 y 15 veces: "+ porcentaje_715);

		System.out.println("Media del numero de veces que se alquila cada pelicula: "+ suma_alquilada / cont);

	}
}
