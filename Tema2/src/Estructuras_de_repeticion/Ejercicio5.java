package Estructuras_de_repeticion;

import java.util.Scanner;

public class Ejercicio5 {
public static void main(String args[]){
		
		Scanner teclado = new Scanner(System.in);

		double edad, suma=0, i, media=0;
	
		System.out.println("Edad de asistente: " );
		edad = teclado.nextInt();
		
		i = 1;
		while (edad > 0){
			
			suma = suma + edad;
			media = suma / i;
			
			System.out.println("Edad de asistente: " );
			edad = teclado.nextInt();
			i++;
			
		}
		
		System.out.println("La media de edad de los asistentes es: "+media);
		




}
}
	
