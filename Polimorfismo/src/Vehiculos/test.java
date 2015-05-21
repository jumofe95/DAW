package Vehiculos;

// Referenced classes of package vehiculos:
//            registrovehiculos, coche, barcos

public class test
{

    public test()
    {
    }

    public static void main(String args[])
    {
        System.out.println("Inicio");
        registrovehiculos r = new registrovehiculos();
        coche c1 = new coche("rojo", 1, "600cc");
        coche c2 = new coche("verde", 2, "1200cc");
        barcos b1 = new barcos("colorbarco", 11111);
        r.aF1adirvehiculo(c1);
        r.aF1adirvehiculo(c2);
        r.aF1adirvehiculo(b1);
        System.out.println(r.toString());
    }
}
