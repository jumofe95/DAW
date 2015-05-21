package Troyanos_Griegos;

public abstract class Ej2Troyano extends Ej2Guerrero {

	
	
	//atr
	
	
	//constr
	public Ej2Troyano(String nombre, int edad, int fuerza) {
		super(nombre, edad, fuerza);
		// TODO Auto-generated constructor stub
	}
	
	public Ej2Troyano(Ej2Guerrero troyano, String nombre) {
		super(troyano, nombre);
		// TODO Auto-generated constructor stub
	}

	
	//meth
	public boolean retirarse(){
		
		return false;
	}
	
}
