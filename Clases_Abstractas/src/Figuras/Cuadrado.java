package Figuras;

public class Cuadrado extends Figura2D {

	private int x0;
	private int y0;
	private int x1;
	private int y1;
	
	
	public Cuadrado(String color, String colorRelleno, int x0, int y0, int x1, int y1) {
		super(color, colorRelleno);

		this.x0=x0;
		this.y0=y0;
		this.x1=x1;
		this.y1=y1;
	}


public void CambiaRelleno(String color){
	setColorRelleno(color);
	}

public void borrar(){
	System.out.println("Se ha borrado el cuadrado");
}

public void dibujar(){
	System.out.println("Se ha impreso este cuadrado:");
	System.out.println("Color: "+getColor());
	System.out.println("Color Relleno: "+getColorRelleno());
	System.out.println("x0: "+x0);
	System.out.println("y0: "+y0);
	System.out.println("x1: "+x1);
	System.out.println("y1: "+y1);
	
}
public void cambiarColor(String color){
	setColor(color);
}
	

}
