/*Considera el siguiente codigo:
int i = 10;
int n = i++%5;
>Cuales seran los valores de i y n despues de ejecutar el codigo? >y en el
siguiente caso?
int i = 10;
int n = ++i%5;*/

package ejercicios;

public class ejercicio19 {
	public static void main(String args[]){
	
		int i = 10;
		int n = i++%5;
		System.out.println(" : " +i);
		System.out.println(" : " +n);
		
		
		int q = 10;
		int w = ++q%5;
		System.out.println(" : " +q);
		System.out.println(" : " +w);


	
	
	}
}
