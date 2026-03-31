//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079
package etapa1;

import java.util.Scanner;
public class C07EX02
{
     public static void main (String [] args)
    {   String conceito = "zero";
        int notaParcial1,notaParcial2,notaParcial3,notaFinal;
        try (Scanner keyboard = new Scanner (System.in))
        {
            System.out.print("Digite sua nota parcial 1: ");
            
            notaParcial1 = keyboard.nextInt();
            System.out.print("Digite sua nota parcial 2: ");
            
            notaParcial2 = keyboard.nextInt();
            System.out.print("Digite sua nota parcial 3: ");
            
            notaParcial3 = keyboard.nextInt();
            
            notaFinal = ((notaParcial1 + notaParcial2 + notaParcial3) / 3); //Para calcular a média aritmética de três números, some os três valores e divida o resultado total por 3
            
            switch (notaFinal)
            {
                case 1:
                case 2:
                case 3:
                case 4:
                    conceito = "Nota = E";
                    break;
    
                case 5:
                case 6:
                    conceito = "Nota = D";
                    break;
                
                case 7:
                    conceito = "Nota = C";
                    break;
                
                case 8:
                    conceito = "Nota = B";
                    break;
                
                case 9:
                case 10:
                    conceito = "Nota = A";
                    break;
            }

                System.out.print(conceito);

        }      
    }
}       

//Exercício 2
//Faça um programa que leia as 3 notas parciais de um aluno (valores inteiros entre 0 e 10), calcule a NOTA FINAL (média das notas parciais – pegar a parte inteira do valor) e imprima o CONCEITO do aluno conforme a tabela abaixo:

//                   Notas 8, 6 e 10  Conceito B​

//    Para testar:   Notas 3, 6 e 5	  Conceito E​

//	                 Notas 10, 9 e 10 Conceito A
