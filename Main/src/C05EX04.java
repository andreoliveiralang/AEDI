//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079

import java.util.Scanner;
public class C05EX04 {
    public static void main (String[]args){
        double distancia, x1, y1, x2,y2;
        
        Scanner keyboard = new Scanner (System.in);

        System.out.print("Digite X1:");
        x1 = keyboard.nextDouble();
        
        System.out.print("Digite Y1:");
        y1 = keyboard.nextDouble();
        
        System.out.print("Digite X2:");
        x2 = keyboard.nextDouble();
        
        System.out.print("Digite Y2:");
        y2 = keyboard.nextDouble();

        distancia = Math.sqrt( Math.pow(x1 - x2,2) + Math.pow(y1 - y2,2));  
        System.out.print("Distancia = " + distancia);

    }
}