package Control_de_excepciones;
import java.util.Scanner;

public class EjemploPPT2 {
	public static void main(String args[]) {

	try{
		int a =2;
		int b;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("numero:");
		b = teclado.nextInt();
		System.out.println("El resultado de la divisi�n es:");
		System.out.println(a/b);
		}catch(ArithmeticException e){
		System.out.println("La excepci�n es :" + e);
		}finally{
		System.out.println("Esta parte del c�digo siempre se ejecuta");
		}

}
}