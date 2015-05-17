package Clases;

import java.util.Scanner;

public class PruebaCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta c = new Cuenta(26753297, 100);

		c.ingresar(100);
		
		c.retirar(300);
		
		
		
		c.print();
	}

}
