package Vectores_multidimensionales;

import java.util.Scanner;

public class PPT33 {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);

		int salas[][] = new int[5][20];
		int opcion;
		int sala;
		int equipo;

		do {
			System.out.println("___________________________________________________");
			System.out.println("(1)Reservar equipo.");
			System.out.println("(2)Cancelar reserva.");
			System.out.println("(3)Equipos ocupados.");
			System.out.println("(4)Salir.");
			System.out.println("---------------------------------------------------");
			opcion = teclado.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("Reservar equipo.");
				System.out.println("Sala (0-4): ");
				sala = teclado.nextInt();
				System.out.println("Equipo (0-19): ");
				equipo = teclado.nextInt();
				if (salas[sala][equipo] == 0) {
					salas[sala][equipo] = 1;
					System.out.println("Reservado.");
				} else if (salas[sala][equipo] == 1) {
					System.out.println("No se puede reservar. Equipo ocupado.");
				}
				break;

			case 2:
				System.out.println("Cancelar reserva.");
				System.out.println("Sala (0-4): ");
				sala = teclado.nextInt();
				System.out.println("Equipo (0-19): ");
				equipo = teclado.nextInt();
				if (salas[sala][equipo] == 1) {
					salas[sala][equipo] = 0;
					System.out.println("Reserva cancelada.");
				} else if (salas[sala][equipo] == 0) {
					System.out.println("No se puede cancelar. Equipo disponible.");
				}
				break;

			case 3:
				System.out.println("Equipos ocupados: ");
				for (sala = 0; sala < 5; sala++) {
					for (equipo = 0; equipo < 20; equipo++) {
						if (salas[sala][equipo] == 1) {
							System.out.println("sala: " + sala + " - equipo: "+ equipo);
						}
					}
				}
				break;
			}
		} while (opcion != 4);

	}
}
