package ETAPA2;

import java.util.Scanner;
public class C08EX20 {
    public static void main(String[] args) 
    {    
        Scanner keyboard = new Scanner(System.in);
        int conta = 0, nTermos;

        
        System.out.println("Informe o numero de termos = ");
        nTermos = keyboard.nextInt();

        for (int aux = 1; aux <= nTermos; aux++){
           conta += Math.pow(2, aux - 1) ;
           System.out.println(Math.pow(2, aux - 1));
        }

        System.out.println("A soma dos 100 primeiros termos é = " + conta);
    }
}

