package curriculo;

import java.util.ArrayList;

public class Cartelera 
{
    private ArrayList<String> cartelera;

    public Cartelera(ArrayList<String> pCartelera)
    {
        cartelera = pCartelera;
    }

    public ArrayList<String> darCartelera()
    {
         return cartelera;
    }
    public boolean darDisponibilidad(String codigo)
    {
        if(cartelera.contains(codigo))
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
}