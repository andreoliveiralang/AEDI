package ETAPA2;

import java.util.Scanner;

public class C09EX10B {
        public static void main(String[] args)
    {
    Scanner keyboard = new Scanner(System.in);
    double num, den, serie=0 ,resultFinal;
    int nTermos;

    System.out.println("Digite o número de termos a ser gerado:");
    nTermos = keyboard.nextInt();

    for (int aux=1; aux<= nTermos; aux++) 
        {  // ? = quantidade de termos da série
            num = aux * 2  ;//? = implementação da variação do numerador
            den = aux * 3 ;//? = implementação da variação do denominador
            serie += num / den;
        }
    resultFinal = 1 + Math.sqrt(serie);
    System.out.print("Valor da Série = "+ resultFinal); 
    }
}


