package Estructuras_de_repeticion;

import java.util.Scanner;
public class EjercicioPrueba7 {
public static void main(String args[]){
		
		Scanner teclado = new Scanner(System.in);
	int numero;
	
	do {
		System.out.println("Numero: ");
		numero = teclado.nextInt();
	} while (numero < 10 || numero > 20);
	
	
}
}