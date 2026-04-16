//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079
package ETAPA1;

import java.util.Scanner;
public class simulado2 
{
    public static void main(String[] args)
    {   Double idade;
        String nacionalidade;
        try (Scanner keyboard = new Scanner(System.in))
        {
            System.out.println("Digite a sua Nacionalidade: ");
            nacionalidade = keyboard.nextLine();
            
            System.out.println("Digite a sua idade:");
            idade = keyboard.nextDouble(); 

            if (nacionalidade.equalsIgnoreCase ("brasileiro")){ //string nao é ""==", "  é  ".equals".
                if (idade >= 18 &&  idade <= 70) {
                    System.out.println("Voto obrigadotorio");
                } else if ((idade >= 16 && idade < 18) || idade > 70){
                    System.out.println("Voto facultativo");
                } else {
                    System.out.println("Não vota (muito jovem.)");
                }
                
                } else {
                    System.out.println("Estrangeiro não vota no Brasil.");
                }










        }      
    }
} 