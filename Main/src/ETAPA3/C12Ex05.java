//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079

package ETAPA3;

import java.util.Scanner;

public class C12EX05 
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        int num[] = new int [10]; 

        
        for (int aux=0; aux<num.length; aux++)
        {
            System.out.println("Digite 10 valores númericos inteiros: ");
            num[aux] = keyboard.nextInt();
        }

            for  (int aux= num.length-1; aux>= 0; aux--)
            {
                System.out.print(num[aux]%3 + " ");

                keyboard.close();
            }
        
    }
}

