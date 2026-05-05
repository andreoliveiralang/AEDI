package ETAPA2;

import java.util.Scanner;

public class C08EX22 {
     public static void main(String[] args) 
    {    
        Scanner keyboard = new Scanner(System.in);
        int nInteiro, divisores=0;
        
        System.out.println("Informe um número Inteiro = ");
        nInteiro = keyboard.nextInt();
        
        if (nInteiro < 0){
        System.out.println("Número inserido inválido, encerrando programa.");
        return;
        }

        for (int aux =1; aux <= nInteiro; aux++){
           if (nInteiro % aux == 0){
           divisores++;
           }
        }
        if (divisores==2){
            System.out.println(nInteiro + " é primo.");
        }
        else{
            System.out.println(nInteiro + " não é primo.");
        }
        keyboard.close();
    }
}

