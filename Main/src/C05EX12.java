//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079

import java.util.Scanner;
public class C05EX12 
{
     public static void main (String [] args)
     {
        try (Scanner keyboard = new Scanner (System.in))
         {
            int hour, minutes, seconds;

            System.out.print("Digite os segundos: ");
            seconds = keyboard.nextInt();

            int d1 = seconds / 3600;       //hora
            int d2 = seconds % 3600 / 60;  //minutos
            int d3 = seconds % 60;     //segundos

            hour = d1;
            minutes = d2;
            seconds = d3 ;

            System.out.print("Hour: " + hour + " Minutes: " + minutes + " Seconds: " + seconds);

        }
    }
}