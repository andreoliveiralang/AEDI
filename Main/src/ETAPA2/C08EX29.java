package ETAPA2;
import java.util.Scanner;
public class C08EX29
{
       public static void main(String[] args)

    {    
        Scanner keyboard = new Scanner(System.in);
        int x,y, resultado = 1;

        System.out.println(" Digite o vlor de X = ");
        x = keyboard.nextInt();

        System.out.println("Digite o valor de Y =");
        y = keyboard.nextInt();

        for (int aux = 1; aux <= y ;aux++) 
        {
        resultado = resultado * x;
    
        System.out.print(resultado);

        }

    }
}

