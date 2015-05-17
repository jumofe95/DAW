/*Dise~na un programa Java que calcule la suma, resta, multiplicacion y divisi
on de dos numeros introducidos por teclado. Incorpora tambien las funciones
que permitan realizar la potencia de un numero y la raz cuadrada del otro.*/


package ejercicios;

import java.util.*;

public class ejercicio12 {
public static void main (String main[]) {

	float n1, n2, res;
	
	
Scanner teclado = new Scanner(System.in);


System.out.println("Numero 1: ");
n1 = teclado.nextInt();
System.out.println("Numero 2: ");
n2 = teclado.nextInt();


res = n1 + n2;
System.out.println(+n1+ " + " +n2+ " = " +res);

res = n1 - n2;
System.out.println(+n1+ " - " +n2+ " = " +res);

res = n1 * n2;
System.out.println(+n1+ " * " +n2+ " = " +res);

res = n1 / n2;
System.out.println(+n1+ " / " +n2+ " = " +res);


System.out.println("Raiz cuadrada de " +n1+ " = " +Math.sqrt(n1));
	

	int potencia;

System.out.println("\nIntroduce la potencia a la que se elevara " +n2+ ":");
potencia = teclado.nextInt();

System.out.println(+n2+ " elevado a " +potencia+ " = " +Math.pow(potencia, n2));

	
	
	
	
	
										}
						}
