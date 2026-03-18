//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079

import java.util.Scanner;
public class C06EX01
{
     public static void main (String [] args)
    {
        double valorX;
        try (Scanner keyboard = new Scanner (System.in))
        {
            System.out.print("Informe o valor de X: ");
            valorX = keyboard.nextDouble();

            if (valorX < 4)
                valorX = 5 * valorX +3 / Math.sqrt(16 - (Math.pow(valorX , 2 )));

            if (valorX = 4)
                valorX = 0;













           

        }
    }
}
