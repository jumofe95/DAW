package Vectores;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);

		int alumnos;
		int i;

		System.out.println("Cantidad de alumnos.");
		alumnos = teclado.nextInt();

		int facultad[] = new int[alumnos];
		int sexo[] = new int[alumnos];
		int trabaja[] = new int[alumnos];
		int sueldo[] = new int[alumnos];
		
		int hombres = 0, mujeres = 0;
		int hombre_trabaja = 0, mujer_trabaja = 0;
		int hombre_sueldo = 0, mujer_sueldo = 0;

		for (i = 0; i < alumnos; i++) {
			System.out.println("__________________________________________________");

			System.out.println("ALUMNO " + (i+1));

			System.out.println("Facultad: ");
			facultad[i] = teclado.nextInt();

			System.out.println("Sexo: ");
			System.out.println("(1)Masculino");
			System.out.println("(2)Femenino");
			sexo[i] = teclado.nextInt();
			if (sexo[i] == 1) {
				hombres++;
			}
			if (sexo[i] == 2) {
				mujeres++;
			}

			System.out.println("Trabaja: ");
			System.out.println("(1)Si");
			System.out.println("(2)No");
			trabaja[i] = teclado.nextInt();

			if (trabaja[i] == 1) {
				System.out.println("Sueldo: ");
				sueldo[i] = teclado.nextInt();
			}

		}// for
		
		System.out.println("--------------------------------------------------");

		for (i = 0; i < alumnos; i++) {
			if (sexo[i] == 1 && trabaja[i] == 1) {
				hombre_trabaja++;
			}
			if (sexo[i] == 2 && trabaja[i] == 1) {
				mujer_trabaja++;
			}
		}// for sexo

		for (i = 0; i < alumnos; i++) {
			if (sexo[i] == 1) {
				hombre_sueldo = hombre_sueldo + sueldo[i];
			}
			if (sexo[i] == 2) {
				mujer_sueldo = mujer_sueldo + sueldo[i];
			}
		}

		System.out.println("Cantidad de hombres: " + hombres / (double) alumnos * 100 + "%");
		System.out.println("Cantidad de mujeres: " + mujeres / (double) alumnos * 100 + "%");
		System.out.println("--------------------------------------------------");

		if (hombres > 0) {
			System.out.println("Hombres que trabajan: " + hombre_trabaja / (double) hombres * 100 + "%");
			System.out.println("Sueldo promedio: " + hombre_sueldo / hombres);
			System.out.println("--------------------------------------------------");
		}

		if (mujeres > 0) {
			System.out.println("Mujeres que trabajan: " + mujer_trabaja / (double) mujeres * 100 + "%");
			System.out.println("Sueldo promedio: " + mujer_sueldo / mujeres);
			System.out.println("--------------------------------------------------");
		}
	}
}
