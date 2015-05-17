package Estructuras_de_repeticion;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String args[]){

		Scanner teclado = new Scanner(System.in);

		char letra;
		int letraM;	
		
		System.out.println("Letra en minuscula:  ");
		letra = teclado.next().charAt(0);
		
		while(letra >= 'a' && letra <= 'z'){
		
			letraM = 'A' + (letra - 'a');

			System.out.println((char)letraM);

			System.out.println("Letra en minuscula:  ");
			letra = teclado.next().charAt(0);
		}
	
	
	
	}
}