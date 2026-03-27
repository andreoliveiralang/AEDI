//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079

package ETAPA2;

import java.util.Scanner;

public class C08EX04
{
     public static void main (String [] args)
    {   
        String nome;
        int idade,menorIdade = 0, maiorIdade = 0;
        Scanner keyboard = new Scanner (System.in);

        for (int repeticao = 0; repeticao < 5; repeticao ++) 
        {
            System.out.println("Digite seu nome: ");
            nome = keyboard.nextLine();

            System.out.println("Digite sua Idade: ");
            idade = keyboard.nextInt();
            
            keyboard.nextLine();

            if (idade <= 18){
                idade = menorIdade;
                menorIdade++;}
            
            else{
                idade = maiorIdade;
                maiorIdade++;}     
        }
        
        System.out.println("---------------------------------------");
        System.out.println("Até 18 = " + menorIdade);
        System.out.println("Acima de 18 = " + maiorIdade);
        System.out.println("---------------------------------------");
        keyboard.close();
    }
}