//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079

package ETAPA3;

import java.util.Scanner;

public class C12EX02 {
     public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int valoresInteiros[] = new int [10];
        int contador =0;

        for (int rep=0; rep < valoresInteiros.length; rep ++){          // lenght usado para medir a capacidade maxima de um vetor.
            System.out.println("Digite um valor númerico inteiro : ");
            valoresInteiros[rep] = keyboard.nextInt();
        }

        System.out.print("Números impressos : ");

        for (int rep=0; rep < valoresInteiros.length; rep++) {
            if (valoresInteiros[rep]> 5 && valoresInteiros[rep] < 10 ) {
                System.out.print(valoresInteiros[rep]+ " ");
            }

        }
        
        keyboard.close();
    }
}