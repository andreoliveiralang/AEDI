//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079
package ETAPA1;

import java.util.Scanner;
public class C06EX03
{
     public static void main (String [] args)
    {
        double salario, comissao;
        try (Scanner keyboard = new Scanner (System.in))
        {

            salario = 240;

            System.out.print("Digite o valor de vandas para comissão: ");
            comissao = keyboard.nextDouble();

            if (comissao <= 1000){}

            else if (comissao <= 10000)
            salario = salario + ( comissao * 0.10);

            else salario += 1000; //esse "+=" é só uma forma curta de escrever: "salario = salario + 1000";

                System.out.printf("Salário = %.2f " , salario);
                
        }      
    }
}