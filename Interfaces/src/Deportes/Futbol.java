package Deportes;

public class Futbol extends Deporte implements Calorias{

	private int numJugadores;
	
	public Futbol(int tiempo, int temp, int numJugadores){
		super(tiempo,temp);
		if(checkJugadores(numJugadores)){
			this.setNumJugadores(numJugadores);
		}else{
			this.setNumJugadores(5);
		}
		
	}
	
	
	public int getNumJugadores() {
		return numJugadores;
	}


	public void setNumJugadores(int numJugadores) {
		this.numJugadores = numJugadores;
	}


	public boolean checkJugadores(int num){
		boolean foo;
		
		if(num!=5&&num!=7&&num!=11){
			foo = false;
		}else{
			foo = true;
		}
		
		return foo;
		
	}
	
	public float consumoCalorias(){
		float consumo = super.consumoCalorias();
		
		return consumo;
}
}