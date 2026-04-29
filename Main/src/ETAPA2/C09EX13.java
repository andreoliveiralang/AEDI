package ETAPA2;

import java.util.Scanner;

public class C09EX13 {
    public static void main(String[] args)
    {
    Scanner keyboard = new Scanner(System.in);
    double num = 1, den, sinal = 1, serie= 0;
    int nTermos;

    System.out.println("Digite o número de termos a ser gerado:");
    nTermos = keyboard.nextInt();

    for (int aux=1; aux<= nTermos; aux++) 
        { 
            num = num * aux;
            den = Math.pow(2,aux) - 1 ;
            serie += num / den * sinal;
            sinal *= -1; 
        }

    
    System.out.print("Valor da Série = "+ serie); 
    }
}

//estudar, entendi nada!