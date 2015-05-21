package Figuras;

public class test {

	public static void main(String args[]){
		
		
		Recta r1 = new Recta("verde", "(3,6)", "(7,2)");
		r1.dibujar();
		
		System.out.println("");
		
		
		Cuadrado c1 = new Cuadrado("rojo", "rojo", 1, 5, 10, 25);
		c1.dibujar();
	}
}
