package ETAPA3;

import java.util.Scanner;

public class C12EX08 {
     public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        int num[] = new int [20]; 

        for (int aux=0; aux<num.length; aux++)
        {
            System.out.println("Digite 20 números inteiros: ");
            num[aux] = keyboard.nextInt();
        }

            for  (int aux= 0; aux<10; aux++)
            {
                System.out.print(num[aux] + 11 +aux + "  ");

                keyboard.close();
            }
    }
}

