
//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079

package etapa2;
import java.util.Scanner;

public class C08EX07 
{

    public static void main(String[] args) 
    {

        Scanner keyboard = new Scanner(System.in);

        String nome;
        int idade, ate12 = 0, acima30 = 0,totalIdade = 0;
        double mediaIdade;

        for (int repeticao = 0; repeticao < 5; repeticao++) 
        {
            System.out.println("Digite o nome do aluno: ");
            nome = keyboard.nextLine();
            
            System.out.println("Digite a idade do aluno: ");
            idade = keyboard.nextInt();

            keyboard.nextLine();
            

            if (idade <= 12 ){
                ate12 = ate12+1;
            }else if (idade > 30){
                acima30 = acima30+1;
            }
            
            totalIdade=totalIdade + idade;
            
            
        }
        mediaIdade = totalIdade / 5.0;
        System.out.println("--------------------------------------------------------");
        System.out.println(" Alunos que tem até 12 anos = " + ate12);
        System.out.println(" Alunos que tem acima de 30 anos = " + acima30);
        System.out.println(" Média das idades informadas = " + mediaIdade);
        System.out.println(" Total idade = " + totalIdade);
        System.out.println("--------------------------------------------------------");
    }        
}