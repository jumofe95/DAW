package Ficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Ej1 {
	public static void main(String[] args) {
		
		Scanner in =null;
		try {
			in = new Scanner(new FileReader("Ej1.txt"));
		

			do{
				System.out.print(in.next().toUpperCase()+" ");
			}while(in.hasNext());


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally{
			if(in!=null)
				in.close();
		}
	}
}
