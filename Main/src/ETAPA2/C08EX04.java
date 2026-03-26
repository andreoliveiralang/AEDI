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
        String nome;
        int idade,menorIdade, contAprovados = 0, contReprovados = 0;
        Scanner keyboard = new Scanner (System.in);

        for (int contador = 0; contador < 3; contador ++) 
        {
            System.out.println("Digite seu nome: ");
            nome = keyboard.nextLine();

            System.out.println("Digite sua Idade: ");
            idade = keyboard.nextInt();
            
            keyboard.nextLine();

            if (idade <= 18)
            idade = ;


            keyboard.close();
        }
    }
}