//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079
package ETAPA1;

import java.util.Scanner;
public class C06EX08
{
     public static void main (String [] args)
    {   String nome;
        double altura,peso1,peso2,iMCminimo, iMCmaximo;
        
        try (Scanner keyboard = new Scanner (System.in))
        {
           
            System.out.print("Digite seu nome: ");
            nome = keyboard.nextLine();

            System.out.print("Digite sua altura (Metros): ");
            altura = keyboard.nextDouble();
            
            iMCminimo = 20;
            
            iMCmaximo = 25;
            
            peso1 = iMCminimo * Math.pow(altura, 2);

            peso2 = iMCmaximo * Math.pow(altura, 2);


            System.out.println(nome);
            System.out.printf("Peso minimo = %.2f " ,peso1);
            System.out.printf(" Peso maximo = %.2f " , peso2);



        }      
    }
}




//EXERCÍCIO 8
//Faça um programa que leia o nome e a altura (em metros) de uma pessoa e calcule e imprima os pesos mínimo e máximo para que ela esteja dentro da faixa de peso ideal de acordo com a tabela de IMC (Índice de Massa Corporal) abaixo.​

//IMC = Peso / Altura2 ​(ao quadrado)

//IMC menor que 20  pessoa está abaixo do peso​

//IMC entre 20 e 25  pessoa está no peso ideal​

//IMC maior que 25  pessoa está acima do peso​

