package Vectores;

import java.util.Scanner;

public class PPT21 {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);

		int i, f, elegir;
		float gastos_man = 0;
		float gastos_tar = 0;
		float turnoMan[] = new float[8];
		float turnoTar[] = new float[8];

		System.out.println("(1)Mañana.");
		System.out.println("(2)Tarde.");
		elegir = teclado.nextInt();

		if (elegir == 1) {
			System.out.println("Sueldos de empleados del turno de la mañana.");
			for (i = 0; i < 4; i++) {
				System.out.println("Ingrese sueldo: ");
				turnoMan[i] = teclado.nextFloat();				
				gastos_man = gastos_man + turnoMan[i];
			}
		}

		if (elegir == 2) {
			System.out.println("Sueldos de empleados del turno de la tarde.");
			for (f = 0; f < 4; f++) {
				System.out.println("Ingrese sueldo: ");
				turnoTar[f] = teclado.nextFloat();
				gastos_tar = gastos_tar + turnoTar[f];
			}
		}
		System.out.println("Total de gastos del turno de la mañana:"+ gastos_man);
		System.out.println("Total de gastos del turno de la tarde:"+ gastos_tar);
	}
}