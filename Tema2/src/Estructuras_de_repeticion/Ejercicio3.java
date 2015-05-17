package Estructuras_de_repeticion;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String args[]) {
		
		int n, i, q=0;
		
	Scanner teclado = new Scanner(System.in);

	for (i=1; i<=15; i++){
		System.out.println("Numero: ");
		n = teclado.nextInt();
		q=q+n;
	}
	
	System.out.println("Suma total: "+q);
		
	
	
	}
}