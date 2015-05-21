package Vehiculos;

import java.util.ArrayList;


public class registrovehiculos{
	 private int contador;
	    private ArrayList<vehiculos> arrayvehiculos;

    public registrovehiculos()
    {
        contador = 0;
        arrayvehiculos = new ArrayList<vehiculos>();
    }

    public void aF1adirvehiculo(vehiculos v)
    {
        arrayvehiculos.add(v);
        contador++;
    }

    public void eliminarvehiculo(int numserie)
    {
        int indiceEncontrado = -1;
        for(int i = 0; i < arrayvehiculos.size(); i++)
        {
            vehiculos v = (vehiculos)arrayvehiculos.get(i);
            if(v.getNumserie() == numserie)
                indiceEncontrado = i;
        }

        if(indiceEncontrado != -1)
            arrayvehiculos.remove(indiceEncontrado);
    }

    public void pintar(String color)
    {
        for(int i = 0; i < arrayvehiculos.size(); i++)
        {
            vehiculos v = (vehiculos)arrayvehiculos.get(i);
            v.setColor(color);
        }

    }

    public void pintarSiNumSerie(String color, int numserie)
    {
        for(int i = 0; i < arrayvehiculos.size(); i++)
        {
            vehiculos v = (vehiculos)arrayvehiculos.get(i);
            if(v.getNumserie() == numserie)
                v.setColor(color);
        }

    }

    public String toString()
    {
        String cadena = "";
        for(int i = 0; i < arrayvehiculos.size(); i++)
        {
            vehiculos v = (vehiculos)arrayvehiculos.get(i);
            cadena = (new StringBuilder(String.valueOf(cadena))).append(v.toString()).append("\n").toString();
        }

        return cadena;
    }

   
}
