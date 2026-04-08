
//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079

package ETAPA2;
import java.util.Scanner;

public class C08EX09 
{

    public static void main(String[] args) 
    {

        Scanner keyboard = new Scanner(System.in);
        
        String nome,sexo;
        int idade, totalIdadeM = 0, totalIdadeF = 0,mediaIdadeF, mediaIdadeM;

        System.out.println("QUANTIDADE DE PESSOAS ANALISADAS = 5 ");
        
        for (int repeticao = 0; repeticao < 5; repeticao++) 
        {
            System.out.println(" Digite o nome: ");
            nome = keyboard.nextLine();
            
            System.out.println("Digite o sexo (M ou F) : " );
            sexo = keyboard.nextLine();
            
            System.out.println("Digite sua idade: ");
            idade = keyboard.nextInt();

            keyboard.nextLine();
            
            if (sexo .equalsIgnoreCase("M")){
            totalIdadeM++;
            totalIdadeM = totalIdadeM + idade;
            }    
            else if (sexo == "F"){
            totalIdadeF++;
            totalIdadeF = totalIdadeF + idade;
            }
            
        }
        
        mediaIdadeF = totalIdadeF / totalIdadeF;
        mediaIdadeM = totalIdadeM / totalIdadeM;

        System.out.println(" Média das idades dos homens = "+ mediaIdadeM);
        System.out.println("Média das idades das Mulheres = "+ mediaIdadeF);

    }
}