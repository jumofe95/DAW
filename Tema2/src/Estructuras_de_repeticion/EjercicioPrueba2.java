package Estructuras_de_repeticion;

import java.util.Scanner;

public class EjercicioPrueba2 {
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		int i, cantidad, numero, suma = 0;
		
		System.out.println("¿Cuántos números quiere introducir? ");
		cantidad = teclado.nextInt();
		
		for (i=1; i<=cantidad; i++){
			System.out.println("Escribe un numero: ");
			numero = teclado.nextInt();
			
			if (numero % 2 == 0){
				suma = suma + numero;
				System.out.println("La suma de los numeros pares es: "+suma);
			}
		}
	
		
	
	
	
	}
}
