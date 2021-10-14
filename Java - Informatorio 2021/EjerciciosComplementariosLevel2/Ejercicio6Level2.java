import java.util.*;

public class Ejercicio6Level2 
{
    public static void main(String[] args) 
    {
        Set<String> empleados = new HashSet<String>();

        empleados.add("juan perez");
        empleados.add("12345678");
        empleados.add("8");
        empleados.add("500");


        HashMap<String, Integer> sueldos = new HashMap<String, Integer>();
        String [] empleadoss = empleados.toArray(new String[empleados.size()]);
        int precio = (Integer.parseInt(empleadoss[0]));
        int horas = (Integer.parseInt(empleadoss[1]));
        int sueldo = precio * horas;
        sueldos.put(empleadoss[2], sueldo);

        System.out.println("\n" + sueldos);
     
    }
}