package Estructuras_de_seleccion1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String args[]) {

		int a, b, c;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Lado a: ");
		a = teclado.nextInt();

		System.out.println("Lado b: ");
		b = teclado.nextInt();

		System.out.println("Lado c: ");
		c = teclado.nextInt();

		if (a == b && a == c) {
			System.out.println("Equilatero");	
		} 
		
		
		else if ((a != b && a != c && b == c) || (a != b && a == c && b != c) || (a == b && a != c && b != c)) {
			System.out.println("Isosceles");	
		} 
		
		
		else {
			System.out.println("Escaleno");
		}
		

		int p;
		double area;

		p = (a + b + c) / 2;
		area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

		System.out.println("El area del triangulo es: " + area);

	}
}
