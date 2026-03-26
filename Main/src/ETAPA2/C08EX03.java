//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079

package ETAPA2;

import java.util.Scanner;

public class C08EX03
{
     public static void main (String [] args)
    {   
        double nota;
        int falta, contAprovados = 0, contReprovados = 0;
        Scanner keyboard = new Scanner (System.in);

        for (int contador = 0; contador < 50; contador ++) 
        {

            System.out.print("Digite a nota final (-1 para sair): ");
            nota = keyboard.nextDouble();

            if (nota == -1) {
                break;
            }

            System.out.print("Digite o total de faltas: ");
            falta = keyboard.nextInt();

            if (nota >= 65 && falta <= 16) {
                System.out.println("ALUNO APROVADO.");
                contAprovados++;
            }
             else {
                System.out.println("ALUNO REPROVADO.");
                contReprovados++;
            }
        }
        System.out.println("---------------------------------------");
        System.out.println("Quantidade de Aprovados = " + contAprovados);
        System.out.println("Quantidade de Reprovados = " + contReprovados);
        System.out.println("---------------------------------------");
        
keyboard.close();
    }
}