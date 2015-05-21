package Tienda_Electronica;


public class GestorTienda {
	public static void main(String[] args) {
	
		Camaras Camara = new Camaras(184, 6f, 4f, 2f, 200f, 1920, 1280, true);
		
		System.out.println("Informacion camara: ");
		Camara.imprimir();
		
		System.out.println("\n");
		
		Moviles Movil = new Moviles(120f, 6f, 4f,
				1f, 430, "movistar", false);
		
		System.out.println("Informacion movil: ");
		Movil.imprimir();
	
	
	}
}