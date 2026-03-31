//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079
package etapa1;

import java.util.Scanner;
public class C06EX16
{
     public static void main (String [] args)
    {       String resultFinal;
            int faltas,idade,peso1 ,peso2;
            double prova1,prova2,prova3,trabalho,menorNota ,media,notaFinal;
        
        try (Scanner keyboard = new Scanner (System.in))
        {
            System.out.print("Digite a sua idade: ");
            idade = keyboard.nextInt();
            
            if (idade <=17 )
            peso2 = 1;
            else if (idade > 17 && idade <= 50)
            peso2 = 2;
            else 
            peso2 = 3;
            
            System.out.print("Digite um numero de faltas: ");
            faltas = keyboard.nextInt();
            
            if (faltas <= 5)
            peso1 = 3;
            else if (faltas > 5 && faltas <= 10 )
            peso1 = 2;
            else
            peso1 = 1;

            System.out.print("Digite a nota da prova 1: ");
            prova1 = keyboard.nextDouble();

            System.out.print("Digite a nota da prova 2: ");
            prova2 = keyboard.nextDouble();

            System.out.print("Digite a nota da prova 3: ");
            prova3 = keyboard.nextDouble();

            System.out.print("Digite a nota do trabalho final: ");
            trabalho = keyboard.nextDouble();

            if (prova1 <= prova2 && prova1 <= prova3){//<-- não usar ponto e virgula no IF.
            menorNota = prova1;//o exercicio pede as duas maiores notas para usar na média, se descobrirmos a menor nota de 3 ja sabemos quais notas usar.
            media = (prova1 + prova2 + prova3 - menorNota) / 2;
            notaFinal = media * peso1 + trabalho * peso2;
            if (notaFinal <= 50)
            resultFinal = " Reprovado";
            else if (notaFinal > 50 && notaFinal <= 70)
            resultFinal = " Regular";
            else if (notaFinal > 70 && notaFinal <= 80)
            resultFinal = " Bom";
            else if (notaFinal > 80 && notaFinal <= 90)
            resultFinal = " Muito Bom";
            else 
            resultFinal = " Excelente";
            System.out.println("Resultado =" + resultFinal);}

            else if (prova2 <= prova1 && prova2 <= prova3){
            menorNota = prova2;
            media = (prova1 + prova2 + prova3 - menorNota) / 2;
            notaFinal = media * peso1 + trabalho * peso2;
            if (notaFinal <= 50)
            resultFinal = " Reprovado";
            else if (notaFinal > 50 && notaFinal <= 70)
            resultFinal = " Regular";
            else if (notaFinal > 70 && notaFinal <= 80)
            resultFinal = " Bom";
            else if (notaFinal > 80 && notaFinal <= 90)
            resultFinal = " Muito Bom";
            else 
            resultFinal = " Excelente";
            System.out.println("Resultado =" + resultFinal);}

            else if (prova3 <= prova1 && prova3 <=prova2){
            menorNota = prova3;
            media = (prova1 + prova2 + prova3 - menorNota) / 2;
            notaFinal = media * peso1 + trabalho * peso2;
            if (notaFinal <= 50)
            resultFinal = " Reprovado";
            else if (notaFinal > 50 && notaFinal <= 70)
            resultFinal = " Regular";
            else if (notaFinal > 70 && notaFinal <= 80)
            resultFinal = " Bom";
            else if (notaFinal > 80 && notaFinal <= 90)
            resultFinal = " Muito Bom";
            else 
            resultFinal = " Excelente";
            System.out.println("Resultado =" + resultFinal);}
    

        }      
    }
}       
//EXERCÍCIO 16  
//Uma escola de línguas tem uma fórmula bem peculiar para calcular o RESULTADO FINAL de seus alunos. Ela leva em conta o número de faltas, as três notas de provas, a nota do trabalho final e a idade do aluno. Faça um programa para ler as faltas, as notas das provas, a nota do trabalho final e a idade do aluno, e que calcule e imprima o seu resultado final.​



            //Faltas = 0    Provas = 5 – 9 – 7,2   Trabalho = 10,5  Idade = 15   Resultado = Reprovado​

//Testar:	//Faltas = 6    Provas = 12 – 20 – 3  Trabalho = 30     Idade = 22   Resultado = Excelente​

		    //Faltas = 20  Provas = 8 – 2,5 – 4   Trabalho = 17     Idade = 60   Resultado = Regular	