package ETAPA2;

import java.util.Scanner;

public class C10EX03 {
    public static void main(String[] args)
    {
    Scanner keyboard = new Scanner(System.in);
   
    int valorA,valorR;
    double s;
    
    System.out.println("Digite o valor de A (angulo) = ");
    valorA = keyboard.nextInt();
    
    do // FAÇA INDEFINIDAMENTE...
    {
        System.out.println("Digite o valor de R (-1 para parar) = ");
        valorR = keyboard.nextInt();
        
        if (valorR != -1){ // SE O VALOR FOR DIFERENTE DE -1 , ENTÃO FAÇA ESSE CALCULO.
            s = (valorA * Math.PI * Math.pow(valorR, 2))/360; // CALCULO.
            System.out.println("S = " + s); // IMPRESSÃO DO RESULTADO.
    
        }

    } while (valorR != -1); //ENQUANTO O VALOR FOR DIFERENTE DE -1 ele vai continuar

    keyboard.close();
   
        
    }

}


//A área de um setor circular é dada pela equação abaixo. Faça um programa que leia uma única vez o valor de A (ângulo), e calcule e imprima o valor da área do setor circular para uma série de valores de R (raio) que o usuário irá informar. O último valor de R será igual a -1 (flag) e não entrará nos cálculos.