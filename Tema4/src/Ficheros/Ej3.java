package Ficheros;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ej3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int N, i, numero;
		PrintWriter out=null;
		PrintWriter out2=null;

		
		try {
			 out = new PrintWriter("Ej3_escritura1.txt");
			 out2 = new PrintWriter("Ej3_escritura2.txt");
		
			System.out.println("Numeros a escribir: ");			
			N = teclado.nextInt();		
			
			for(i=0; i<N; i++){		
				System.out.println("Numero: ");				
				numero = teclado.nextInt();	
				out.print(numero+" ");
				out2.println(numero);
			}teclado.close();
			System.out.println("EXTRAIDO A FICHEROS");				


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}out.close(); out2.close();
	}
}
