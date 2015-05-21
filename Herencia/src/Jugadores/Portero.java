package Jugadores;

public class Portero extends Jugador {
	
	//atrib
	private int golesRecibidos;
	private int penaltisParados;
	
	
	//construct
	public Portero(String n, String d, int p, int g, int a, int r, int golesRecibidos_, int penaltisParados_) {
		super(n, d, p, g, a, r);
		
		golesRecibidos = golesRecibidos_;
		penaltisParados = penaltisParados_;
		// TODO Auto-generated constructor stub
	}
	
	

	//method
	public void imprimir (){
		super.imprimir();
		System.out.println("Goles Recibidos: " +golesRecibidos);
		System.out.println("Goles Parados: " +penaltisParados);
	}


	

}
