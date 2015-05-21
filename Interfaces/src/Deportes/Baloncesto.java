
package Deportes;

public class Baloncesto extends Deporte implements Calorias{
	
	public Baloncesto(int tiempo, int temp){
		super(tiempo,temp);
	}
	
	public float consumoCalorias(){
		float consumo = super.consumoCalorias();
		
		return consumo;
	}

}
