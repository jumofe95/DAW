package Vehiculos;


public class vehiculos
{

    public vehiculos(String color_, int numserie_)
    {
        color = color_;
        numserie = numserie_;
    }

    public String toString()
    {
        String cadena = "";
        cadena = (new StringBuilder("Color: ")).append(color).append("\n").append("Numero de serie: ").append(numserie).toString();
        return cadena;
    }

    public int getNumserie()
    {
        return numserie;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    private String color;
    private int numserie;
}
