package Clases;

	/*Tendra dos atributos, x e y, que guardan 
	las coordenadas.*/
public class Punto {
	public int x;
	public int y;
	
	
	/*Habra un constructor sin parametros que 
	crea un punto en (0, 0) y otro al que se le 
	pueden pasar las coordenadas del punto.*/
	public Punto(){
		x=0;
		y=0;
	}
	
	public Punto(int x2, int y2){
		x=x2;
		y=y2;
	}
	
	
	/*Tambien habra metodos para obtener las 
	coordenadas y para imprimir el punto con 
	el formato (x,y)*/
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	
	public void imprimir(){
		System.out.println("("+x+":"+y+")");
	}
}
