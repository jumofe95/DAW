package Clases;

public class Cuenta {
	public double numeroCuenta;
	public long dni;
	public double saldo;
	public double interes;


	public Cuenta(){
		numeroCuenta=0;
		dni=0;
		saldo=0;
		interes=0;
	}
	
	public Cuenta(long ndni, double nsaldo){
		dni=ndni;
		saldo=nsaldo;
	}


	public double ingresar(double ingreso){
		saldo = ingreso + saldo;
	return ingreso;
	}
	
	
	public double retirar(double retiro){
		if (saldo>retiro){
		saldo = saldo - retiro;
		}else{
			System.out.println("No tienes suficiente saldo");
		}
	return retiro;
	}

	
	public void print(){
		System.out.println("Saldo actual: "+saldo); 
		System.out.println("DNI: "+dni);

	}

}
