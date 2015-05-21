package Medicos;

public class Medico
{

    public Medico(String nombre, String apellidos, int edad)
    {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public void mostrardatos()
    {
        System.out.println((new StringBuilder("Nombre: ")).append(nombre).toString());
        System.out.println((new StringBuilder("Apellidos: ")).append(apellidos).toString());
        System.out.println((new StringBuilder("Edad: ")).append(edad).toString());
    }

    private String nombre;
    private String apellidos;
    private int edad;
}
