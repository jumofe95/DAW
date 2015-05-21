package Deportes;

public class Windsurf extends Deporte implements Calorias{

	private boolean arnes;
	private float velocidad;
	private int tamanyo;
	
	public Windsurf(int tiempo, int temp, boolean arnes, float velocidad, int tamanyo){
		super(tiempo,temp);
		this.setArnes(arnes);
		this.velocidad = velocidad;
		this.tamanyo = tamanyo;
	}
	
	
	public boolean isArnes() {
		return arnes;
	}


	public void setArnes(boolean arnes) {
		this.arnes = arnes;
	}

	public void setVelocidad(float velocidad){
		this.velocidad = velocidad;
	}
	
	public float getVelocidad(){
		return velocidad;
	}
	
	public void setTamanyo(int tamanyo){
		this.tamanyo = tamanyo;
	}
	
	public float consumoCalorias(){
		float consumo = super.consumoCalorias() + this.velocidad + this.tamanyo;
		
		return consumo;
	}
	
}
