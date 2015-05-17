package Vectores;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		
		int vector[] = new int[8];
		int i;
		
		
		for(i=0; i<8; i++){
			System.out.println("Valor para acumular en elemento "+i);
			vector[i] = teclado.nextInt();
		}
		
		for(i=0; i<8; i++){
			System.out.println("Elemento " +i+ ": " +vector[i]);
		}
		
		
		System.out.println("Mayores que 36:");
		for(i=0; i<8; i++){
			if (vector[i] > 36){
				System.out.println(+vector[i]);
			}
		}
		
		
		System.out.println("Mayores que 50: ");
		for(i=0; i<8; i++){
			if (vector[i] > 50){
				System.out.println(+vector[i]);
			}
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
