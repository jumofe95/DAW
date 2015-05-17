package Estructuras_de_repeticion;

import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String args[]){
		
		Scanner teclado = new Scanner(System.in);
		
		int i, n, q=0, negativo=0;
		
		for (i=1; i<=10; i++){
			System.out.println("Numero " +i+ ":");
			n = teclado.nextInt();
			q = q + n;
	
		if (n<0){
			negativo++;
		}
		
		}//fin bucle
		
		System.out.println("Numeros negativos: "+negativo);
		
		
		
		
		
		
		
		
		
	}
}
