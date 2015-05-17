package Estructuras_de_seleccion1;

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String args[]) {
		
	int t;
	Scanner teclado = new Scanner(System.in);
	
	
	System.out.println("Temperatura del agua: ");
	t = teclado.nextInt();
		
		if (t <= 0){
			System.out.println("Solido");
		}
			else if ((t > 0) && (t < 100)){
				System.out.println("Liquido");
			}
		
			else if (t >= 100){
				System.out.println("Gas");
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
