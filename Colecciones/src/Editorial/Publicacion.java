package Editorial;
import java.util.*;
public class Publicacion {

	private String titulo;
	private int anyo;
	private ArrayList<Autor> autores;
	private String isbn;
	
	

	
	public Publicacion(String vtitulo, int vanyo, String visbn, ArrayList<Autor>v_Autor){
		titulo = vtitulo;
		anyo = vanyo;
		isbn = visbn;
		autores = v_Autor;
	}
	
	
	public Publicacion(String vtitulo, int vanyo, String visbn){
		titulo = vtitulo;
		anyo = vanyo;
		isbn = visbn;
		autores = new  ArrayList<Autor>();
	}	
	
	
	
	
	
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String vtitulo) {
		titulo = vtitulo;
	}


	public int getAnyo() {
		return anyo;
	}


	public void setAnyo(int vanyo) {
		anyo = vanyo;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String visbn) {
		isbn = visbn;
	}


	public ArrayList<Autor> getAutores() {
		return autores;
	}


	public void setAutores(ArrayList<Autor> vautores) {
		autores = vautores;
	}


	public void addAutor(Autor vautor){
		autores.add(vautor);
	}
	
	public String toString(){
		String Cad_Publicacion = "Titulo: " + titulo + "\n" + "Anyo: " + anyo
				+ "\n" + "ISBN: " + isbn;
		
		for(Autor autor : autores){
			Cad_Publicacion = Cad_Publicacion +" "+autor.toString();
		}
		
		return Cad_Publicacion;
	}
	
}
