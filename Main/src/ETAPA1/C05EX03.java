//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079
package etapa1;

import java.util.Scanner;
public class C05EX03 {
    public static void main (String[]args){
        double salario, liquido,impostoDeRenda;
        int nDependentes;

        try (Scanner keyboard = new Scanner (System.in)) {
        
        
        System.out.print("Digite o valor do seu salário:");
        salario = keyboard.nextInt();
        
        System.out.print("Digite o número de Dependentes:");
        nDependentes = keyboard.nextInt();
        
        liquido = salario - (nDependentes * 60.00);
        
        impostoDeRenda = (liquido * 0.15);
        
        System.out.printf("Salário = %.0f",salario);
        System.out.print(" e Dependentes = " + nDependentes);
        System.out.printf(" --> IR = %.0f\n", impostoDeRenda);
        
        }
    }
}
