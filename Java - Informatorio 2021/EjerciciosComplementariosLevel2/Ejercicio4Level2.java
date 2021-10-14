import java.util.ArrayList;

public class Ejercicio4Level2 
{
    public static void main(String[] args) 
    {
        ArrayList<String> estudiantes= new ArrayList<String>();
       
        estudiantes.add("Pablo");
        estudiantes.add("Lucas");
        estudiantes.add("Antonio");
        estudiantes.add("Lucia");
        estudiantes.add("Micaela");
        estudiantes.add("Rodolfo");
        estudiantes.add("Martin");
        estudiantes.add("Eugenia");
        estudiantes.add("Román");
        estudiantes.add("Rodrigo");
        estudiantes.add("Juan");
        estudiantes.add("Santiago");
      
        System.out.println("\nEstudiantes del curso 1: " + estudiantes.subList(0, 4));
        System.out.println("\nEstudiantes del curso 2: " + estudiantes.subList(4, 8));
        System.out.println("\nEstudiantes del curso 3: " + estudiantes.subList(8, 12));
        
    }
}