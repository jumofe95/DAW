package Envio_Mensajes;

public class gestor {

	public static void main(String args[]){
		
		MensajeSMS m1 = new MensajeSMS(987654323, 876954264, "DAVID");
		
		m1.enviarMensaje("Hola");
		m1.visualizarMensaje();
	}
}
