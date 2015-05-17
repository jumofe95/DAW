/*Escribir un programa en Java para calcular la supercie y el volumen de
una esfera a partir del valor del radio (supongase que es un valor positivo).*/


package ejercicios;

import java.util.*;

public class ejercicio16 {
public static void main(String args[]){

	int radio;
	double area, volumen;
	
Scanner teclado = new Scanner(System.in);

System.out.println("Introduce el radio de la esfera: ");
radio = teclado.nextInt();

area = Math.pow(4 * Math.PI * radio, 2);
volumen = Math.pow(4 * Math.PI * radio, 2) / 3;

System.out.println("El area de la esfera es: " +area+ " metros cuadrados");

System.out.println("El volumen de la esfera es: " +volumen+ " metros cubicos");






}
}
