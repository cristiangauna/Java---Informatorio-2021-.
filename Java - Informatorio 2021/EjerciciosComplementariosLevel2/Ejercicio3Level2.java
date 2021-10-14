import java.util.ArrayList;

import java.util.Collections;

public class Ejercicio3Level2
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> barajafrancesa= new ArrayList<Integer>();
       
        for(int i = 2; i <= 10; i++)
        {
           barajafrancesa.add(i);
        }
       
        System.out.println("\n-----------------");
        System.out.println("En Orden: ");
        //Collections.reverse(barajafrancesa);
        for(int carta : barajafrancesa)
        {
            System.out.println(carta);
        }
        System.out.println("-----------------");


        System.out.println("\n\n-----------------");
        System.out.println("Orden Inverso:");
        Collections.reverse(barajafrancesa);
        for(int carta : barajafrancesa)
        {
        System.out.println(carta);
        }
        System.out.println("-----------------");


        System.out.println("\n\n-----------------");
        System.out.println("Mezclado:");
        Collections.shuffle(barajafrancesa);
        for(int carta : barajafrancesa)
        {
            System.out.println(carta);
        }
        System.out.println("-----------------");

    }
    
}
