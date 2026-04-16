//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079

package ETAPA2;
import java.util.Scanner;
public class C08EX01
{
     public static void main (String [] args)
    {   
        int raio;
        double area;
        
        Scanner keyboard = new Scanner (System.in);
           
        for (int repeticao = 1; repeticao <= 10; repeticao ++){
            System.out.println("Ensira o valor do Raio: ");
            raio = keyboard.nextInt();
            area = Math.PI * Math.pow(raio, 2);
            System.out.println("O valor da área é: " + area);
            System.out.println("Todas os valores calculados");
        }
    
    
        keyboard.close();


    
        }
    }

