import java.util.*;

public class Ejercicio3
{
    public static void main(String[] args) 
    {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("\nIngrese el numero entero, luego presion la tecla Enter: ");
        int numeroingresado = scan.nextInt(); //Escanea el proximo int que es ingresado

        int contador=0;
        
        for(int i = 0; i < numeroingresado; i++)
        {
            
            System.out.print("\n");
            
            contador++;
    
            for(int j=1; j<contador+1;j++) 
            {
    
                System.out.print(j);
            }
        }   
        System.out.println(" ");

        scan.close();

    }
      
} 


    


