import java.util.ArrayList;

public class Ejercicio1Level2 
{
    public static void main(String[] args) 
    {
        ArrayList<String> ciudades=new ArrayList<String>();
        ciudades.add("Bariloche");
        ciudades.add("Cordoba");
        ciudades.add("Resistencia");

        System.out.println("\n");    
        
        int contador = 0;
        for ( String ciudad : ciudades )
        {
            contador++;
            System.out.println("#" + String.valueOf(contador) + " - " + ciudad);
        }
    }
}
