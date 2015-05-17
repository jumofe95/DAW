package Estructuras_de_seleccion1;

import java.util.Scanner;

public class Ejercicio6b {
	public static void main(String args[]) {
		
		int e1, e2, e3, e4; 
		
		
		Scanner teclado = new Scanner(System.in);
	
		
		System.out.println("Edad de persona 1: ");
		e1 = teclado.nextInt();
		
		System.out.println("Edad de persona 2: ");
		e2 = teclado.nextInt();
		
		System.out.println("Edad de persona 3: ");
		e3 = teclado.nextInt();
		
		System.out.println("Edad de persona 4: ");
		e4 = teclado.nextInt();
		
		
		
		int menor = e1;
		
		if (e2 < menor){
					menor = e2;
						System.out.println("Persona2 es el menor");
		}
			
				else if (e3 < menor){
					menor = e3;
						System.out.println("Persona3 es el menor");
				}
		
			
				else if (e4 < menor){
					menor = e4;
						System.out.println("Persona4 es el menor");
				}
		
				
				else {
					System.out.println("Persona1 es el menor");
				}
		
		
		
	}
}