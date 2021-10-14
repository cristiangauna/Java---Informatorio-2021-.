import java.util.*;

public class Ejercicio5
{
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);

        System.out.println("\nIngrese el primer numero entero, luego presion la tecla Enter: ");       
        int numero1 = scan.nextInt();
       
        System.out.println("\nIngrese el segundo numero entero, luego presion la tecla Enter: ");       
        int numero2 = scan.nextInt();
             
        System.out.println(numero1 + " x " + numero2 + " = " + multi(numero1,numero2));
        scan.close();
    }

    public static int multi (int numero1, int numero2) 
    {
        int mult=0;

        for(int i=0;i<numero1;i++)
        {
            mult=mult+numero2;
        }
        return mult;
    }
    
} 
