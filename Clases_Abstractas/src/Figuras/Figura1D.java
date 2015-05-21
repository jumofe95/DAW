package Figuras;

public abstract class Figura1D extends Figura {


	private String ptoIni;
	private String ptoFin;

	public Figura1D(String color,String ptoIni,String ptoFin){
		super(color);
		this.ptoIni=ptoIni;
		this.ptoFin=ptoFin;
		
	}

	public String getPtoIni() {
		return ptoIni;
	}

	public void setPtoIni(String ptoIni) {
		this.ptoIni = ptoIni;
	}

	public String getPtoFin() {
		return ptoFin;
	}

	public void setPtoFin(String ptoFin) {
		this.ptoFin = ptoFin;
	}
	
	
}
