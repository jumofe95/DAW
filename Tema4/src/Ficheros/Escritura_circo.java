package Ficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Escritura_circo {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
	
		int numero_ciudades;
		int i;
		String ciudad;

		System.out.println("Numero de ciudades visitadas: ");
		numero_ciudades = teclado.nextInt();

		String[] ciudades = new String[numero_ciudades];
		int[] actuaciones = new int[numero_ciudades];
		double[] ingresos = new double[numero_ciudades];
		int[] histograma = new int[11];

		System.out.println("INFORMACION SOBRE LAS CIUDADES");

		for (i = 0; i < numero_ciudades; i++) {
			System.out.println("Nombre de la ciudad " + (i + 1) + ": ");
			ciudades[i] = teclado.next();
			System.out.println("Numero de actuaciones(max 10): ");
			actuaciones[i] = teclado.nextInt();
			while (actuaciones[i] > 10){
				System.out.println("MAXIMO 10 ACTUACIONES: ");
				System.out.println("Numero de actuaciones: ");
				actuaciones[i] = teclado.nextInt();
			}
			System.out.println("Ingresos obtenidos: ");
			ingresos[i] = teclado.nextDouble();
			System.out.println("------------------------------------");
		}

		int opcion;
		int num_actuaciones = 0;
		double recaudacion = 0;

		do {
			System.out.println("_________________________________");
			System.out.println("(1)Mostrar Actuaciones");
			System.out.println("(2)Recaudaci�n M�xima");
			System.out.println("(3)Recaudaci�n M�nima");
			System.out.println("(4)Histograma de actuaciones");
			System.out.println("(5)Ingresos Medios");
			System.out.println("(6)Generar informe de ingresos medios");
			System.out.println("(7)Salir");
			System.out.println("_________________________________");
			opcion = teclado.nextInt();

			switch (opcion) {

			case 1:
				System.out.println("Ciudad: ");
				for (i = 0; i < numero_ciudades; i++) {
					System.out.println(ciudades[i]);
				}
				ciudad = teclado.next();

				for (i = 0; i < numero_ciudades; i++) {
					if (ciudad.equals(ciudades[i])) {
						num_actuaciones = actuaciones[i];
						recaudacion = ingresos[i];
						break;
					}
				}
				System.out.println("Numero de actuaciones: " + num_actuaciones);
				System.out.println("Recaudacion: " + recaudacion);
				break;

			case 2:
				double rec_max = 0;
				int ciudad_max = 0;

				for (i = 0; i < numero_ciudades; i++) {
					if (i == 0) {
						rec_max = ingresos[i];
					}
					if (ingresos[i] > rec_max) {
						rec_max = ingresos[i];
						ciudad_max = i;
					}
				}
				System.out.println("Ciudad con mayor recaudacion: "+ ciudades[ciudad_max]);
				System.out.println("Recaudacion: " + rec_max);
				break;

			case 3:
				double rec_min = 0;
				int ciudad_min = 0;

				for (i = 0; i < numero_ciudades; i++) {
					if (i == 0) {
						rec_min = ingresos[i];
					}

					if (ingresos[i] < rec_min) {
						ciudad_min = i;
						rec_min = ingresos[i];
					}
				}
				System.out.println("Ciudad con menor recaudacion: "+ ciudades[ciudad_min]);
				System.out.println("Recaudacion: " + rec_min);
				break;

			case 4:

				for (i = 0; i < numero_ciudades; i++) {
					histograma[actuaciones[i]]++;
				}

				int j;
				for (j = 0; j < 11; j++) {
					System.out.print("Con " + j + " actuaciones hay: ");

					for (i = 0; i < histograma[j]; i++) {
						System.out.print("* ");
					}
					System.out.println("");
				}
				break;

			case 5:
				double media;
				double suma = 0;

				for (i = 0; i < numero_ciudades; i++) {
					suma = suma + ingresos[i];
				}
				media = suma / numero_ciudades;

				System.out.println("Recaudacion media: " + media);
				
				System.out.println("Ciudades por encima de la media: ");
				for (i = 0; i < numero_ciudades; i++) {
					if (ingresos[i] > media) {
						System.out.println(ciudades[i]);
					}
				}
				break;
				
			case 6:
				double media2;
				double suma2 = 0;

				for (i = 0; i < numero_ciudades; i++) {
					suma2 = suma2 + ingresos[i];
				}
				media2 = suma2 / numero_ciudades;
				
			
				PrintWriter out =null;

				try {
					 out = new PrintWriter("InformeGestion.txt");
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				out.println("Recaudacion media: " + media2);
			
				out.println("Ciudades por encima de la media: ");
				for (i = 0; i < numero_ciudades; i++) {
					if (ingresos[i] > media2) {
						out.println(ciudades[i]);
					}
				}out.close();
				System.out.println("Informe generado");

				break;
			}
		} while (opcion != 7);
	}
}
