package Estructuras_de_seleccion1;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String args[]) {
	
		int anyo;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Año: ");
		anyo = teclado.nextInt();

		if (anyo < 2014){
			System.out.println("Pasado");}
		
		if (anyo == 2014){
			System.out.println("Presente");}
		
		if (anyo > 2014){
			System.out.println("Futuro");}
	
	
	
	}
}
