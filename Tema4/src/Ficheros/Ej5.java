package Ficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Ej5 {
	public static void main(String[] args) {
		Scanner in = null;
		try {
			in = new Scanner(new FileReader("num_enteros.txt"));
		
		int N, cont=0, suma=0;
		
		do{
		N = in.nextInt();
		suma = suma + N;
		System.out.println(N);
		cont++;
		}while(in.hasNext());
		
		System.out.println("Cantidad de numeros: " +cont);
		System.out.println("Suma: " +suma);
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}in.close();
	}
}
