package Vectores_y_Matrices;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		
		int alumnos, asignaturas;
		int i, j;
		float sumaAlumno = 0, sumaAsignatura=0;
		float mediaAlumno = 0, mediaAsignatura=0;
		
		System.out.println("Numero de alumnos: ");
		alumnos = teclado.nextInt();
		System.out.println("Numero de asignaturas: ");
		asignaturas = teclado.nextInt();
		
		float matriz[][] = new float[alumnos][asignaturas];
		
		for (i=0; i<alumnos; i++){
			System.out.println("ALUMNO "+(i+1));
			for (j=0; j<asignaturas; j++){
				System.out.print("Nota "+(j+1)+ ": ");
				matriz[i][j] = teclado.nextInt();
			sumaAlumno = sumaAlumno + matriz[i][j];
			}
			mediaAlumno = sumaAlumno / asignaturas;
			sumaAlumno=0;
		}

					

		
		for (i=0; i<alumnos; i++){
			System.out.println("Media de las notas de ALUMNO " +(i+1)+ ": ");
		}
		System.out.println("-----------------------------------");
		
		
		for (i=0; i<alumnos; i++){
			System.out.println("Media de las notas de ASIGNATURA " +(i+1)+ ": ");
		}
	
	
	}
}
