//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079
package ETAPA1;

import java.util.Scanner;
public class C07EX01
{
     public static void main (String [] args)
    {   String nome,premio = "zero";
        int jogos;

        
        try (Scanner keyboard = new Scanner (System.in))
        {
            System.out.print("Digite seu nome: ");
            nome = keyboard.nextLine();

            System.out.print("Quantos jogos você acertou?: ");
            jogos = keyboard.nextInt();

            switch (jogos)
            {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    premio = "Você não ganhou nenhum prêmio";
                    break;
                    
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    premio = "Você ganhou outro cartão!";
                    break;

                case 11:
                    premio = "Você ganhou R$ 100,00 !";
                    break;
        
                case 12:
                    premio = "Você ganhou R$ 1.000,00 !";
                    break;

                case 13:
                    premio = "Você ganhou R$ 50.000,00 !";
                    break;
            }

                System.out.print(premio);

        }      
    }
}       
