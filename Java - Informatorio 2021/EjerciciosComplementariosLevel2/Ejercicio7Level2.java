public class Ejercicio7Level2 
{
    public static void main(String[] args) 
    
    {    
        System.out.println("");
        Fizz(1,6);
        
    }


    
    static void Fizz(int a, int b)
    {
        int restodea,restodeb;
        
        if(a > b)
        {
            System.out.println("Error");
        }
        else
        {
            for(int i = a; i < b; i++)
            {
                restodea = i % 2;
                
                restodeb = i % 3;
                
                if(restodea == 0)
                {
                    System.out.print("Fizz, ");
                } 
                else if (restodeb == 0)
                {
                    System.out.print("Buzz, ");
                } 
                else if(restodea == 0 && restodeb == 0)
                {
                    System.out.print("Entra, ");
                }
                else 
                {
                    System.out.print(i + ", ");
                }
            }
        }
    }
}