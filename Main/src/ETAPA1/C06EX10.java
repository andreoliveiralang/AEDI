//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079
package etapa1;

import java.util.Scanner;
public class C06EX10
{
     public static void main (String [] args)
    {  
        double capitalApl,numDias,taxaDiaria,taxaAdministracao, rendimento,impostoRen,valorResgate;
        
        try (Scanner keyboard = new Scanner (System.in))
        {
            System.out.print("Digite o valor aplicado:" );
            capitalApl = keyboard.nextDouble();

            System.out.print("Digite o numero de dias que o valor ficou aplicado: ");
            numDias = keyboard.nextDouble();
            
            System.out.print("Digite a taxa diaria: ");
            taxaDiaria = keyboard.nextDouble();

            rendimento = capitalApl * (taxaDiaria/100) * numDias; // coloquei "/100" porque a taxa é porcentagem.

            impostoRen = 15 % rendimento;

            taxaAdministracao = 10.00;

            valorResgate = capitalApl + rendimento - impostoRen - taxaAdministracao;

            System.out.printf("Valor Resgatado = %.2f " , valorResgate);






        }      
    }
}
