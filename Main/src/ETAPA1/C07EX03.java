//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079
package ETAPA1;

import java.util.Scanner;
public class C07EX03
{
     public static void main (String [] args)
    {   
        int atraso;
        double imposto,multa = 0;
        try (Scanner keyboard = new Scanner (System.in))
        {
            System.out.print("Digite o valor do imposto: ");
            imposto = keyboard.nextDouble();
            
            System.out.print("Digite os dias de atraso: ");
            atraso = keyboard.nextInt();


            switch (atraso) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    multa = 0;
                    break;        

                case 6:
                case 7:
                case 8:
                    multa = (atraso * 0.02);
                    break;        
            
                case 9:
                case 10:
                    multa = (imposto * 0.10) + (atraso * (0.05 * atraso));
                    break;        
    
                case 45:
                    multa = (imposto * 1.50) + (atraso * 1.00);      // 1.50== 150%  1.00= 1 real
                    break;        
            }
        System.out.print("multa = " + multa);

        }      
    }
} 