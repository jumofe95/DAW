package Estructuras_de_seleccion2;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String args[]) {

int nota;

Scanner teclado = new Scanner(System.in);


System.out.println("Nota");
nota = teclado.nextInt();

if ((nota >= 0) && (nota < 5)) {
	System.out.println("Suspendido");
}

else if ((nota >= 5) && (nota < 7)) {
	System.out.println("Aprobado");
}
	
else if ((nota >= 7) && (nota < 9)) {
	System.out.println("Notable");
}
	
else if ((nota >= 9) && (nota <= 10)) {
	System.out.println("Sobresaliente");
}
	
else{
	System.out.println("ERROR");
}
	
	
	
	
	
	
	
	
	
	}
}
