package Clases;

public class Cafetera {

	public int capacidadMaxima;
	public int cantidadActual;
	
	
	public Cafetera(){
		capacidadMaxima=1000;
		cantidadActual=0;
	}
	
	public Cafetera(int maxima){
		capacidadMaxima=maxima;
		cantidadActual=capacidadMaxima;
	}

	public Cafetera(int cantidad, int maxima){
		capacidadMaxima=maxima;
		cantidadActual=cantidad;	
		if(cantidad>maxima){
			cantidad=maxima;
		}
	}

	
	public void llenarCafetera(){
		cantidadActual=capacidadMaxima;
	}
	
	public void servirTaza(int servir){
		if(cantidadActual >= servir){
		cantidadActual = cantidadActual - servir;
	}else {
		cantidadActual=0;
				}
		}
	
	public void vaciarCafetera(){
		cantidadActual=0;
	}
	
	public void agregarCafe(int agregar){
		cantidadActual=cantidadActual+agregar;
	}

}
