//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079

import java.util.Scanner;
public class C06EX11
{
     public static void main (String [] args)
    {  
            String equipe1, equipe2;
            int setsGanhos1,setsGanhos2,pontos1,pontos2 ; 
        
        try (Scanner keyboard = new Scanner (System.in))
        {
    

            System.out.print("Digite o nome da equipe 1: ");
            equipe1 = keyboard.nextLine();

            System.out.print("Digite o nome da equipe 2: ");
            equipe2 = keyboard.nextLine();

            System.out.print("Quantos Sets a equipe "+ equipe1 + " ganhou? = ");
            setsGanhos1 = keyboard.nextInt();

            System.out.print("Quantos Sets a equipe " + equipe2 + " ganhou? = ");
            setsGanhos2 = keyboard.nextInt();

            if (setsGanhos1 == 3 && setsGanhos2 <= 1){
            pontos1 = 3;
            pontos2 = 0;
            }
            else if (setsGanhos1 == 3 && setsGanhos2 == 2){
            pontos1 = 2;
            pontos2 = 1;
            }
            else if (setsGanhos2 == 3 && setsGanhos1 <= 1){
            pontos1 = 0;
            pontos2 = 3;
            }
            else {
            pontos1 = 1;
            pontos2 = 2;
            }

            System.out.print("Pontos " + equipe1+ " = " + pontos1 + " Pontos " + equipe2 + " = " + pontos2);

        }      
    }
}

// boa, estou pegando a mnah, mas aqui tive um erro, pois depois do if , tinha ";" e isso ferrou com tudo