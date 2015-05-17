package Estructuras_de_seleccion1;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String args[]) {
		
		int e1, e2, e3;
		
		
		Scanner teclado = new Scanner(System.in);
	
		
		System.out.println("Edad de persona 1: ");
		e1 = teclado.nextInt();
		
		System.out.println("Edad de persona 2: ");
		e2 = teclado.nextInt();
		
		System.out.println("Edad de persona 3: ");
		e3 = teclado.nextInt();
		
		
		
		if ((e1>e2 && e2>e3) || (e2>e1 && e3<e1)){
		System.out.println("Persona3 es el menor");
		}
		
		else if ((e3<e2 && e1<e3) || (e3>e2 && e2>e1)){
			System.out.println("Persona1 es el menor");
		}
			
		else {
			System.out.println("Persona2 es el menor");
		}
	
	
	}
}
