package ETAPA3;

import java.util.Scanner;

public class C13EX04 {
    public static void main(String[] args) 
    {

        Scanner keyboard = new Scanner(System.in);
        int numeroAleatorio;
        int palpite, tentativas=0;

        System.out.println("Descubra um número entre 0 e 100!");
        numeroAleatorio = (int) (Math.random() * 100) +1;
        System.out.println(numeroAleatorio);

        do{
            System.out.println("tente até acertar!\n");
            palpite = keyboard.nextInt();
            tentativas++;

            
            if (numeroAleatorio != palpite){
                System.out.println("ERROU!");
                
                
            if (palpite < numeroAleatorio)
                System.out.println("DICA: O número é MAIOR");
            
            else if (palpite > numeroAleatorio)
                System.out.println("DICA: O número é MENOR!");

        }
        
        } while (palpite != numeroAleatorio);
        System.out.println("Parabéns você acertou!\n");
        System.out.println("E precisou de " + tentativas +" tentativas");
         
    }
}


