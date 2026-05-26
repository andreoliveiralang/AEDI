package ETAPA3;

import java.util.Scanner;

public class C12EX01 {
       public static void main(String[] args) 
    {

        Scanner keyboard = new Scanner(System.in);
        int vet[] = new int [10]; 
        int cont=0;


        for (int aux=0; aux<vet.length; aux++){
            System.out.println("Digite um número inteiro: ");
            vet[aux] = keyboard.nextInt();
            if (vet[aux] % 5 == 0 && vet[aux] % 7 == 0){
                cont++;
            }
        }
        System.out.println("Quantidade de números divisíveis por 5 e 7: " + cont);
        
        keyboard.close();
    }
}
