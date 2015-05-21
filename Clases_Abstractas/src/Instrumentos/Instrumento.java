package Instrumentos;

public abstract class Instrumento {

	//atr
	private String nombre;


	//cons
	public Instrumento(String nombre) {
		this.nombre = nombre;
	}
	
	
	//meth
	abstract public void tocar();
	
	
	public String getNombre(){
		return nombre;
	}
	
}
