//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079

package ETAPA2;

import java.util.Scanner;

public class C08EX02
{
     public static void main (String [] args)
    {   
        int nota,falta;
        String resultado;
        
        
        Scanner keyboard = new Scanner (System.in);
        for (int repeticao = 1; repeticao <= 3; repeticao ++){
            
            System.out.println("Ensira a quantidade de faltas: ");
            falta = keyboard.nextInt();
            if (falta > 16)
            resultado = "não frequente" ; //nao frequente
            else 
            resultado = "frequente"; //frequente
            
            System.out.print("Quantidade de faltas: ");
            nota = keyboard.nextInt();
            if (nota < 0)
            break;
            else if (nota >= 65 && resultado.equals("frequente"));
            
            System.out.println(" ");

        
        
        
        
        
        
        keyboard.close();
    }
}