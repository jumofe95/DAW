package Vectores;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
	
		String nombres[] = new String [5];
		int sueldos[] = new int [5];
		int i;
		int sueldo_mayor=0;
		String nombre_mayor = "null";
	
		
		for (i=0; i<5; i++){
		System.out.println("Nombre: ");
		nombres[i] = teclado.next();
		
		System.out.println("Sueldo: ");
		sueldos[i] = teclado.nextInt();
			
	
		if (i == 0){
			sueldos[i] = sueldo_mayor;
			}
		
			if (sueldos[i] > sueldo_mayor){
			sueldo_mayor = sueldos [i];
			nombre_mayor = nombres[i];
			}
		
		}
	
	
		System.out.println("Sueldo mayor: "+sueldo_mayor);
		System.out.println("Nombre: "+nombre_mayor);
	
	
	}
}
