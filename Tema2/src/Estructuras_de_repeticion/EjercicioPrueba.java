package Estructuras_de_repeticion;

import java.util.Scanner;

public class EjercicioPrueba {
public static void main(String args[]) {
		
		int n, i;
		double q=0;
		
	Scanner teclado = new Scanner(System.in);

	for (i=1; i<=10; i++){
		System.out.println("Numero: ");
		n = teclado.nextInt();
		q=q+n;
		
		System.out.println("Suma: "+q);
	}
	
	System.out.println("Media: "+q/10);
	
	


	





	

}
}