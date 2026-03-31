//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079
package etapa1;

import java.util.Scanner;
public class C05EX10 {
    public static void main (String [] args){
        try (Scanner keyboard = new Scanner (System.in)) {
        int numberIntFive; 

        System.out.print("Escreva um número inteiro de 5 digitos: ");
        numberIntFive = keyboard.nextInt();
        
        
        
        int d1 = numberIntFive / 10000;
        int d2 = (numberIntFive % 10000) / 1000;
        int d3 = (numberIntFive % 1000) / 100;
        int d4 = (numberIntFive % 100) / 10;
        int d5 = (numberIntFive % 10);


        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);

        }
    }
}