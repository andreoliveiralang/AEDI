//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079
package ETAPA1;

import java.util.Scanner;
public class C05EX11 {
    public static void main (String [] args){
        try (Scanner keyboard = new Scanner (System.in)) {
        int cheque, banco, agencia, sequencial;

    System.out.print("Digite o número do cheque: ");
    cheque = keyboard.nextInt();

    int d1 = cheque / 1000000;
    int d2 = cheque % 1000000 / 1000;
    int d3 = cheque % 1000;

    banco = d1;
    agencia = d2;
    sequencial = d3;

    System.out.print("Banco = " + banco);
    System.out.print(" Agência = " + agencia);
    System.out.print(" Sequencial = " + sequencial);

        }
    }
}
