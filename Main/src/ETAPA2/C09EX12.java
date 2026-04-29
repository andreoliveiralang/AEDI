package ETAPA2;

import java.util.Scanner;

public class C09EX12 {
      public static void main(String[] args)
      {
        
        
        //      EXERCICIO 12
        //Faça um programa para calcular e imprimir o valor de PI obtido pela série abaixo,       gerando-se os 10000 primeiros termos. 
        //Dica: Os temos que ocupam as posições ímpares da série (1, 1/5, 1/9, ...) são somados e os pares (1/3, 1/7, 1/11, ...) são subtraídos.
    
    
    Scanner keyboard = new Scanner(System.in);
    double num, den, serie=0,sinal=1,finalResult;
    int nTermos;
    System.out.println("Digite o número de termos a ser gerado:");
    nTermos = keyboard.nextInt();

    for (int aux=0; aux<= nTermos; aux++)  // veja que alteramos aqui para '0' o aux
        {  
            num = 1;
            den = aux * 2 + 1;
            serie += num / den * sinal;
            sinal *= -1; 
        }

    finalResult = 4 * serie;
    System.out.print("Valor da de PI = "+ finalResult); 
    }
}

