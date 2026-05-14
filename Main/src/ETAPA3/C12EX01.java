//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079

package ETAPA3;

import java.util.Scanner;

public class C12EX01 {
     public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int valoresInteiros[] = new int [10];
        int contador =0;

        for (int rep=0; rep < valoresInteiros.length; rep ++){
            System.out.println("Digite um valor númerico inteiro : ");
            valoresInteiros[rep] = keyboard.nextInt();
        }

        for (int rep=0; rep < valoresInteiros.length; rep++) {
            if (valoresInteiros[rep] % 5 == 0 && valoresInteiros[rep] % 7 == 0 ) {
                contador++;
            }
        }
        
       System.out.println("Quantidade de divisores de 5 e 7 ao mesmo tempo: " + contador);
        
        keyboard.close();
    }
}