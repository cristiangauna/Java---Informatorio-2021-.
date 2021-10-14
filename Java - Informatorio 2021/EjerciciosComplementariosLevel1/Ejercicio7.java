import java.util.*;

public class Ejercicio7
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nIngrese la palabra en mayusculas, luego presione la tecla Enter: ");
        String palabra = scan.nextLine();

        scan.close();

        System.out.println(mayuscula(palabra));
    }


    public static String mayuscula (String palabra) 
    {
        String mayuscula= "";
       
        for(int i = 0; i < palabra.length(); i++)
        {
            int letra = (int)palabra.charAt(i);
            char let = ((char)(letra + 32));
            System.out.println(let);
        }
        return mayuscula.toString();
    }
} 