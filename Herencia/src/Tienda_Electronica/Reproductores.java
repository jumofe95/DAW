package Tienda_Electronica;

public class Reproductores extends Dispositivos {

		//atrib
		private int espacioAlmacenamiento;
		private boolean radio;
		

		
		//construct
		public Reproductores(float peso_, float dimensionAncho_,
				float dimensionAlto_, float dimensionGrueso_, float precio_, int espacioAlmacenamiento_, boolean radio_) {
			super(peso_, dimensionAncho_, dimensionAlto_, dimensionGrueso_, precio_);
			// TODO Auto-generated constructor stub
			
			espacioAlmacenamiento = espacioAlmacenamiento_;
			radio = radio_;
		}

		
		
		//method
		
		public void imprimir(){
			super.imprimir();
			System.out.println("Espacio Almacenamiento: " +espacioAlmacenamiento);
			System.out.println("Radio: " +radio);
			
		}
	
}
