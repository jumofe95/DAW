package Editorial;

public class Autor {

	private String nombre;
	private int inicio_contrato;
	private String dni;
	
	
	public Autor(String vnombre, int vinicio_contrato, String vdni){
		nombre = vnombre;
		inicio_contrato = vinicio_contrato;
		dni = vdni;
	}
	
	
	
public String getNombre(){
	return nombre;
}
public int getInicio_contrato(){
	return inicio_contrato;
}

	public String getDni(){
	return dni;
}

public String setNombre(String vnombre){
	nombre = vnombre;
	return  nombre;
}

public int setInicio_contrato(int vInicio_contrato){
	inicio_contrato = vInicio_contrato;
	return  inicio_contrato;
}

public String setDni(String vdni){
	dni = vdni;
	return  dni;
}


	
	
	
public String toString(){
	String Cad_Autor = "Nombre: "+nombre+"\n" +"Inicio de contrato: "+inicio_contrato+"\n"+"DNI: "+dni; 
	return Cad_Autor;
}
	
	
	
	
	
	
}







