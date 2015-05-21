package Figuras;

public class Recta extends Figura1D {

	
	
	public Recta(String color, String ptoIni, String ptoFin) {
		super(color, ptoIni, ptoFin);
		
	}

	public void borrar(){
		System.out.println("Se ha borrado la recta");
	}
	
	public void dibujar(){
		System.out.println("Se ha impreso esta recta:");
		System.out.println("Color: "+getColor());
		System.out.println("Punto de inicio: "+getPtoIni());
		System.out.println("Punto final: "+getPtoFin());
		
	}
	public void cambiarColor(String color){
		setColor(color);
	}
}
