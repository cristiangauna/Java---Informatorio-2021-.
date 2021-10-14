import java.util.*;

public class Ejercicio8
{
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);

        System.out.println("\nIngrese su Nombre y Apellido, luego presion la tecla Enter: ");
        String nombreyapellido = scan.nextLine();

        System.out.println("\nIngrese su Edad, luego presion la tecla Enter: ");
        String edad=scan.nextLine();

        System.out.println("\nIngrese su Dirección, luego presion la tecla Enter: ");
        String direccion=scan.nextLine();

        System.out.println("\nIngrese su Ciudad, luego presion la tecla Enter: ");
        String ciudad=scan.nextLine();
     
        System.out.println("\n" + ciudad + " - " + direccion + " - " + edad + " - " + nombreyapellido);
    
        scan.close();

    }

}
    
