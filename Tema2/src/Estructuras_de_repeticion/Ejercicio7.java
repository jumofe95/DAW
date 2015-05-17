package Estructuras_de_repeticion;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String args[]){
		
		Scanner teclado = new Scanner(System.in);

		int numero, digitos, incremento=0;
		
		
		
		System.out.println("Numero: ");
		numero = teclado.nextInt();
		
		System.out.println("Cantidad digitos: ");
		digitos = teclado.nextInt();
		
				while (numero != 0){
					numero = numero / 10;
					incremento++;
				}
		
				
				if (incremento == digitos){
						System.out.println("Numero correcto.");
				}
				else 
				System.out.println("Numero incorrecto.");

						

						
		
		}
}