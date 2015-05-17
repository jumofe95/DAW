/*Escribir un programa en Java que detecte si un numero es par o impar.
En el caso caso que el numero sea par, se imprimira por pantalla un 1 y en caso
contrario se imprimira un 0.*/


package ejercicios;

import java.util.*;

public class ejercicio21 {
public static void main(String args[]) {
	
	int num;
	
	Scanner teclado = new Scanner(System.in);

	System.out.println("Introduce el numero: ");
	num = teclado.nextInt();
	
	/*
		if(num % 2 == 0)
			 System.out.println("El numero es par");    
        else
            System.out.println("El numero es impar");
	*/	
	
		String a = ((num % 2) == 0) ? "par" : "impar";
		System.out.println("Es "+a);
	
	
}
}
