package Envio_Mensajes;

public class MensajeMMS extends Mensaje {

	private String imagen;
	
	public MensajeMMS(int remitente, int numerodestinatario, String destinatario,String imagen) {
		super(remitente, numerodestinatario, destinatario);
		
		this.imagen=imagen;
		
	}

	public void enviarMensaje(String mensaje){
		setMensaje(mensaje);
		
	}
	
	
	public void visualizarMensaje(){
		super.visualizarMensaje();
		System.out.println("Imagen: "+imagen);
		
	}
	
	

}
