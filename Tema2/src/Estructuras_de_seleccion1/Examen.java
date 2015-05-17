package Estructuras_de_seleccion1;
import java.util.Scanner;
public class Examen {
	public static void main(String args[]) {

		double nota;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Nota: ");
		nota = teclado.nextDouble();

		if (nota >= 5) {
			if (nota > 10) {
				System.out.println("Error");} 
			else {
				System.out.println("Aprobado");}
		}

		else {
			if (nota < 0) {
				System.out.println("Error");
			} else {
				System.out.println("Suspendido");
			}
		}

	}
}