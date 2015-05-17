/*Escribir un programa en Java que pregunte un nombre, direccion y telefono
y escriba en pantalla una cha con dicha informacion.*/

package ejercicios;

import java.util.*;

public class ejercicio9 {
public static void main (String args[]){
	int telefono;
	String nombre, direccion;
	
	
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Nombre: ");
	nombre = teclado.nextLine();
	
	System.out.println("Direccion: ");
	direccion = teclado.nextLine();
	
	System.out.println("Telefono: ");
    telefono = teclado.nextInt();
    
    
    
    System.out.println("Nombre: " + nombre);
	System.out.println("Direccion: " + direccion);
	System.out.println("Telefono: " + telefono);
   
}

}