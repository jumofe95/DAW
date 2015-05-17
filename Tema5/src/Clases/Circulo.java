package Clases;

public class Circulo {

	double radio;
	
	public void asignaRadio(double r){
		radio=r;
	}
	
	public double daRadio(){
		return radio;
	}
	
	public double longitud(){		
		double longitud = (2*3.14*radio);
		return longitud;
	}
	
	public double area(){		
		double area = (3.14*radio*radio);
		return area;
	}
	
	
	public boolean mayorQue(Circulo otroCirculo){
		boolean mayor=false;
		if (area()>otroCirculo.area()){
		mayor = true;	
		}
		return mayor;
	}
	
	
}
