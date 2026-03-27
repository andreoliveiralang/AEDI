//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079
package ETAPA1;

import java.util.Scanner;
public class C05EX01 {
    public static void main(String[] args){
        Double valorDeX,valorDeF;

        try (Scanner keyboard = new Scanner (System.in)) {


        System.out.print("informe o valor de X:");
        valorDeX = keyboard.nextDouble();


        valorDeF = (Math.pow(valorDeX,3) + 4 * valorDeX +10);

        System.out.print("resultado: " + valorDeF);


        } 
    }
}
