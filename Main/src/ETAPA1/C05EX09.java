//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079

import java.util.Scanner;
public class C05EX09 {
    public static void main (String [] args){
        try (Scanner keyboard = new Scanner (System.in)) {
        Double nota1, nota2, nota3, soma, media;

        System.out.print("Insira a nota 1: ");
        nota1 = keyboard.nextDouble();

        System.out.print("Insira a nota 2: ");
        nota2 = keyboard.nextDouble();

        System.out.print("Insira a nota 3: ");
        nota3 = keyboard.nextDouble();

        soma = (nota1 * 2) + (nota2 * 3) + (nota3 * 5); 
        media = soma / 10; // achei somente essa solução acrescentando outas classe, classe "soma" //
        
        System.out.print("Sua nota média é: " + media);
        
        }
    }
}
