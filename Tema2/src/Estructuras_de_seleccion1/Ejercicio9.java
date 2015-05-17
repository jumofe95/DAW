package Estructuras_de_seleccion1;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String args[]) {
	
	int unidades, grupos;
	double preciounidad, tresxdos, treintaxcien;
	
		Scanner teclado = new Scanner(System.in);
	
		
		System.out.println("Numero de unidades: ");
		unidades = teclado.nextInt();
		System.out.println("Precio por unidad: ");
		preciounidad = teclado.nextFloat();
		
		
		grupos = (unidades / 3);
		tresxdos = (2 * grupos) + ((unidades % 3) * preciounidad);
		
		
		
		treintaxcien = (unidades * preciounidad) * 0.7;
		
		
		System.out.println("Unidades: " +unidades);
		System.out.println("Total con la oferta 3x2: " +tresxdos+"€");
		System.out.println("Total con la oferta del 30%: " +treintaxcien+"€");
	
	
		
		if (tresxdos < treintaxcien){
			System.out.println("Oferta mas conveniente: 3x2");
		}
		
		else{
			System.out.println("Oferta mas conveniente: 30%");
		}
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
