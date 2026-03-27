//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079
package ETAPA2;

import java.util.Scanner;

public class C08EX03
{
     public static void main (String [] args)
    {   
        int nota,falta,quantAprovados = 0,quantReprovados = 0;
        String resultado;
        
        
        Scanner keyboard = new Scanner (System.in);
        
        for (int repeticao = 1; repeticao <= 3; repeticao ++){  
            
            System.out.print("Insira a nota: ");
            nota = keyboard.nextInt();
            
            if (nota == -1 ){
            break;
        }

            System.out.println("Insira a quantidade de faltas: ");
            falta = keyboard.nextInt();
        
           
            if (nota >= 65 && falta <= 16){
            resultado = "APROVADO";
            quantAprovados++;
        }
            else {
            resultado = "REPROVADO";
            quantReprovados++;
        }
            
            
            System.out.println("ALUNO "+ resultado);}

    
  
        System.out.println("---------------------------------------");
        System.out.println("Quantidade de Aprovados = " + quantAprovados);
        System.out.println("Quantidade de Reprovados = " + quantReprovados);
        System.out.println("---------------------------------------");
        
keyboard.close();
    }
}