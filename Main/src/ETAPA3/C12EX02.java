//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079

import java.util.Scanner;
public class C12EX02 {
         public static void main(String[] args) 
    {

        Scanner keyboard = new Scanner(System.in);
        int vet[] = new int [10]; //criou o vetor de 10 posições
        
        for (int aux=0; aux<vet.length; aux++){ 
            System.out.println("Digite um número inteiro: ");
            vet[aux] = keyboard.nextInt();
        }
        System.out.println("Números entre 5 e 10: ");
        for (int aux=0; aux<vet.length; aux++){
            if (vet[aux] > 5  && vet[aux] < 10){ //verifica se o número está entre 5 e 10    
                System.out.print(vet[aux] + " ");
            }
        }
        
        keyboard.close();
    }
}