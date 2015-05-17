
	/*
	 * To change this template, choose Tools | Templates
	 * and open the template in the editor.
	 */
	//Un paquete Java es un contendor de clases.
	//Si nuestro paquete tiene como nombre DefaultPackage no hace falta 
	//que importemos nada. 
	//Si nuestro paquete tiene un nombre donde est�n los ficheros .java. 
	//hay que incluir el paquete escribiendo la siguiente instrucci�n como 
	//primera l�nea de c�digo:
	//package nombre_del_paquete;
	package ejercicios; //OPCIONAL

	//Despu�s de los paquetes se pueden escribir instrucciones que importen
	//las librer�as que necesitaremos en nuestro programa. 
	//Nosotros vamos a importar la librer�a java.util. 
	//Importamos esta librer�a porque vamos a utilizar la clase Scanner
	//para leer los datos que el usuario introduce por pantalla. La clase 
	//Scanner tiene unos m�todos ya implementados que nos facilitar�n la lectura
	//de los datos.
	//Para importar una librer�a hay que escribir la siguiente instrucci�n:
	//import nombre_de_la_librer�a;
	import java.util.*; //OPCIONAL
	
	/**
	 *
	 * @author edelval
	 * @description Esta clase es un resumen de lo que hemos trabajado en el 
	 * Tema 1.
	 * IMPORTANTE: El NOMBRE de la CLASE tiene que ser IGUAL que el NOMBRE del FICHERO .java!!!
	 * IMPORTANTE: Java distingue entre MAY�SCULAS Y MIN�SCULAS!!!
	 */
	//CREA FICHERO DE DOCUMENTACION
	
	public class ResumenTema1 {
	    //Este es el m�todo principal, es p�blico y no devuelve nada
	    //IMPORTANTE: Dentro de una clase S�LO PUEDE HABER UN M�TODO MAIN!!!
		
	    public static void main(String args[]){
	        //Las instrucciones Java que escribamos tienen que estar DENTRO
	        //de un BLOQUE, es decir, DENTRO DE { }
	        
	        //PASOS A SEGUIR...
	        //-------------
	        //1er PASO
	        //-------------
	        //DECLARAR LAS VARIABLES
	        //pensar qu� tipo de informaci�n queremos guardar
	        //en base al tipo de informaci�n decidiremos el tipo
	        //de las variables:
	            //si es un CAR�CTER: 'A' ---->tipo char
	            //si es una CADENA: "Lunes" ---->tipo String
	            String nombre;
	            //si almacenamos true � false: ----> tipo boolean
	            boolean matriculado;
	            //si almacenamos un valor num�rico:
	                  //�es un n�mero entero?
	                  //�qu� rango de valores deber�a poder contener?
	                  //tipos posibles: byte, short, int � long
	                  int edad;
	                  int anyoFin;
	                  int meses;
	                  //�es un n�mero con decimales?
	                  //�qu� rango de valores deber�a poder contener?
	                  //tipos posibles: float, double
	                  float nota;
	        
	        //-------------
	        //2�PASO
	        //-------------
	        //INICIALIZAR LAS VARIABLES
	        //Existen tres opciones
	            //OPCION 1: Vamos a pedirle al usuario que introduzca los valores
	            //que utilizaremos para inicializar la variables
	            
	                //para leer los datos que el usuario introduce por medio
	                //del teclado tenemos que declarar una variable del 
	                //tipo Scanner. Este tipo NO ES UN TIPO B�SICO. Lo veremos
	                //m�s adelante.
	                    //PASO 1: 
	                    //------
	                    //Para declarar una variable de tipo Scanner hay que hacer 
	                    //lo siguiente:
	                    Scanner teclado = new Scanner(System.in);
	                    //PASO 2:
	                    //------
	                    //PEDIR los VALORES imprimiendo un mensaje por pantalla
	                    System.out.println("Introduzca los siguientes valores: ");
	                    //LEER los VALORES que el usuario ha introducido y 
	                    //GUARDARLOS en las VARIABLES correspondientes que anteriormente
	                    //hemos declarado.
	                    //Dependiendo del tipo de informaci�n que va a introducir el
	                    //usuario utilizaremos un m�todo u otro para leer el valor:
	                        //Si el usuario va a introducir una cadena:
	                        System.out.println("Nombre: ");
	                        nombre = teclado.nextLine();
	                        //Si el usuario va a introducir un n�mero:
	                        System.out.println("Edad: ");
	                        edad = teclado.nextInt();
	                        //OJO! si la nota es con decimales utilizar , en lugar de .
	                        System.out.println("Nota: ");
	                        nota = teclado.nextFloat();
	                        //Si el usuario va a introducir un booleano:
	                        System.out.println("Est� matriculado: ");
	                        matriculado = teclado.nextBoolean();
	                        
	            //OPCION 2: Nosotros le asignamos un valor a la variable
	            //podemos declarar una variable e inicializarla en cualquier punto 
	            //del programa
	            String asignatura = "Programaci�n";
	            int anyoInicio = 2014;
	            int duracion = 2;
	          
	        
	            //OPCION 3: Durante el programa se inicializa como resultado de 
	            //alguna operaci�n
	            anyoFin = anyoInicio + duracion;
	        

	        //-------------
	        //3�PASO
	        //-------------
	            
	        //OTRAS INSTRUCCIONES que hagan operaciones y modifiquen valores de
	        //las variables... 
	        meses = duracion *24;    
	            
	        //-------------
	        //4�PASO (OPCIONAL)
	        //-------------
	            
	        //Mostrar el resultado por pantalla:
	        //para mostrar el resultado por pantalla tenemos dos opciones:
	        //SYSTEM.OUT.PRINTLN que muestra el mensaje CON un SALTO DE LINEA
	        System.out.println("Ficha de matr�cula con PRINTLN: ");
	        System.out.println("--------------------");
	        System.out.println("Alumno: "+ nombre);
	        System.out.println("Edad: "+ edad);
	        System.out.println("Esta matriculado: "+ matriculado+ " de la asignatura: "+asignatura);
	        System.out.println("A�o de incio: "+ anyoInicio);
	        System.out.println("A�o de fin: "+ anyoFin);
	        System.out.println("Duraci�n en meses: "+ meses);
	        
	        
	        //SYSTEM.OUT.PRINTF que muestra el mensaje SIN SALTO DE LINEA
	        //si queremos a�adir un salto de l�nea tendremos que utilizar \n
	        //La estructura del printf es:
	            //CADENA: 
	            //Escribiremos la cadena que queremos que se muestre por pantalla
	            //y si queremos imprimir el valor de alguna variable, entonces utilizaremos:
	                //%s ---> para variables de tipo cadenas
	                //%d ---> para variables de tipo entero 
	                //%f ---> para variables de tipo float o double
	            //VARIABLES: (Las variables est�n separadas de la cadena por una ,)
	            //Escribiremos las variables que queremos que se muestre su valor.
	            //La primera variable se imprimir� en el lugar donde aparezca el primer %
	            //la segunda variable se imprimir� en el lugar donde apareza el segudo %
	            //y as� sucesivamente.
	        
	        System.out.printf("Ficha de matr�cula con PRINT: \n");
	        System.out.printf("--------------------\n");
	        System.out.printf("Alumno: %s\n", nombre);
	        System.out.printf("Edad: %d\n", edad);
	        System.out.printf("Esta matriculado: %b de la asignatura %s\n", matriculado, asignatura);
	        System.out.printf("Asignatura: %s \n", asignatura);
	        System.out.printf("A�o de incio: %d \n", anyoInicio);
	        System.out.printf("A�o de fin: %d \n", anyoFin);
	        System.out.printf("Duraci�n en meses: %d", meses);

	        
	   }
}
	
