//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079

package ETAPA3;

import java.util.Scanner;

public class C12EX01 {
       public static void main(String[] args) 
    {

        Scanner keyboard = new Scanner(System.in);
        int vet[] = new int [10]; //criou o vetor de 10 posições
        int cont=0;


        for (int aux=0; aux<vet.length; aux++){ //lenghth é o tamanho do vetor, nesse caso 10
            System.out.println("Digite um número inteiro: ");
            vet[aux] = keyboard.nextInt();
            if (vet[aux] % 5 == 0 && vet[aux] % 7 == 0){ //verifica se o número é divisível por 5 e 7
                cont++; //incrementa o contador caso seja divisível por 5 e 7
            }
        }
        System.out.println("Quantidade de números divisíveis por 5 e 7: " + cont);
        
        keyboard.close();
    }
}
