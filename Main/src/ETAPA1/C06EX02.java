//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079
package etapa1;

import java.util.Scanner;
public class C06EX02
{
     public static void main (String [] args)
    {
        double poluentes, multa;
        try (Scanner keyboard = new Scanner (System.in))
        {
             System.out.print("Digite a quantidade de poluentes: ");
            poluentes = keyboard.nextDouble();

            if (poluentes < 1500)
            multa = 0;
            
            else if (poluentes > 1500 && poluentes<= 3500 )
            multa = 3000;

            else 
            multa = 5000 * poluentes;

            System.out.printf("Multa = R$%.2f", multa);

        }
    }
}