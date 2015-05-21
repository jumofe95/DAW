package BBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	private static Connection conexion;

	
	
	//====================CREAR CONEXION========================================
	public static Connection createConexion() {

		try {
			Class.forName("org.postgresql.Driver");
			try {
				conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/gestorentradas", "postgres", "root");
				return conexion;
			} catch (SQLException e) {
				System.out.println("NO SE PUEDE REALIZAR LA CONEXION ");
			} // Fin catch.
		} catch (ClassNotFoundException e) {
			System.out.println("Error del controlador ");
		} // Fin catch.

		conexion = null;
		return conexion;
	}
	//====================CREAR CONEXION========================================

	
	
	
	
	//====================CERRAR CONEXION========================================

	public static void closeConexion(){
		try {
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//====================CERRAR CONEXION========================================

	
	
	
	//====================GET CONEXION========================================
	public static Connection getConexion(){
		if (conexion==null) {
			createConexion();
		}
		return conexion;
	}
	//====================GET CONEXION========================================

	
	
	
	
}