package Editorial;

import java.util.*;

public class Editorial {

	HashMap <String, Publicacion> publicaciones_realizadas; 
	
	//================CONSTRUCTOR======================
	public Editorial() {
		publicaciones_realizadas = new HashMap<String, Publicacion>();
	}

	public Editorial(HashMap<String, Publicacion> vpublicaciones_realizadas) {
		publicaciones_realizadas = vpublicaciones_realizadas;
	}
	//================CONSTRUCTOR======================
	
	
	
	
	
	
	//================REALIZAR BUSQUEDA======================
	public void getPublicaciones(String isbn) {
		System.out.println(publicaciones_realizadas.get(isbn));
	}
	//================REALIZAR BUSQUEDA======================
	
	
	
	
	
	//================DAR DE ALTA======================
	public void addPublicaciones(Publicacion nuevaPublicacion) {
		publicaciones_realizadas.put(nuevaPublicacion.getIsbn(),
				nuevaPublicacion);
		System.out.println("Publicación añadida");
	}
	//================DAR DE ALTA======================
	
	
	
	
	
	
	
	//================DAR DE BAJA======================
	public void removePublicaciones(String visbn) {
		publicaciones_realizadas.remove(visbn);
		System.out.println("Publicación eliminada");
	}
	//================DAR DE BAJA======================

	
	
	
	
	
	//================INFORMACION======================
	public String toString() {
		String Cad_Editorial = "";
		Set<String> claves = publicaciones_realizadas.keySet();
		for (Iterator<String> it = publicaciones_realizadas.keySet().iterator(); it
				.hasNext();) {
			String clave_isbn = it.next();
			Publicacion p = publicaciones_realizadas.get(clave_isbn);
			Cad_Editorial = Cad_Editorial + p.toString() + "\n";
		}
		return Cad_Editorial;
	}
	//================INFORMACION======================

	
	
	
}
