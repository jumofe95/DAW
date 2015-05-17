package Estructuras_de_repeticion;

import java.util.Scanner;

public class EjercicioPrueba6 {
	public static void main(String args[]){
		
		Scanner teclado = new Scanner(System.in);

		int numero=1, suma=0;
	
		
		while (numero != 0){
			System.out.println("Introduce un numero: " );
			numero = teclado.nextInt();
			suma = suma + numero;
		}
		
		System.out.println("La suma de todos los numeros es: "+suma);
		
		
		}
}
	