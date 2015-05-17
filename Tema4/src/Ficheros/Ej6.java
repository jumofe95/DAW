package Ficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ej6 {
	public static void main(String[] args) {
		Scanner in=null;
		PrintWriter out=null;
		
		
		try {
			 in = new Scanner(new FileReader("preciosSinIVA.txt"));
			 out = new PrintWriter("preciosConIVA.txt");

		String producto;
		double N, impuesto=1.21, iva;
		
		do{
			producto = in.next();
			N = in.nextInt();
			iva = N*impuesto;
	
			out.println(producto+ " "+iva);

		}while(in.hasNext());
		
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}in.close(); out.close();			
		
		System.out.println("EXTRAIDO");
	}
}
