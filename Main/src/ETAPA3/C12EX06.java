//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079

package ETAPA3;

import java.util.Scanner;

public class C12EX06 {
     public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        String meses[] = new String [12]; 

        
        for (int aux=0; aux<meses.length; aux++)
        {
            System.out.println("Escreva os 12 meses do ano em ordem cronologica:");
            meses[aux] = keyboard.nextLine();
        }

            for  (int aux= meses.length-1; aux>= 0; aux--)
            {
                System.out.print(meses[aux] + " , ");
            }
            keyboard.close();
            
    }
}

