package Medicos;

public class Medicoconplaza extends Medico
{

    public Medicoconplaza(String nombre, String apellidos, int edad, int identificador)
    {
        super(nombre, apellidos, edad);
        this.identificador = identificador;
    }

    public int getIdentificador()
    {
        return identificador;
    }

    public void setIdentificador(int identificador)
    {
        this.identificador = identificador;
    }

    public void mostrardatos()
    {
        super.mostrardatos();
        System.out.println((new StringBuilder("Identificador")).append(identificador).toString());
    }

    private int identificador;
}
