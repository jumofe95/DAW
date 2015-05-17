/*Diseña un programa Java para leer las longitudes de los lados de un triangulo
(L1, L2, L3) y calcular el area del mismo de acuerdo con la siguiente
formula:*/


package ejercicios;

import java.util.*;

public class ejercicio15 {
	public static void main(String args[]) {

	float l1, l2, l3, SP;
	double res;
	
Scanner teclado = new Scanner(System.in);	

System.out.println("Lado 1: ");
l1 = teclado.nextFloat();

System.out.println("Lado 2: ");
l2 = teclado.nextFloat();

System.out.println("Lado 3: ");
l3 = teclado.nextFloat();

SP = (l1 + l2 + l3) / 2;
res = Math.sqrt(SP*((SP - l1)*(SP - l2)*(SP- l3)));

System.out.println("El area del triángulo es: " +res);
	
	

	}
}

