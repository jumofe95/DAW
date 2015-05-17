package Estructuras_de_repeticion;

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String args[]){
		
		
		Scanner teclado = new Scanner(System.in);	
		
	int i, nota=0, q=0, suspendidos=0, condicionados=0, aprobados=0;	
	
	
	for (i=0; i<=6; i++){
		
		System.out.println("Nota: ");
		nota = teclado.nextInt();	
		
		q = q + nota;
		
	
		if (nota < 4){
			suspendidos++;
		}
		
		if (nota == 4){
			condicionados++;
		}
		
		if (nota >= 5){
			aprobados++;
		}
		
	}
		System.out.println("Aprobados: "+aprobados);
		System.out.println("Condicionados: "+condicionados);
		System.out.println("Suspendidos: "+suspendidos);
	
		
		
		
		
		
		
		
		
	}
}
