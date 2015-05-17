package Ficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {

				Scanner in =null;
				try {
					in = new Scanner(new FileReader("Ej2.txt"));
				

					do{
						System.out.print(in.next().toLowerCase()+" ");
						in.useDelimiter(",");
					}while(in.hasNext());


				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}finally{
					if(in!=null)
						in.close();
				}
	}
}
