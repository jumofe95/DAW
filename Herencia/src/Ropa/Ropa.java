package Ropa;

		public class Ropa {
		private String color;
		private String fabricante;
		private float precio;
		private String tejido;
		protected static int identificador;
		
		
		public Ropa (String c, String f, float p, String t){
		color = c;
		fabricante = f;
		precio = p;
		tejido = t;
		identificador ++;
		}
		
		public Ropa (){
		this("sin color", "sin fabricante", 0, "sin tejido");
		}
		
		
		
		
		public void imprimir () {
		System.out.println("Color: "+color);
		System.out.println("Fabricante: "+fabricante);
		System.out.println("Precio: "+precio);
		System.out.println("Tejido: "+tejido);
		System.out.println("Identificador: "+identificador);
		}
	}