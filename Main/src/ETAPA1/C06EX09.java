//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079
package etapa1;

import java.util.Scanner;
public class C06EX09
{
     public static void main (String [] args)
    {   int genero;
        double altura,pesoIdeal;
        
        try (Scanner keyboard = new Scanner (System.in))
        {
            
            System.out.printf("Insira seu gênero (1 para masculino), (2 para feminino): ");
            genero = keyboard.nextInt();

            System.out.print("insira sua altura em metros: ");
            altura = keyboard.nextDouble();
            
            if (genero == 1){                  //aqui se vc colocar um igual só vc toma no cu" (=) (==)
            pesoIdeal = (72.7 * altura) - 58;
            System.out.printf("O seu peso ideal seria = %.2f " , pesoIdeal);}

            else if (genero == 2){
            pesoIdeal = (62.1 * altura) - 44.7;
             System.out.printf("O seu peso ideal seria = %.2f " , pesoIdeal);}

        }      
    }
}

//Exercício 9
//Tendo como dados de entrada a altura (em metros) e o sexo de uma pessoa (“F” para feminino e “M” para masculino), faça um programa que calcule o peso ideal da mesma, utilizando as seguintes fórmulas:

//            Para homens:   ​PesoIdeal= 72.7 * ALTURA - 58
//            Para mulheres: PesoIdeal= 62.1 * ALTURA - 44.7											​
































//Tendo como dados de entrada a altura (em metros) e o sexo de uma pessoa (“F” para feminino e “M” para masculino), faça um programa que calcule o peso ideal da mesma, utilizando as seguintes fórmulas:​