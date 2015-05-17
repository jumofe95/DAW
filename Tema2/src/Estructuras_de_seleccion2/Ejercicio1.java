package Estructuras_de_seleccion2;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String args[]) {

	int maquina;
	
	Scanner teclado = new Scanner(System.in);
	
		
		System.out.println("(1)Cafe solo");
		System.out.println("(2)Cortado");
		System.out.println("(3)Chocolate");
		System.out.println("(4)Leche");
		
		System.out.println("¿Que tomaras?");
		maquina = teclado.nextInt();
		
		
		switch(maquina){
		case 1:
			System.out.println("0,35€");
			break;
			
		case 2:
			System.out.println("0,35€");
			break;
			
		case 3:
			System.out.println("0,40€");
			break;
			
		case 4:
			System.out.println("0,30€");
			break;
			
		default:
			System.out.println("ERROR");
	
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
