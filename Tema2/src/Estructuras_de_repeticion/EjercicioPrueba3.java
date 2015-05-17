package Estructuras_de_repeticion;

import java.util.Scanner;

public class EjercicioPrueba3 {
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		int i, numero;
		
		System.out.println("Numero ");
		numero = teclado.nextInt();
		
		for (i=1; i<=10; i++){
			System.out.println(numero+ " x " +i+ " = " +numero*i);
			
		}
	
	}
}
