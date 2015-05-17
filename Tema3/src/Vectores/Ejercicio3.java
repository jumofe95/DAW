package Vectores;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
	
	int cursoA[] = new int [5];
	int cursoB[] = new int [5];
	int i, sumaA=0, sumaB=0;
	
	System.out.println("Curso A:");
	for (i = 0; i < 5; i++) {
		System.out.println("Nota alumno "+i+": ");
		cursoA[i] = teclado.nextInt();
		sumaA = sumaA + cursoA[i];
	}

	System.out.println("Curso B:");
	for (i = 0; i < 5; i++) {
		System.out.println("Nota alumno "+i+": ");
		cursoB[i] = teclado.nextInt();
		sumaB = sumaB + cursoB[i];
	}
	
	
	if (sumaB>sumaA){
		System.out.println("Curso B obtuvo mejores notas");
	}
	
	else{
		System.out.println("Curso A obtuvo mejores notas");
	}
	
	
	
	
	
	}
}
