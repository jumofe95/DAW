package Ficheros;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ej4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int N, i, j;
		String aux;
		
		System.out.println("Numero de palabras a introducir");
		N = teclado.nextInt();
		
		String [] palabra= new String [N];
		
		for(i=0; i<N; i++){
		System.out.println("Palabra: ");
		palabra[i] = teclado.next();
		}teclado.close();

		for(j=0; j<(N-1); j++){
			for(i=0; i<(N-1); i++)
			if (palabra[i].compareTo(palabra[i+1])>0){
				aux = palabra[i];
				palabra[i] = palabra[i+1];
				palabra[i+1] = aux;
			}
		}

		PrintWriter out=null;
		try {
			 out = new PrintWriter("Ej4.txt");
			
			
		for (i=0; i<N; i++){
		out.println((i+1)+". " +palabra[i]);
		}
		
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}out.close();
		
		
	}
}
