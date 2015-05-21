package Ropa;

public class Camiseta extends Ropa {
	
	//atrib
	private String mangas;
	private boolean dibujo;
	
	
	//construct
	public Camiseta(String c, String f, float p, String t, String mangas_, boolean dibujo_) {
		super(c, f, p, t);
		// TODO Auto-generated constructor stub
		mangas = mangas_;
		dibujo = dibujo_;
	}
	

	public Camiseta() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	//method
	public void imprimir () {
		super.imprimir();
		System.out.println("Manga tipo: "+mangas);
		System.out.println("Dibujo: "+dibujo);
		}
}
