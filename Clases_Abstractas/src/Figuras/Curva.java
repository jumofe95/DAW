package Figuras;

public class Curva extends Figura1D {
	
	
	
	private int radio;
	
public Curva(String color, String ptoIni, String ptoFin, int radio) {
	super(color, ptoIni, ptoFin);
		
		this.radio=radio;
	}

public void dibujar(){
	System.out.println("Se ha impreso esta curva:");
	System.out.println("Color: "+getColor());
	System.out.println("Punto de inicio: "+getPtoIni());
	System.out.println("Punto final: "+getPtoFin());
	System.out.println("Radio: "+radio);
	
}
public void cambiarColor(String color){
	setColor(color);
}
	
	public void borrar(){
		System.out.println("Se ha borrado una curva");
	}
	

}
