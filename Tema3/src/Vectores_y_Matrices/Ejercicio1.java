package Vectores_y_Matrices;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		int vector[][] = new int [2][4];
		int i, j;
		

		for (i=0; i<2; i++){
		System.out.print("Fila "+i);
			for (j=0; j<4; j++){
				vector[i][j] = teclado.nextInt();
			}
		}
		
		System.out.println("________________________________");
		
		for(i=0; i<2; i++){
			for(j=0; j<4; j++){
			System.out.println(" "+(vector[0][j])+ " "+(vector[1][j]));
			}
		}
	
	}
}
