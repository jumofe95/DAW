package Estructuras_de_repeticion;

import java.util.Scanner;
public class EjercicioPrueba8 {	
public static void main(String args[]){
		
		Scanner teclado = new Scanner(System.in);
		
		int numero;
	
	do {
		System.out.println("(1)Extraer dinero.");
		System.out.println("(2)Ingresar dinero.");
		System.out.println("(3)Ultimos movimientos.");
		System.out.println("(4)Salir.");
		
		System.out.println("Que desea hacer?: ");
		numero = teclado.nextInt();
		
	} while (numero > 4 || numero < 1);
	
	
	switch(numero){
	case 1:
		System.out.println("Extrayendo dinero. Espere...");
		break;
		
	case 2:
		System.out.println("Ingresando dinero. Espere...");
		break;
		
	case 3:
		System.out.println("Mostrando ultimos movimientos. Espere...");
		break;
		
	case 4:
		System.out.println("Saliendo. Espere...");
		break;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
