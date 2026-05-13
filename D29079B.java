//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079

package ETAPA2;

import java.util.Scanner;

public class d29079b {
     public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double num, den, serie=0,finalResult;
    int nTermos;

    System.out.println("Digite o número de termos a ser gerado:");
    nTermos = keyboard.nextInt();

    for (int aux=1; aux<= nTermos; aux++)  

        {  
            num = aux + aux * 9 - 3;
            den = Math.pow(4, aux + 1);
            serie += num / den;
             
        }

    finalResult = Math.pow(serie, 1.0/5.0) - 15.;
    System.out.print("Série = "+ finalResult); 
    
    keyboard.close();
    }
}
