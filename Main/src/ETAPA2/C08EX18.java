package ETAPA2;

import java.util.Scanner;

public class C08EX18 {
    public static void main(String[] args) 
    {    
        Scanner keyboard = new Scanner(System.in);
        int numInt,conta;
    
        System.out.println("Digite um numero inteiro de 1 a 9: ");
        numInt = keyboard.nextInt();

        if(numInt < 1 || numInt > 9){
        System.out.print("Número inserido Inválido, fechando o programa.");
        return;
        }

        for (int aux = 1; aux <= 9; aux++){
           conta = aux * numInt;
           
           System.out.println(aux + " x " + numInt +" = "+ conta);
        
        }
    }
}

