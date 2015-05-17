package Clases;
public class TicketMachine {

	private int price;
	private int balance;
	private int total;
	
	
	/*Crea una maquina que da tickets de un determinado precio*/
	public TicketMachine(int ticketCost){
		price = ticketCost;
	}
	
	
	/*Devuelve el precio de un ticket*/
	public int getPrice(){
		return price;
	}
	
	
	/*Devuelve la cantidad de dinero que se ha instertado para obtener un
	ticket*/
	public int getBalance(){
		return balance;
	}
	
	
	/*Recibe una cantidad de dinero en centimos de un cliente y comprueba
	que es una cantidad positiva*/
	public void insertMoney(int amount){
		if (amount>0){
			balance = balance + amount;
		}
	}

	
	/*Imprime el ticket si se ha insertado la cantidad de dinero suficiente,
	reduce la cantidad de dinero del usuario e incrementa el total de dinero
	acumulado por la venta de tickets. En el caso de que no se haya insertado
	la cantidad suficiente, imprime un mensaje por pantalla donde le indica
	la cantidad de dinero que le falta.*/
	public void printTicket(){
		if (balance == price){
			System.out.println("IMPRIMIENDO TICKET");
		}else if (balance > price){
			System.out.println("IMPRIMIENDO TICKET");
			int resto=balance-price;
			System.out.println("Se devuelve: "+resto);
		}else if (balance < price){
			int falta = price - balance;
			System.out.println("Faltan: "+falta);
		}
	}
	
	
	/*Devuelve el dinero correspondiente al usuario*/
	public int refundBalance(){
		return balance;
	}		
}
