import java.util.ArrayList;

public class Ejercicio2Level2 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> numeros= new ArrayList<Integer>();

        numeros.add(1);   
        numeros.add(2);  
        numeros.add(3);  
        numeros.add(4);  
        numeros.add(5);

        System.out.println("\nLista: ");
        for ( int numero : numeros )
        {
            System.out.println(numero);
        }
        System.out.println("Cantidad de elementos en la lista: " + (numeros.size()));
        
        numeros.add(0, 0);

        numeros.add(6, 6);

        System.out.println("\nLista con numeros agregados al principio y al final: ");
        for ( int numero : numeros )
        {
            System.out.println(numero);
        }
        System.out.println("Cantidad de elementos en la lista modificada: " + (numeros.size()));

    }
}
