package Estructuras_de_seleccion2;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String args[]) {
	
		
		char A, B, C, D, E, letra;
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce letra de 'A' a 'E': ");
		letra = teclado.next().charAt(0);

	if (letra == 'A'){
		System.out.println("10");
	}
	
	
	else if (letra == 'B'){
		System.out.println("8");
	}
	
	
	else if (letra == 'C'){
		System.out.println("6");
	}
	
	
	else if (letra == 'D'){
		System.out.println("5");
	}
	
	
	else if (letra == 'E'){
		System.out.println("0");
	}
	
	
	
	
	
	
	
	
	
	
	}
}
