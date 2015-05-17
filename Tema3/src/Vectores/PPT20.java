package Vectores;

import java.util.Scanner;

public class PPT20 {
	public static void main(String args[]){
		int dias;
		int lluvia[];
		int media_lluvia;
		int suma_lluvia = 0;

		Scanner teclado = new Scanner(System.in);

		System.out.println("introduce dias");
		dias = teclado.nextInt();
		lluvia = new int[dias];

		for (int i = 0; i <= 5; i++) {
			System.out.println("introduce lluvia");
			lluvia[i] = teclado.nextInt();
			suma_lluvia = suma_lluvia + lluvia[i];
		}
		
		media_lluvia = suma_lluvia / 6;
		System.out.println("la media de la lluvia es " + media_lluvia);
		
		for (int i = 0; i <= 5; i++) {
			if (lluvia[i] >= (2 * media_lluvia)) {
				System.out.println("el dia " +i+ " la lluvia fue igual o superior al doble");
			}
		}
	}
}