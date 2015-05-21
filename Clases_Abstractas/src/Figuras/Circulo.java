package Figuras;

public class Circulo extends Figura2D{

	


	private int xCentro;
	private int yCentro;
	private int radio;
	
	public Circulo(String color, String colorRelleno, int xCentro, int yCentro) {
		super(color, colorRelleno);
	
	
		this.xCentro=xCentro;
		this.yCentro=yCentro;
	}
	
public void CambiaRelleno(String color){
	setColorRelleno(color);
	}

public void borrar(){
	System.out.println("Se ha borrado el circulo");
}

public void dibujar(){
	System.out.println("Se ha impreso este circulo:");
	System.out.println("Color: "+getColor());
	System.out.println("Color Relleno: "+getColorRelleno());
	System.out.println("xCentro: "+xCentro);
	System.out.println("yCentro: "+yCentro);
	
}
public void cambiarColor(String color){
	setColor(color);
}
}
	
	

