package ETAPA2;

import java.util.Scanner;

public class C09EX11C {
       public static void main(String[] args)
    {
    Scanner keyboard = new Scanner(System.in);
    double num, den, serie=0,finalResult;
    int nTermos;

    System.out.println("Digite o número de termos a ser gerado:");
    nTermos = keyboard.nextInt();

    for (int aux=1; aux<= nTermos; aux++) 
        {  // ? = quantidade de termos da série
            num = (aux * 2 + 1) * (Math.sqrt(aux * 4 + 1));//? = implementação da variação do numerador
            den = Math.pow(5,aux) ;//? = implementação da variação do denominador
            serie += num / den;
        }

    finalResult = Math.pow(serie,2);
    System.out.print("Valor da Série = "+ finalResult); 
    }
}

