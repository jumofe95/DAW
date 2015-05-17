package Clases;

import java.util.Scanner;

public class PruebaTicketMachine {

	public static void main(String[] args) {

		TicketMachine miMaquina= new TicketMachine(10);
	
		System.out.println("Precio de ticket: "+miMaquina.getPrice());
		
		System.out.println("Balance: "+miMaquina.getBalance());
		
		int moneda;
		
		do{
		System.out.println("Introduce moneda: ");
		Scanner teclado = new Scanner(System.in);
		moneda = teclado.nextInt();
		miMaquina.insertMoney(moneda);

		System.out.println("Balance: "+miMaquina.getBalance());
		}while (moneda != 0);
		
		
		miMaquina.printTicket();

	}

}
