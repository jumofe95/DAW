package Tienda_Electronica;

public class Camaras extends Dispositivos {

	
	//atrib
	private int resolucionHorizontal;
	private int resolucionVertical;
	private boolean flash;
	

	
	


	//construct
	public Camaras(float peso_, float dimensionAncho_, float dimensionAlto_,
			float dimensionGrueso_, float precio_, int resolucionHorizontal_, int resolucionVertical_, boolean flash) {
		super(peso_, dimensionAncho_, dimensionAlto_, dimensionGrueso_, precio_);
		
		resolucionHorizontal = resolucionHorizontal_;
		resolucionVertical = resolucionVertical_;
		// TODO Auto-generated constructor stub
		
	}
	
	
	//method
	
	/*public String imprimir(){
		super.imprimir();
		String str = "Resolucion: " +resolucionHorizontal+ " " +resolucionVertical;
		str = str +"Flash: " +flash;
		return str;
	}*/
	
	public void imprimir(){
		super.imprimir();
		System.out.println("Resolucion: " +resolucionHorizontal+ " " +resolucionVertical);
		System.out.println("Flash: " +flash);
		
	}



	
}
