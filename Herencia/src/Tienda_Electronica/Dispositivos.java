package Tienda_Electronica;

public class Dispositivos {

	//atrib
	private float peso;
	private float dimensionAncho;
	private float dimensionAlto;
	private float dimensionGrueso;
	private float precio;
	

	
	//construct
	public Dispositivos(float peso_, float dimensionAncho_, float dimensionAlto_, float dimensionGrueso_, float precio_) {
		peso = peso_;
		dimensionAncho = dimensionAncho_;
		dimensionAlto = dimensionAlto_;
		dimensionGrueso = dimensionGrueso_;
		precio = precio_;
	}
	
	
	//method
	
	public void imprimir(){
		System.out.println("Peso: " +peso);
		System.out.println("Dimensiones: " +dimensionAncho+ " " +dimensionAlto+ " " +dimensionGrueso);
		System.out.println("Precio: " +precio);
		
	}
}
