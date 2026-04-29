package ETAPA2;

import java.util.Scanner;

public class C09EX12 {
      public static void main(String[] args)
    {
    Scanner keyboard = new Scanner(System.in);
    double num, den, serie=0,finalResult;
    int nTermos;

    System.out.println("Digite o número de termos a ser gerado:");
    nTermos = keyboard.nextInt();

    for (int aux=1; aux<= nTermos; aux++) 
        {  // ? = quantidade de termos da série
            num = (aux * 2 - 1) * (Math.pow(2,aux + 1));//? = implementação da variação do numerador
            den = Math.pow(aux * 5 - 3, 2) ;//? = implementação da variação do denominador
            serie += num / den;
        }

    finalResult = 5 * (Math.sqrt(serie));
    System.out.print("Valor da Série = "+ finalResult); 
    }
}

