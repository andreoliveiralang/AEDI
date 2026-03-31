//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079
package etapa1;

import java.util.Scanner;
public class C06EX14
{
     public static void main (String [] args)
    {  
            int numeroInt;
        
        try (Scanner keyboard = new Scanner (System.in))
        {

            System.out.println("Digite um numero inteiro de 4 digitos: ");
            numeroInt = keyboard.nextInt();

        if (numeroInt < 999 && numeroInt > 9999 ){
        System.out.println("numero invalido, numero deve conter 4 digitos.");}

            int d1 = (numeroInt % 10000)/ 1000;
            int d2 = (numeroInt % 1000) / 100;
            int d3 = (numeroInt % 100) / 10;
            int d4 = numeroInt % 10;

            System.out.print(d4);
            System.out.print(d3);
            System.out.print(d2);
            System.out.print(d1);

        }      
    }
}       

        //Exercício 14​

        //Faça um programa que leia um número inteiro de 4 dígitos, e o imprima de trás para frente. Antes de imprimir o número de forma invertida verifique se ele realmente tem 4 dígitos, senão informar “NÚMERO TEM QUE TER 4 DÍGITOS”.

        //Dicas: ​Decomponha o número em 4 dígitos;
        //Utilizar os operadores / e % (resultado e resto de uma divisão inteira para fazer decomposição.


        //Para testar:    Número = 1234     >    Impressão = 4321