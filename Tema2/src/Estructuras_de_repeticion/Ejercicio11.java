package Estructuras_de_repeticion;

import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String args[]){
	
		Scanner teclado = new Scanner(System.in);	
		
		int sueldo, cantidad, i, q=0, sueldoMAX=0;	
		
		
		System.out.println("Cantidad de sueldos a introducir: ");
		cantidad = teclado.nextInt();
		
		for (i=1; i<=cantidad; i++){
			System.out.println("Sueldo " +i+ ":");
			sueldo = teclado.nextInt();
			q = q + sueldo;
			
			if (i==1){
				sueldoMAX = sueldo;
			}
			

			if (sueldo > sueldoMAX){
				sueldoMAX = sueldo;	
			}
	
		
		}//fin bucle
		
		
		System.out.println("Mayor sueldo: "+sueldoMAX);

		
		
		
	}	
}
