package Instrumentos;

public class BajoElectrico extends InstrumentoDeCuerda {

	//atrib
	
	
	//const
	public BajoElectrico(String nombre, int numeroDeCuerdas) {
		super(nombre, numeroDeCuerdas);
		// TODO Auto-generated constructor stub
	}

	
	//meth
	public void tocar(){
		System.out.println("Una " +getNombre()+ " eléctrica de "+getnumeroDeCuerdas()+"-cuerdas está sonando!");
	}
	
}
