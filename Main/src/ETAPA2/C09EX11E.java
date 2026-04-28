//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079

package ETAPA2;

import java.util.Scanner;

public class C09EX11E {
     public static void main(String[] args)
    {
    Scanner keyboard = new Scanner(System.in);
    double num, den, serie=0,finalResult;
    int nTermos;

    System.out.println("Digite o número de termos a ser gerado:");
    nTermos = keyboard.nextInt();

    for (int aux=1; aux<= nTermos; aux++) 
        {  // ? = quantidade de termos da série
            num = Math.pow(aux,2) * (Math.sqrt(aux * 2 + 3));//? = implementação da variação do numerador
            den = Math.pow(aux * 1 + 1, aux) ;//? = implementação da variação do denominador
            serie += num / den;
        }

    finalResult = 2.0/3.0 * serie;
    System.out.print("Valor da Série = "+ finalResult); 
    }
}

