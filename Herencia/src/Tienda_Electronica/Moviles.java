package Tienda_Electronica;

public class Moviles extends Dispositivos {


		//atrib
		private String operadora;
		private boolean camara;
		

		
		//construct
		public Moviles(float peso_, float dimensionAncho_, float dimensionAlto_,
				float dimensionGrueso_, float precio_, String operadora_, boolean camara_) {
		super(peso_, dimensionAncho_, dimensionAlto_, dimensionGrueso_, precio_);
		
		operadora = operadora_;
		camara = camara_;
		
			// TODO Auto-generated constructor stub
		}
		
		
		//method
		
		public void imprimir(){
			super.imprimir();
			System.out.println("Operadora: " +operadora);
			System.out.println("Camara: " +camara);
			
		}
		
	
	
	
	
}
