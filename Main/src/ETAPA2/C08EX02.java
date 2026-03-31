//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079

package etapa2;

import java.util.Scanner;

public class C08EX02
{
     public static void main (String [] args)
    {   
        int nota,falta,frequencia;
        String resultado;
        
        
        Scanner keyboard = new Scanner (System.in);
        
        for (int repeticao = 1; repeticao <= 50; repeticao ++){  
            
            System.out.print("Insira a nota: ");
            nota = keyboard.nextInt();
            
            if (nota == -1 ){
            break;
        }

            System.out.println("Insira a quantidade de faltas: ");
            falta = keyboard.nextInt();
        
           
            if (nota >= 65 && falta <= 16){
            resultado = "APROVADO";
        }
            else {
            resultado = "REPROVADO";
        }
            
            
            System.out.println("ALUNO "+ resultado);}

        keyboard.close();
        
    }
}