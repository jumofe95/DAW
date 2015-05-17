package Estructuras_de_seleccion1;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String args[]) {

		int a, b, c;
		double x1, x2, x, d;
		
		
		Scanner teclado = new Scanner(System.in);
	
		
		System.out.println("a= ");
		a = teclado.nextInt();
		
		System.out.println("b= ");
		b = teclado.nextInt();
		
		System.out.println("c= ");
		c = teclado.nextInt();
		
		d = (Math.pow(b,2) - 4 * a * c);
		
		
		if (a == 0){
			x = (-c / b);
			System.out.println("x = " +x);
		}
		
		else if (d < 0){
			System.out.println("ERROR (raiz negativa)");
		}
			
		else{
			x1 = ((-b + Math.sqrt(d)) / (2 * a));
			x2 = ((-b - Math.sqrt(d)) / (2 * a));
			System.out.println("x1 = "+x1);
			System.out.println("x2 = "+x2);
		}


	}
}
