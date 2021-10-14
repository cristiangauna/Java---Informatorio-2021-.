import java.util.*;

public class Ejercicio6
{
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);

        System.out.println("\nIngrese el primer numero entero, luego presion la tecla Enter: ");       
        int numero1 = scan.nextInt();
       
        System.out.println("\nIngrese el segundo numero entero, luego presion la tecla Enter: ");       
        int numero2 = scan.nextInt();
         
        System.out.println(numero1 + " elevado a " + numero2 + " = " + potencia(numero1,numero2));
        scan.close();
    }

    public static int potencia (int elnumero1, int elnumero2) 
    {
        int pot=1;

        for(int i=0;i<elnumero2;i++)
        {
            pot=pot*elnumero1;
        }
        return pot;
    }
    
} 
