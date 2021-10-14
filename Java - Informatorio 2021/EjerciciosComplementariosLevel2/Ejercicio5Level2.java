import java.util.ArrayList;

public class Ejercicio5Level2 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> horastrabajadas = new ArrayList<Integer>();

        horastrabajadas.add(6);
        horastrabajadas.add(7);
        horastrabajadas.add(8);
        horastrabajadas.add(4);
        horastrabajadas.add(5);

        
        ArrayList<Integer> valor = new ArrayList<Integer>();

        valor.add(350);
        valor.add(345);
        valor.add(550);
        valor.add(600);
        valor.add(320);

       
        int totalfinal = 0;
        System.out.println("");
        for(int i = 0; i < horastrabajadas.size(); i++)
        {
            System.out.print((horastrabajadas.get(i) * valor.get(i)) + " ");
            totalfinal = totalfinal + horastrabajadas.get(i) * valor.get(i);
        }
        
        System.out.println("\n\nTotal Final: $ " + totalfinal);     
     
    }
}