//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079

import java.util.Scanner;
public class C05EX07 {
    public static void main (String[]args){
        double valorX,funcaoX;
        try (Scanner keyboard = new Scanner (System.in)){

     System.out.print("Insira o valor de X: ");
     valorX = keyboard.nextDouble();
     funcaoX = Math.sqrt(Math.pow(valorX/4 + 1 ,2) + 1.0/5 * valorX); //aqui adicionamos o ".0" na divisão pro resultado não ficar inteiro.
     System.out.printf("F(x) = %.4f\n" , funcaoX);
     
        }
    }
}
