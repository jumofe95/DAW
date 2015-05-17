/*Construir un programa que, dado un numero total de horas, devuelve el
numero de semanas, das y horas equivalentes. Por ejemplo, dado un total de
1000 horas debe mostrar 5 semanas, 6 das y 16 horas.*/


package ejercicios;

import java.util.Scanner;

public class ejercicio17 {
	public static void main(String args[]){
	
		int horasTotales, semanas, dias, horas2, horasRestantes;

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Horas: ");
		horasTotales = teclado.nextInt();
	
		
		semanas = horasTotales / 168;
		horasRestantes = horasTotales % 168;
		dias = horasRestantes / 24;
		horas2 = horasRestantes % dias;
	
		
		System.out.println(semanas+ " semanas");
		System.out.println(dias+ " dias");
		System.out.println(horas2+ " horas");
	}
}
