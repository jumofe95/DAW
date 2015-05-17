package Estructuras_de_repeticion;

import java.util.Scanner;

public class EjercicioPPT72 {
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);	
		
		int i, j, valor;
		
		System.out.println("Valor: ");
		valor = teclado.nextInt();
		
		for(i=1; i<=valor; i++){
			
			for(j=1; j<=i; j++)
				System.out.print(j);
			System.out.println();
		}
		
		
		
		
		
		
	}
}
