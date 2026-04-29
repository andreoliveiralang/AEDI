package ETAPA2;

import java.util.Scanner;

public class C09EX10C 
{
      public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        double num, den, serie=0.0, resultFinal;
        int nTermos;

        System.out.println("Digite o número de termos a ser gerado:");
        nTermos = keyboard.nextInt();

        for (int aux=1; aux<= nTermos; aux++) 
            {  // ? = quantidade de termos da série
                num = aux * 2 - 1  ;//? = implementação da variação do numerador
                den = aux * 2 ;//? = implementação da variação do denominador
                serie += num / den;
            }
        resultFinal = Math.pow(serie,2);
        System.out.print("Valor da Série = "+ 1.0/3.0 * resultFinal); // muito cuidado aqui, se estier dando 0, pode ser que faltou um .0 ali.
    }
}   

    

