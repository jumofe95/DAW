package BBDD;

import java.sql.*;

public class Libros {

	private int idLibro;
	private String titulo;
	private String genero;
	private String autor;
	private Double precio;

	Statement sql;
	private ResultSet rs;

	public boolean error = false;
	public boolean fin_info = false;
	Connection miConexion;

	
	
	//====================GETTERS/SETTERS========================================
	public int getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	//====================GETTERS/SETTERS========================================

	
	
	
	
	
	
	
	//====================CONSTRUCTORES========================================
	public Libros() {
	}

	public Libros(int numero) {
		leerRegistro(numero);
	}
	//====================CONSTRUCTORES========================================

	
	
	
	
	
	
	//====================BORRAR REGISTRO========================================
	public void borrarRegistro(int numero) {
		miConexion = Conexion.getConexion();
		String sentencia = "DELETE FROM Libros WHERE idLibro=" + numero;
		error = false;
		try {
			sql = miConexion.createStatement();
			sql.executeUpdate(sentencia);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//====================BORRAR REGISTRO========================================
	


	
	
	
	
	
	
	//====================LISTAR REGISTRO========================================
	public boolean listarRegistro() {
		return listarRegistro("");
	}

	public boolean listarRegistro(String where) {
		miConexion = Conexion.getConexion();
		fin_info = false;
		String sentencia = "SELECT * FROM Libros ";
		if (where.length() > 0) {
			sentencia += " WHERE " + where;
		}
		try {
			sql = miConexion.createStatement();
			rs = sql.executeQuery(sentencia);
			if (rs.next()) {
				carga(rs);
			} else
				fin_info = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fin_info;
	}

	public boolean siguiente() {
		try {
			if (rs.next()) {
				carga(rs);
				fin_info = false;
			} else
				fin_info = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fin_info;
	}
	//====================LISTAR REGISTRO========================================

	
	
	
	
	
	
	
	
	//====================TO STRING========================================
	public String toString() {
		return "IdLibro:" + idLibro + "\tTitulo:" + titulo + "\tAutor:" + autor;

	}
	//====================TO STRING========================================
	
	
	
	
	
	
	
	
	
	//====================LEER REGISTRO========================================
	public void leerRegistro(int numero) {
		ResultSet rs;
		miConexion = Conexion.getConexion();
		error = false;
		try {
			sql = miConexion.createStatement();
			rs = sql.executeQuery("SELECT * FROM Libros WHERE idLibro="
					+ numero);
			if (rs.next()) {
				carga(rs);
			} else
				error = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//====================LEER REGISTRO========================================

	
	
	
	
	
	
	//====================CARGA========================================
	private void carga(ResultSet rs) {
		try {
			idLibro = rs.getInt("idLibro");
			titulo = rs.getString("Titulo");
			autor = rs.getString("Autor");
			precio = rs.getDouble("Precio");
			genero = rs.getString("Genero");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//====================CARGA========================================
	
	
	
	
	
	
	//====================GRABAR REGISTRO========================================
	public void grabarRegistro(Libros libro) {
		String sentencia;
		sentencia = "INSERT INTO Libros" + "(Titulo,Autor,Genero,Precio) "
				+ " VALUES (" + "'" + titulo + "'," + "'" + autor + "'," + "'"
				+ genero + "'," + precio + ")";
		System.out.println(sentencia);
		try {
			miConexion = Conexion.getConexion();
			sql = miConexion.createStatement();
			sql.executeUpdate(sentencia);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	//LOS METE EN UN ARRAY
	public Object[] toArray() {
		Object[] sal = new Object[5];

		try {
			sal[0] = rs.getObject("idLibro");
			sal[1] = rs.getObject("Titulo");
			sal[2] = rs.getObject("Autor");
			sal[3] = rs.getObject("Precio");
			sal[4] = rs.getObject("Genero");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sal;
	}
	//====================GRABAR REGISTRO========================================

	
	
	
	
	
	
	//====================MODIFICAR REGISTRO========================================
	public void modificarRegistro(int idLibro, String titulo){
		
	}
	//====================MODIFICAR REGISTRO========================================


}
