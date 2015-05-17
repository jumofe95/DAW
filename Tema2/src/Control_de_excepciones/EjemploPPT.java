package Control_de_excepciones;

import java.util.Scanner;

public class EjemploPPT {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);

		try {
			int a = 2;
			int b;
			System.out.println("numero:");
			b = teclado.nextInt();
			System.out.println("El resultado de la división es:");
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("La excepción es :" + e);

		}
		System.out.println("fin de programa");
	
	}
}