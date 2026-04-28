package ETAPA2;

import java.util.Scanner;

public class C09EX11B {
     public static void main(String[] args)
    {
    Scanner keyboard = new Scanner(System.in);
    double num, den, serie=0,finalResult;
    int nTermos;

    System.out.println("Digite o número de termos a ser gerado:");
    nTermos = keyboard.nextInt();

    for (int aux=1; aux<= nTermos; aux++) 
        {  // ? = quantidade de termos da série
            num = aux * 3 - 2;//? = implementação da variação do numerador
            den = Math.sqrt(aux * 3 + 4);//? = implementação da variação do denominador
            serie += num / den;
        }

    finalResult = 5.0/3.0 * serie;
    System.out.print("Valor da Série = "+ finalResult); 
    }
}
