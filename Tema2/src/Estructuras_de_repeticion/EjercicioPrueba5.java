package Estructuras_de_repeticion;

import java.util.Scanner;

public class EjercicioPrueba5 {

	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		int posicion_max=0, posicion_min=0,  i, numero,cantidad, min=0, max=0;
		
		System.out.println("Cantidad numeros: ");
		cantidad = teclado.nextInt();
		
		for (i=1; i<=cantidad; i++){
			System.out.println("Numero " +i+ ": " );
			numero = teclado.nextInt();
			
			if (i==1){
				max = numero;
				min = numero;
				posicion_max=1;
				posicion_max=1;
			}
			
			
			if (numero > max){
				max = numero;
				posicion_max=i;
			}
			
			
			if (numero < min){
				min = numero;	
				posicion_min=i;
			}
		
			
		}
		System.out.println("Numero minimo: "+min);
		System.out.println("Numero maxio: "+max);
		System.out.println("posicion: "+posicion_max);
		System.out.println("posicion: "+posicion_min);
	
	}
	
}
