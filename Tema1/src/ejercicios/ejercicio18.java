/*Construir un programa que calcule y muestre por pantalla las races de
la ecuacion de segundo grado de coecientes reales. Los valores de los coe-
cientes se indican en el propio codigo del programa mediante sentencias de
asignacion a variables reales. Siendo la ecuacion de segundo grado de la forma:
f(x) = a  x2 +b  x+c, entonces las expresiones de las raices correspondientes
se indican a continuacion:*/


package ejercicios;

import java.util.Scanner;

public class ejercicio18 {
	public static void main(String args[]){
	
	int a, b, c;
	double x1, x2;
	

	Scanner teclado = new Scanner(System.in);
	
	System.out.println("a= ");
	a = teclado.nextInt();

	System.out.println("b= ");
	b = teclado.nextInt();

	System.out.println("c= ");
	c = teclado.nextInt();
	
	double discriminante =(Math.pow(b,2) - 4 * a * c);
	System.out.println("discriminante: "+discriminante);

	
	x1 = (-b + Math.sqrt((Math.pow(b,2) - 4 * a * c))) / 2*a;
	x2 = (-b - Math.sqrt((Math.pow(b,2) - 4 * a * c))) / 2*a;
	
	

	System.out.println("x1= "+x1);
	System.out.println("x2= "+x2);
	
	
}
}