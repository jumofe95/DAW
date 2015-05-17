package Vectores;

import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce 10 numeros.");

		int numeros[] = new int[10];
		int i;
		int cont = 0;
		int mas_digitos = 0;
		int numero = 0;
		int aux;

		for (i = 0; i < 10; i++) {

			System.out.print("Numero " + (i + 1) + ": ");
			numeros[i] = teclado.nextInt();
			
			aux = numeros[i];
			cont = 0;
			
			while (aux > 0) {
				aux = aux / 10;
				cont++;
			}

			if (i == 0) {
				mas_digitos = cont;
			}

			if (cont > mas_digitos) {
				mas_digitos = cont;
				numero = numeros[i];
			}

		}

		System.out.println("Numero más largo " + numero);
		System.out.println("Tiene: " + mas_digitos+ "digitos");
	}
}