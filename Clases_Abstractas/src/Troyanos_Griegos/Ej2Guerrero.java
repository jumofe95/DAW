package Troyanos_Griegos;

public abstract class Ej2Guerrero {

	//atrib
	private String nombre;
	int edad, fuerza;
	boolean muerto, herido;
	
	
	//cons
	public Ej2Guerrero(String nombre, int edad, int fuerza, boolean muerto, boolean herido) {
		this.nombre = nombre;
		this.edad = edad;
		this.fuerza = fuerza;
		this.muerto = muerto;
		this.herido = herido;
	}
	
	public Ej2Guerrero(String nombre_, int edad_, int fuerza_) {  
				/* El primer constructor recibirá valores para todos los atributos, excepto herido y muerto, que obviamente
		serán falsos. Deberá comprobar que los valores dados son válidos y en caso contrario poner
		como edad 25 y como fuerza 5. */
		this.nombre = nombre_;
		
		if(comprobarEdad(edad_) == true){
			this.edad = edad_;
		}else{
			this.edad = 25;
		}
		
		
		if(comprobarFuerza(fuerza_) == true){
			this.fuerza = fuerza_;
		}else{
			this.fuerza = 5;
		}
		
		this.muerto = false;
		this.herido = false;
	}
	
	public Ej2Guerrero() {
				/* El segundo, que deberá utilizar el primero, no recibirá ningún valor y creará un
		guerrero cuyo nombre sea guerreroX y edad y fuerza valgan 15 y 1
		respectivamente. */
		this.nombre = "GuerreroX";
		this.edad = 15;
		this.fuerza = 1;
		this.muerto = false;
		this.herido = false;
	}
	

			
			public Ej2Guerrero(Ej2Guerrero objt, String nombreX) {
				/* El tercero, recibirá un objeto de tipo Guerrero y un nombre y creará una copia del guerrero
				pasado con el nuevo nombre. */
				edad = objt.edad;
				fuerza = objt.fuerza;
				nombre = nombreX;
				}



	
	//meth
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public int getFuerza() {
		return fuerza;
	}
	
	public boolean getHerido() {
		return herido;
	}
	

	public void setHerido(boolean herido) {
		this.herido = herido;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}


	public boolean isMuerto() {
		return muerto;
	}


	public void setMuerto(boolean muerto) {
		this.muerto = muerto;
	}
	
	
	static boolean comprobarEdad (int e){
		boolean EdadRecomendada = false;
		
		if (e>=15 & e<=60){
			EdadRecomendada = true;
		}
		
		
		return EdadRecomendada;
	}
	
	
	static boolean comprobarFuerza (int f){
	boolean FuerzaRecomendada = false;
		
		if (f>=1 & f<=10){
			FuerzaRecomendada = true;
		}
		
		return FuerzaRecomendada;
		
	}
	
	abstract public boolean retirarse (); //se implementaran en las otras clases Troyano y Girego
	
	
}
