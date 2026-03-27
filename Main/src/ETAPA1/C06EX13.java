//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079
package ETAPA1;

import java.util.Scanner;
public class C06EX13
{
     public static void main (String [] args)
    {  
            int horaInicial,minutoInicial,horaFinal,minutoFinal,duracao1,duracao2,convertInicioMinutos, convertFinalMinutos,duracaoTotalMinutos,horasResultado,minutosResultado;
        
        try (Scanner keyboard = new Scanner (System.in))
        {
            System.out.print("Digite a hora de inicio do jogo: ");
            horaInicial = keyboard.nextInt();

            System.out.print("Digite o minuto inicial do jogo: ");
            minutoInicial = keyboard.nextInt();

            System.out.print("Digite hora final do jogo: ");
            horaFinal = keyboard.nextInt();

            System.out.print("Digite o minuto final do jogo: ");
            minutoFinal = keyboard.nextInt();

            convertInicioMinutos = (horaInicial * 60) + minutoInicial;
            convertFinalMinutos = (horaFinal * 60) + minutoFinal;

            duracaoTotalMinutos = convertFinalMinutos - convertInicioMinutos;

            horasResultado = duracaoTotalMinutos / 60;
            minutosResultado = duracaoTotalMinutos % 60;

            System.out.println("O jogo durou "+ horasResultado + " horas e "+ minutosResultado+ " minutos.");
            

        }      
    }
}       
