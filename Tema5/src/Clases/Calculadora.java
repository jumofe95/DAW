package Clases;

public class Calculadora {

	public double a;
	public double b;
	public double resultado; 

	//cosnstructor

	public Calculadora(int numa, int numb){
		a = numa;
		b = numb;
	}

	//metodos
	public void getSuma(){
		resultado = a+b;
	}

	public void getResta(){
		resultado = a-b;
	}

	public void getMultiplicacion(){
		resultado = a*b;
	}

	public void getDivision(){
		resultado = a/b;
	}

	
	public void printResultado(){
		System.out.println("Resultado: "+resultado);
	}
}
