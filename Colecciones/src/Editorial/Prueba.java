package Editorial;

import java.util.*;

public class Prueba {

	public static void main(String[] args) {

		Autor a1 = new Autor("Julian", 1901, "123456789");
		Autor a2 = new Autor("Julian2", 1922, "343452453");

		Autor a3 = new Autor("Julian3", 1933, "3452345675");
		Autor a4 = new Autor("Julian4", 1944, "34567563456");

		Publicacion p1 = new Publicacion("Publicacion1", 1990, "isbn1");
		p1.addAutor(a1);
		p1.addAutor(a2);

		ArrayList<Autor> listaAutores = new ArrayList<Autor>();
		listaAutores.add(a3);
		listaAutores.add(a4);
		Publicacion p2 = new Publicacion("Publicacion2", 1990, "isbn2",listaAutores);
		
		Editorial editorial = new Editorial();
		editorial.addPublicaciones(p1);
		editorial.addPublicaciones(p2);
		
		System.out.println("Antes de borrar");
		System.out.println(editorial.toString());
		
		System.out.println("Despues de borrar");
		editorial.removePublicaciones(p1.getIsbn());
		System.out.println(editorial.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
