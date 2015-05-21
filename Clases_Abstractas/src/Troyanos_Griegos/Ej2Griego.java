package Troyanos_Griegos;

public class Ej2Griego extends Ej2Guerrero{
	
	//att
	
	//constr
		public Ej2Griego(String nombre, int edad, int fuerza) {
			super(nombre, edad, fuerza);
			// TODO Auto-generated constructor stub
		}
		
		
		public Ej2Griego(Ej2Guerrero griego, String nombre) {
			super(griego, nombre);
			// TODO Auto-generated constructor stub
		}
	
		
		//meth
	public boolean retirarse(){
			if(getHerido() && !isMuerto()){ 
				return true;
			}else{
				return false;
			}
	}
		
	}
