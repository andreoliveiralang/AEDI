//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079

package ETAPA3;

import java.util.Scanner;

public class C12EX07 {
     public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        String conceito;
        String alunos[] = new String [10]; //nome alunos
        int notas[]= new int [10]; // nota alunos

        
        for (int aux=0; aux<alunos.length; aux++)
        {
            System.out.println("Digite o nome do aluno:");
            alunos[aux] = keyboard.nextLine();

            System.out.println("Digite a nota do aluno:");
            notas[aux] = keyboard.nextInt();

            keyboard.nextLine(); // Limpa o buffer do teclado
        }

        for  (int aux = 0; aux<alunos.length; aux++)
        {
            if (notas[aux] <= 30){
                conceito = "D";
                } 
                else if (notas[aux] > 30 && notas[aux] <= 60){
                    conceito = "C";
                } 
                else if (notas[aux] > 60 && notas[aux] <= 80){
                    conceito = "B";
                } 
                else{
                    conceito = "A";
                }
                
                System.out.println(alunos[aux] + " - " + notas[aux] + " - " + conceito);
                
                keyboard.close();
            }
    }
}
