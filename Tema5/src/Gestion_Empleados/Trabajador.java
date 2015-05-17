package Gestion_Empleados;

public class Trabajador {
	private String Nombre;
	private int DNI;
	private int Antiguedad;
	private int Salario;
	private String Departamento;

	
	public Trabajador(String nom, int ndni, int antig, int sal, String dept){
		Nombre=nom;
		DNI=ndni;
		Antiguedad=antig;
		Salario=sal;
		Departamento=dept;
	}

	public String getNombre(){		
		return Nombre;
	}
	
	public int getDNI(){		
		return DNI;
	}
	
	public int getAntiguedad(){		
		return Antiguedad;
	}
	
	public int getSalario(){		
		return Salario;
	}
	
	public String getDepartamento(){	
		return Departamento;
	}
	
	public String toString(){
		String cadena= Nombre+" "+DNI+" "+Antiguedad+" "+Salario+" "+Departamento;
		return cadena;
	}

}
