package ETAPA2;

import java.util.Scanner;

public class C09EX11A {
    
     public static void main(String[] args)
    {
    Scanner keyboard = new Scanner(System.in);
    double num, den, serie=0,finalResult;
    int nTermos;

    System.out.println("Digite o número de termos a ser gerado:");
    nTermos = keyboard.nextInt();

    for (int aux=1; aux<= nTermos; aux++) 
        {  // ? = quantidade de termos da série
            num = aux + aux * 7 - 6 ;//? = implementação da variação do numerador
            den = Math.pow(4,aux - 1);//? = implementação da variação do denominador
            serie += num / den;
        }

    finalResult = Math.pow(serie, 1.0/3.0); //RAIZ CÚBICA
    System.out.print("Valor da Série = "+ finalResult); 
    }
}
    
