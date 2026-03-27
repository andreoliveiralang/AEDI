//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079
package ETAPA1;

import java.util.Scanner;
public class C06EX15
{
     public static void main (String [] args)
    {       
            String cidade;
            double codigoPacote,valorfixo = 0,pPV = 0,servExtras = 0,imposto = 0,valorDiaria,taxaDiaria = 0, valorTotal,valorTotal2,valorImposto;
        
        try (Scanner keyboard = new Scanner (System.in))
        {
            System.out.println("Digite o codigo do seu pacote: ");
            codigoPacote = keyboard.nextDouble();
            
            
            if (codigoPacote == 1) {
                valorfixo = 65.00;
                System.out.println("Digite quantidades de dias que consumiu pew-per-view: ");
                pPV = keyboard.nextDouble();
                taxaDiaria = pPV * 1.20;
                
                if (taxaDiaria > 65.00){
                    taxaDiaria = 65.00;
                }
            }

            else if (codigoPacote == 2){
                valorfixo = 104.00;
            
                System.out.println("Digite quantidades de dias que consumiu pew-per-view: ");
                pPV = keyboard.nextDouble();

                taxaDiaria = pPV * 2.10;
            }

            else {
            valorfixo = 137.00;
            taxaDiaria = 0;
            }            

            System.out.println("Digite o valor dos serviços extras: ");
            servExtras = keyboard.nextDouble();

            keyboard.nextLine();

            System.out.println("Digite a cidade onde reside: ");
            cidade = keyboard.nextLine();
            
            
            
            if (cidade.equalsIgnoreCase("Belo Horizonte")) 
            imposto = 0;

            else if (cidade.equalsIgnoreCase("São Paulo"))
            imposto = 0.01 ;

            else if (cidade.equalsIgnoreCase("Rio de Janeiro"))
            imposto = 0.015 ;

            else
            imposto = 0.02;

            valorTotal = valorfixo + taxaDiaria + servExtras;
            valorImposto = valorTotal * imposto;
            valorTotal2 = valorTotal + valorImposto;


            System.out.printf(" Valor Total da Conta = R$ %.2f ", valorTotal2);
            








        }      
    }
}       
