//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079

import java.util.Scanner;
public class C04EX03 
{
    {
        public static void main(String[] args) 
        Double poluente1,poluente2,multa1, multa2, multa3;

        Scanner keyboard = new Scanner (System.in);

        System.out.print("Defina um valor/quantidade de poluente emitido para gerar a primeira multa: ");
        poluente1 = keyboard.nextDouble();

        System.out.print("Digite o valor da multa: ");
        multa1 = keyboard.nextDouble();

        System.out.printf("O valor da multa aumentará caso ultrapasse qual quantidade de poluente?:");
        poluente2 = keyboard.nextDouble();

        System.out.print("Digite o valor da multa caso a quantidade de poluente emitido for entre " + poluente1 + " e " + poluente2 + ": ");  
        multa2 = keyboard.nextDouble();

        System.out.print("Caso a emissão de poluentes ultrapassar " + poluente2 + " defina o valor da multa por poluente emitido:");
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