/*Escribir un programa en Java que transforme una temperatura dada en
grados Fahrenheit a grados Celsius, siendo 1oC=33.8oF.*/

package ejercicios;

import java.util.*;

public class ejercicio10 {
public static void main (String args[]){
	double gradosF, gradosC;

Scanner teclado = new Scanner(System.in);
System.out.println("Introduce los grados Fharenheit que deseas transformar en Celsius: ");
gradosF = teclado.nextDouble();


gradosC = (gradosF - 32) / 1.8;

System.out.println(+gradosF+ " ºF = " +gradosC+ " ºC.");

										}
						}
