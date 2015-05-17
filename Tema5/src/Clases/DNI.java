package Clases;

public class DNI {

	
	public long numero;
	public String letra;
	private String letras[] = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};

	public DNI(){
		numero=0;
		letra=" ";
	}
	
	public DNI(long n){
		numero=n;
	}
		
	public void leer(long n){
		long resultado = n / 23;
		long resultado2 = resultado * 23;
		long resultado3 = n - resultado2;

		System.out.println(n+"-"+letras[(int) resultado3]);	
	}

}
