//Nome: André Luiz De Oliveira 
//Matricula:D29079

import java.util.Scanner;
public class D29079C
{
     public static void main (String [] args)
    {  
        double taxaResidencial,pulsos,valorConta,calculoPulsos,iSS;
        try (Scanner keyboard = new Scanner (System.in))
        {
            System.out.print("Digite a taxa residencial: ");
            taxaResidencial = keyboard.nextDouble();

            System.out.print("Digite a quantidade de pulsos consumidos: ");
            pulsos = keyboard.nextDouble();

            if (pulsos >= 100)
                calculoPulsos = 0;

                else if (pulsos > 100 && pulsos <= 1000)
                    calculoPulsos = 100;
                
                else
                    calculoPulsos = 0.05 * pulsos;
            
            iSS = taxaResidencial * 0.6 + calculoPulsos * 0.6;  
                            
            valorConta = taxaResidencial + calculoPulsos + iSS ;

            
            
            System.out.printf("Valor da conta = R$ %.2f " ,valorConta );

        }
    }
}
