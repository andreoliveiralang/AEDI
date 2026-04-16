
//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079

package ETAPA2;
import java.util.Scanner;

public class C08EX08 
{

    public static void main(String[] args) 
    {

        Scanner keyboard = new Scanner(System.in);

        int nota,faltas,totalNotas=0, maisDe16f=0,aprovado=0, media=0;

        for (int repeticao = 0; repeticao < 3; repeticao++) 
        {
            System.out.println("Digite a nota do aluno: ");
            nota = keyboard.nextInt();

            System.out.println("Digite a quantidade de faltas do aluno: ");
            faltas = keyboard.nextInt();

            if (nota >= 65 && faltas <= 16){
                aprovado++;
                totalNotas = totalNotas + nota;
                System.out.println("APROVADO");
            }
            else {
                System.out.println("REPROVADO");
            }

            if (faltas > 16){
            maisDe16f++;
            }
        }

            if (aprovado > 0){
            media = totalNotas / aprovado;}
            
            else {
            media = 0;
            }
            
        System.out.println("__________________________________________");
        System.out.println("Média das notas dos aprovados = "+ media);

        System.out.println("Quantidade de alunos com mais de 16 faltas = " + maisDe16f);
    
    }
}
// EXERCICIO 2 PROMETE TIRAR O COURO DEE QUEM FAZ