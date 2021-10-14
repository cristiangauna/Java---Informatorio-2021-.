import java.util.*;

public class Ejercicio2 
{
    public static void main(String[] args) 
    {
        //Creamos un objetos Scanner que tomara los valores de entrada por consola
        Scanner scan = new Scanner(System.in);

        System.out.println("\nIngrese el primer numero entero, luego presion la tecla Enter: ");
        int a = scan.nextInt(); //Escanea el proximo int que es ingresado

        System.out.println("\nIngrese el segundo numero entero, luego presion la tecla Enter: ");
        int b = scan.nextInt(); //Escanea el proximo int que es ingresado

        
        System.out.println("\n" + String.valueOf(a) + " + " + String.valueOf(b) + " = " + (a + b)); 
        System.out.println("\n" + String.valueOf(a) + " - " + String.valueOf(b) + " = " + (a - b)); 
        System.out.println("\n" + String.valueOf(a) + " * " + String.valueOf(b) + " = " + (a * b)); 
        System.out.println("\n" + String.valueOf(a) + " / " + String.valueOf(b) + " = " + (a / b)); 
        System.out.println("\n" + String.valueOf(a) + " % " + String.valueOf(b) + " = " + (a % b)); 

        scan.close();

    }    

}