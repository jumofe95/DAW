package Estructuras_de_seleccion1;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String args[]) {

		char c;
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Caracter: ");
		c = teclado.next().charAt(0);
		
		if (c >= 'a' && c <= 'z'){
			System.out.println("Letra minuscula.");
		}
	
			else if (c >= 'A' && c <= 'Z'){
				System.out.println("Letra mayuscula.");
			}
	
		
			else if (c >= '0' && c <= '9'){
				System.out.println("Numero.");
			}
		
		
			else if (c == ',' || c == '.' || c == ';' || c == ':' ){
				System.out.println("Signo de puntuacion.");
			}
		
		else
			System.out.println("ERROR");
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}