package Estructuras_de_seleccion1;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String args[]) {
	
	int x, y;
	
	Scanner teclado = new Scanner(System.in);

	System.out.println("X= ");
	x = teclado.nextInt();
	
	System.out.println("Y= ");
	y = teclado.nextInt();
	
	
	if (x > 0){
		if (y > 0)
			System.out.println("Primer cuadrante.");
		if (y < 0)
			System.out.println("Cuarto cuadrante.");
		}
		
		
	if (x < 0){
		if (y > 0)
				System.out.println("Segundo cuadrante.");
		if (y < 0)
				System.out.println("Tercer cuadrante.");
		}
	
	
	if (x == 0){
		if (y == 0)
			System.out.println("Origen de coordenadas.");
		}
		
		
	
	if(x ==0 ){
		if (y !=0 )
			System.out.println("Eje Y.");
		}
	
	
	if(y ==0 ){
		if (x !=0 )
			System.out.println("Eje X.");
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}

