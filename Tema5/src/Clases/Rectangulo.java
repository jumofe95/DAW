package Clases;

import java.util.Scanner;

public class Rectangulo {
	Scanner teclado= new Scanner(System.in);

	/*Crea una clase Rectangulo que modele rectangulos por medio de cuatro
	puntos (los vertices). Ten en cuenta las siguientes indicaciones*/
	public int x1;
	public int y1;

	public int x2;
	public int y2;
	
	public int x3;
	public int y3;
	
	public int x4;
	public int y4;
	
	/*Dispondra de dos constructores: uno que cree un rectangulo partiendo
	de sus cuatro vertices y otro que cree un rectangulo partiendo de la base
	y la altura, de forma que su vertice inferior izquierdo este en (0,0)*/
	public Rectangulo(int valorx1, int valory1, int valorx2, int valory2, 
						int valorx3, int valory3, int valorx4, int valory4){
		
		x1=valorx1;
		y1=valory1;

		x2=valorx2;
		y2=valory2;
	
		x3=valorx3;
		y3=valory3;
		
		x4=valorx4;
		y4=valory4;
	
	}

	public Rectangulo(int base, int altura){

		x1=0;
		y1=0;

		x2=0;
		y2=altura;
		
		x3=base;
		y3=altura;
			
		x4=base;
		y4=0;
		
		
		System.out.print(x1+",");
		System.out.println(y1);

		System.out.print(x2+",");
		System.out.println(y2);

		System.out.print(x3+",");
		System.out.println(y3);

		System.out.print(x4+",");
		System.out.println(y4);


	}
		
	
	
	/*La clase tambien incluira un metodo para calcular la superficie y otro
	metodo que desplace el rectangulo en el plano.*/
	
	public int getSuperficie(){
		System.out.print("Superficie: ");
		int superficie = x3 * y3;
		System.out.println(superficie);

		return superficie;
	}
	
	public int desplazar(int d){
				
		
		x1=0+d;
		y1=0+d;

		x2=0+d;
		y2=y2+d;
		
		x3=x3+d;
		y3=y3+d;
			
		x4=x4+d;
		y4=0+d;
		
		
		System.out.println("Distancia del rectangulo actual: ");

		System.out.println("("+x1+":"+y1+")");
		System.out.println("("+x2+":"+y2+")");
		System.out.println("("+x3+":"+y3+")");
		System.out.println("("+x4+":"+y4+")");
		
return d;
	}

	
}
