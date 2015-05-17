/*Una empresa de transporte por carretera ha adquirido vehculos nuevos
que viajan mas rapido que los antiguos. La empresa deseara conocer como
afectara esto a la duracion de los viajes. Supongase que la reduccion media que
se consigue del tiempo total de viaje es del 15*/


package ejercicios;

import java.util.*;

public class ejercicio22 {
	public static void main(String args[]) {
	
		int horaSalida, horaLlegada, tiempoViaje, horaSalidaMin, horaLlegadaMin, tiempoViajeNueva, horaLlegadaNueva;
		
		
		/*
		 * horaSalida				hora de salida
		 * horaSalidaMin			hora de salida en minutos			((horaSalida / 100) * 60) + (horaSalida % 100);
		 * 
		 * horaLlegada... 			hora de llegada con coche antiguo
		 * horaLlegadaMin...		hora de llegada con coche antiguo en minutos
		 * horaLlegadaNueva... 		hora de llegada con coche nuevo				(horaSalida + tiempoViajeaNueva)
		 * 
		 * tiempoViaje... 			duracion viaje (en min) con coche antiguo	(horaLlegada - horaSalida)
		 * tiempoViajeNueva... 		duracion viaje (en min) con coche nuevo		(tiempoViaje * 0.85)
	
		 */

		
		Scanner teclado = new Scanner(System.in);

		
		
		System.out.println("Hora salida: ");
		horaSalida = teclado.nextInt();
		System.out.println("Hora llegada: ");
		horaLlegada = teclado.nextInt();
		
	
		horaSalidaMin = ((horaSalida / 100) * 60) + (horaSalida % 100);
		horaLlegadaMin = ((horaLlegada / 100) * 60) + (horaLlegada % 100);
		tiempoViaje = horaLlegadaMin - horaSalidaMin;
		tiempoViajeNueva = (85 * tiempoViaje)/100;
		horaLlegadaNueva = horaSalida + tiempoViajeNueva;
		
		
		System.out.println("Hora de llegada con vehiculo nuevo: "+horaLlegadaNueva);
		System.out.println("Duracion de viaje con vehiculo nuevo: " +tiempoViajeNueva+ " minutos");
	
		
		
	
	}
}
