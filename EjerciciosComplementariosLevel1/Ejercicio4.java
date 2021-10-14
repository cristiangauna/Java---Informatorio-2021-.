import java.util.*;

public class Ejercicio4
{
    public static void main(String[] args)
    { 

    Scanner scan = new Scanner(System.in);

    System.out.println("\nIngrese el numero entero, luego presion la tecla Enter: ");
    int numeroingresado = scan.nextInt(); //Escanea el proximo int que es ingresado

    System.out.println("\nEl factorial de " + String.valueOf(numeroingresado) + " es: " + factorial(numeroingresado));

    scan.close();
    }

    
    public static double factorial (double numeroingresado) 
    {
        if (numeroingresado==0)
        {
          return 1;
        }
        else
        {
          return numeroingresado * factorial(numeroingresado-1);
        }
    } 
       
} 
