package Envio_Mensajes;

public class Mensaje {

	private int numeroremitente;
	private int numerodestinatario;
	private String destinatario;
	private String mensaje;
	
	public Mensaje(int remitente,int numerodestinatario, String destinatario){
		
		this.numeroremitente=remitente;
		this.numerodestinatario=numerodestinatario;
		this.destinatario=destinatario;
		
		
	}
	
	public void enviarMensaje(){
		
		
	}
	
	
	public void visualizarMensaje(){
		System.out.println("Remitente: "+numeroremitente);
		System.out.println("Destinatario: "+destinatario);
		System.out.println("Número del destinatario: "+numerodestinatario);
		System.out.println("Mensaje: "+mensaje);
		
	}
	
	
	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

}
