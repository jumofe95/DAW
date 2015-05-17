package Estructuras_de_repeticion;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		int i, precio,cantidad, min=0, max=0;
		
		System.out.println("Cantidad de coches: ");
		cantidad = teclado.nextInt();
		
		for (i=1; i<=cantidad; i++){
			System.out.println("Precio de coche " +i+ ": " );
			precio = teclado.nextInt();
			
			if (i==1){
				max = precio;
				min = precio;
			}
			
	
			if (precio > max){
				max = precio;	
			}
			
			
			if (precio < min){
				min = precio;	
			}
		
			
		}
		
		System.out.println("Precio minimo: "+min);
		System.out.println("Precio maxio: "+max);
	
	
	}	
}
