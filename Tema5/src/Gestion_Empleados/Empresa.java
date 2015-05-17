package Gestion_Empleados;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Empresa {
Scanner teclado = new Scanner(System.in);

	private String nombre;
	private int antiguedadEmpresa;
	private int maxTrabajadores;
	private int numTrabajadores;
	private Trabajador[] trabajadores;
	
	
	//constructor	
	public Empresa(String nombre_, int antiguedad_){

		nombre = nombre_;
		antiguedadEmpresa=antiguedad_;
		
		int i=0;
		
		Scanner in =null;
		try {
			in = new Scanner(new FileReader("TrabajadoresEmpresa.txt"));
			maxTrabajadores=in.nextInt();
			trabajadores=new Trabajador[maxTrabajadores];
			
			while(in.hasNext()){
			String Nombre = in.next();
			int DNI= in.nextInt();
			int Antiguedad= in.nextInt();
			int Salario= in.nextInt();
			String Departamento= in.next();
			
			Trabajador t = new Trabajador (Nombre, DNI, Antiguedad, Salario, Departamento);
			trabajadores[i] = t;
			i++;
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}	
	}//fin constructor
		
	
	
	public int getNumMáximoTrabajadores(){
		return maxTrabajadores;
	}
	
	public int getNumTrabajadores(){
		return numTrabajadores;
	}
	
	public String getNombreEmpresa(){
		return nombre;
	}
	
	
	public boolean existeEmpleado(int numDni){
		boolean repetido=false;
		int i;
		for(i=0;i<trabajadores.length;i++){
			if (numDni == trabajadores[i].getDNI()){
				repetido=true;		
				break;
			}
		}
		if (repetido==true){
			System.out.println("El empleado ya existe");
		}
		return repetido;		
	}
	
	public void anyadirEmpleado(Trabajador e){
		boolean existe = existeEmpleado(e.getDNI());
		if (existe==true){
			
		}
	}
	
	
	
	
	
	
	
	
	
	
}
