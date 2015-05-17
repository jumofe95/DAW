package Estructuras_de_seleccion1;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String args[]) {
	
		int precio, v;
		int tiempo;

		
		System.out.println("(1)Patin a pedales");
		System.out.println("(2)Patin a motor");
		System.out.println("(3)Tabla windsurf");
		System.out.println("(4)Moto acuatica");
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Numero de vehiculo: ");
		v = teclado.nextInt();
		
		System.out.println("Tiempo (horas):  ");
		tiempo = teclado.nextInt();
		
		
		switch(v){
		case 1:
			precio = (2 * tiempo);
			System.out.println(precio+"€");
			break;
			
		case 2:
			precio = (6 * tiempo);
			System.out.println(precio+"€");
			break;
			
		case 3:
			precio = (4 * tiempo);
			System.out.println(precio+"€");
			break;
			
		case 4:
			precio = (7 * tiempo);
			System.out.println(precio+"€");
			break;
		}
	

		
		
		
	
	
	}
}
