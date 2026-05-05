package ETAPA2;

import java.util.Scanner;

public class C08EX30 {
     public static void main(String[] args)

    {    
        Scanner keyboard = new Scanner(System.in);
        int x,n,den;
        Double serie=0., num,s;

        System.out.println(" Digite o vlor de X = ");
        x = keyboard.nextInt();

        System.out.println("Digite o valor de N =");
        n = keyboard.nextInt();

        for (int aux = 2; aux <= n ;aux++) 
        {
        
            num = Math.pow(x, aux);
            den = aux ;
            serie += num / den;
        }
    s = Math.log(x) + x + serie; 
    System.out.println(" S = " + s );

    }
}
