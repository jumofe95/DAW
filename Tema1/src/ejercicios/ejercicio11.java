/*Diseña un programa Java para resolver una ecuacion de primer grado con
una incognita (x), suponiendo que los coecientes de la ecuacion (C1 y C2) se
introducen desde teclado.*/


package ejercicios;

import java.util.Scanner;

public class ejercicio11 {
public static void main (String args[]) {
float inc1, inc2, resx;


Scanner teclado = new Scanner (System.in);

System.out.println("Incognita 1: ");
inc1 = teclado.nextFloat();

System.out.println("Incognita 2: ");
inc2 = teclado.nextFloat();

resx = -inc2 / inc1;

System.out.println("X = " +resx);



										}

						}
