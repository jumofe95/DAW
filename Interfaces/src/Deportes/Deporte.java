package Deportes;

public abstract class Deporte implements Calorias{

	private int tiempo;
	private int temp;
	
	public Deporte(int tiempo, int temp){
		this.tiempo = tiempo;
		this.temp = temp;
	}
	
	public void setTiempo(int tiempo){
		this.tiempo = tiempo;
	}
	
	public int getTiempo(){
		return tiempo;
	}
	
	public void setTemp(int temp){
		this.temp = temp;
	}
	
	public int getTemp(){
		return temp;
	}
	
	public float consumoCalorias(){
		 float consumo = this.tiempo + this.temp;
		 
		 return consumo;
	}
	
	
}
