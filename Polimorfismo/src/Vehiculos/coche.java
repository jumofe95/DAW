package Vehiculos;


// Referenced classes of package vehiculos:
//            vehiculos

public class coche extends vehiculos
{

    public coche(String color, int numserie, String cilindrada)
    {
        super(color, numserie);
        this.cilindrada = cilindrada;
    }

    public String getCilindrada()
    {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada)
    {
        this.cilindrada = cilindrada;
    }

    public String toString()
    {
        String cadena = "";
        cadena = (new StringBuilder()).append(super.toString()).append("\n").append("Cilindrada: ").append(cilindrada).toString();
        return cadena;
    }

    private String cilindrada;
}
