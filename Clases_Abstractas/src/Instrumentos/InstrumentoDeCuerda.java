package Instrumentos;

public abstract class InstrumentoDeCuerda extends Instrumento {

	//atrb
	private int numeroDeCuerdas;
	
	//constr
	public InstrumentoDeCuerda(String nombre, int numeroDeCuerdas) {
		super(nombre);
		this.numeroDeCuerdas = numeroDeCuerdas;
		// TODO Auto-generated constructor stub
	}
	
	
	//meth
	public int getnumeroDeCuerdas(){
		return numeroDeCuerdas;
	}
	
}
