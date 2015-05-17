package Estructuras_de_seleccion1;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String args[]) {

		
		float a, b, c;
		
		
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Precio producto A");
		a = teclado.nextFloat();
		
		System.out.println("Precio producto B");
		b = teclado.nextFloat();
		
		System.out.println("Precio producto C");
		c = teclado.nextFloat();

	
		if (a > b && b > c){
			System.out.println("A, B, C");
		}
		
		else if (a > c && c > b){
			System.out.println("A, C, B");
		}
	
		else if (b > a && a > c){
			System.out.println("B, A, C");
		}
		
		else if (b > c && c > a){
			System.out.println("B, C, A");
		}
		
		else if (c > a && a > b){
			System.out.println("C, A, B");
		}
	
		else if (c > b && b > a){
			System.out.println("C, B, A");
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
