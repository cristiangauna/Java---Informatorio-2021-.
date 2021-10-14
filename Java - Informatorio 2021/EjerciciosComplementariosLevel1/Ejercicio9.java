import java.util.*;

public class Ejercicio9
{
    public static void main(String[] args) 
    {

        Scanner scan = new Scanner(System.in);

        System.out.println("\nIngrese el texto, luego presion la tecla Enter: ");
        String texto = scan.nextLine();

        System.out.println("\nIngrese la letra que decea buscar, luego presion la tecla Enter: ");
        String texto2 = scan.nextLine();

        char letra = texto2.charAt(0);

        System.out.println("\n" + buscar(texto, letra));

        scan.close();
    
    }

    public static int buscar (String txt,char letra)
    {
        int contador=0;

        for (int i = 0; i < txt.length(); i++)
        {
            if (txt.charAt(i) == letra)
            {
                contador++;
            }
        }
        return contador;
     
    } 
}