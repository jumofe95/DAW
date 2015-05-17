package Clases;

public class PruebaCirculo {

	public static void main(String[] args) {

		Circulo c = new Circulo();
		
		c.radio = 7;
		
		
		System.out.println("Longitud del circulo: "+c.radio);
		System.out.println("Area: "+c.area());
		System.out.println("Longitud: "+c.longitud());
		
		
		
	}

}
