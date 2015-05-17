package Estructuras_de_repeticion;

import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);

		int i, vendido, precio, codigo, total = 0, facturasMayores = 0, q = 0, w = 0, e = 0;

		for (i = 1; i <= 5; i++) {
			System.out.println("FACTURA " + i);

			System.out.println("Codigo de articulo: ");
			codigo = teclado.nextInt();

			System.out.println("Litros vendidos: ");
			vendido = teclado.nextInt();
			q = q + vendido;

			System.out.println("Precio por litro: ");
			precio = teclado.nextInt();
			w = w + precio;

			total = precio * vendido;
			System.out.println("TOTAL: " + total + "€");
			e = e + total;

			if (total > 600) {
				facturasMayores++;
			}
		}// fin bucle

		System.out.println("Facturacion total: " + e + "€");
		System.out.println("Litros totales vendidos: " + q);

		System.out.println("Cantidad de facturas > 600€: " + facturasMayores);

	}
}
