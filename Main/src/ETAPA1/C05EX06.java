//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079
package ETAPA1;

import java.util.Scanner;
public class C05EX06 {
    public static void main (String[]args){
        double a, b ,c ,cordX, cordY, distancia;
        try (Scanner keyboard = new Scanner (System.in)) {

    System.out.print("Insira o valor A da reta: ");
    a = keyboard.nextDouble();

    System.out.print("Insira o valor B da reta: ");
    b = keyboard.nextDouble();

    System.out.print("Insira o valor C da reta: ");
    c = keyboard.nextDouble();

    System.out.print("Insira o valor da cordenada X: ");
    cordX = keyboard.nextDouble();

    System.out.print("Insira o valor da cordenada Y: ");
    cordY = keyboard.nextDouble();

    distancia = (a * cordX + b * cordY + c) / Math.sqrt(Math.pow(a ,2) + Math.pow(b,2)); //tem que cuidar muito com esses parenteses, parece que todos os numeradores tem que estar dentro do parenteses.

    System.out.print("D = " +distancia);

        }
    }
}
