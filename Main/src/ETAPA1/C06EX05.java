//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079
package ETAPA1;

import java.util.Scanner;
public class C06EX05
{
     public static void main (String [] args)
    {   
        int numero;
        
        try (Scanner keyboard = new Scanner (System.in))
        {

            System.out.print("Digite um número para saber se ele é divissivel ao mesmo tempo por 5 e 7: ");
            numero = keyboard.nextInt();

           if (numero % 5 == 0 && numero % 7 == 0){
           System.out.print(numero + " é divisivel simuntaneamente por 5 e 7");}
           
           else {
           System.out.print(numero + " não é divisivel simuntaneamente por 5 e 7");}
        }      
    }
}