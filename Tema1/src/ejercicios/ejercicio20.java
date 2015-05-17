/*Crea un programa en Java que dada una edad en a~nos imprima por pantalla
la edad en en minutos y segundos.*/


package ejercicios;

import java.util.*;

public class ejercicio20 {
	public static void main(String args[]){
		
		int anyos;
		double minutos, segundos;
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Años: ");
		anyos = teclado.nextInt();
		
		minutos = (24 * (365 * anyos)) * 60;
		segundos = ((24 * (365 * anyos) * 60) * 60);
		
		System.out.println(+anyos+ " años son " +minutos+ " minutos");
		System.out.println(+anyos+ " años son " +segundos+ " segundos");
		
		
	}
}
