package Clases;
public class Complejo {
//atributos
	double pReal;
	double pImag;
//metodos	
	public void asignar(double r, double i){
		pReal=r;
		pImag=i;
	}
	
	public void sumar(double r, double i){
		pReal=pReal+r;
		pImag=pImag+i;	
	}
	
	public void imprimir(){		
		System.out.println("pReal: "+pReal);
		System.out.println("pImag: "+pImag);
	}
	
	
	
	
}
