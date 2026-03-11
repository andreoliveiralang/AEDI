//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079

import java.util.Scanner;
public class C04EX03 {
    public static void main(String[] args) 
    {
        Double poluente1,poluente2,multa1, multa2, multa3;

        Scanner keyboard = new Scanner (System.in);

        System.out.println("Digite ATÉ qual quantidade de poluente emitido (POLUENTE 1),gerará uma multa:(MULTA 1)");
        poluente1 = keyboard.nextDouble();
        
        System.out.println("Digite o valor da multa (MULTA 1), referente a (POLUENTE 1)");
        multa1 = keyboard.nextDouble();

        System.out.println("Defina o LIMITE de poluente emitido (POLUENTE 2), que seja cobrado o mesmo valor de:" + multa1);
        poluente2 = keyboard.nextDouble();

        System.out.println("Entre " + poluente1 + " e " + poluente2 + " Digite o valor da multa: (MULTA 2)");
        multa2 = keyboard.nextDouble();

        System.out.println("Se a emissão de poluentes for maior que " + poluente2 + " Digite o valor da multa: (MULTA 3)");
        multa3 = keyboard.nextDouble();
        
        System.out.println();
        
        System.out.println("=============================================================");

        System.out.println("Quantidade de Poluente Emitido x Valor da Multa");
        
        System.out.println("_____________________________________________________________");
        
        System.out.printf("Até %.0f multa de R$ %.2f %n", poluente1, multa1);
        
        System.out.println("_____________________________________________________________");
        
        System.out.printf("Entre %.0f e %.0f multa de R$ %.2f %n", poluente1, poluente2, multa2);
        
        System.out.println("_____________________________________________________________");
        
        System.out.printf("Acima de %.0f multa de R$ %.2f por poluente emitido %n", poluente2, multa3);
        
        System.out.println("=============================================================");

        System.out.println();
           
        keyboard.close();
      
    }
}