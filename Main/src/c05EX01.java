//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079

import java.util.Scanner;

public class C05EX01 {
    public static void main(String[] args){
        Double valordeX,valordeF;

        Scanner keyboard = new Scanner (System.in);


        System.out.print("informe o valor de X:");
        valordeX = keyboard.nextDouble();


        valordeF = (Math.pow(valordeX,3) + 4 * valordeX +10);

        System.out.print("resultado: " + valordeF);
    
        keyboard.close();
        

    } 
}
