package Instrumentos;

public class GuitarraElectrica extends InstrumentoDeCuerda{
	//atrib
	
	//constr
	public GuitarraElectrica(String nombre, int numeroDeCuerdas) {
		super(nombre, numeroDeCuerdas);
		// TODO Auto-generated constructor stub
	}

	//meth
	public void tocar(){
			System.out.println("Una " +getNombre()+ " el�ctrica de "+getnumeroDeCuerdas()+"-cuerdas est� sonando!");
	}
}
