import java.util.*;

public class Ejercicio1 
{
    public static void main(String[] args) 
    {
        //Creamos un objetos Scanner que tomara los valores de entrada por consola
        Scanner scan = new Scanner(System.in);

        System.out.println("\nIngrese nombre de usuario, luego presion la tecla Enter: ");
        String usuario = scan.nextLine(); //Escanea el proximo string que es ingresado

        System.out.println("HOLA " + usuario); //Imprime por pantalla hola + nombre de usuario
    
        scan.close();
    }    

}