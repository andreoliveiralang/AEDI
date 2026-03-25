//Nome: André Luiz De Oliveira 
//Matricula:D29079

import java.util.Scanner;
public class D29079A
{
     public static void main (String [] args)
    {  
        double x,y,z, funcao;
        try (Scanner keyboard = new Scanner (System.in))
        {
            System.out.println("Insira valor de x =");  
            x = keyboard.nextDouble();
            System.out.println("Insira valor de y =");  
            y = keyboard.nextDouble();
            System.out.println("Insira valor de z =");  
            z = keyboard.nextDouble();

            funcao = (4 * Math.pow(x, 4) -2)*(y + 1 ) / (z - 1) + Math.sqrt ((x - y) + 4 * Math.pow(z, 2)+ Math.sqrt(1 - x/.5)/ 4 + (Math.pow(y - z,5)));

        System.out.println("f(x,y,z) = " + funcao);

        }
    }
}



//Z:\ANDRE LUIZ DE OLIVEIRA