package ETAPA2;

import java.util.Scanner;

public class d29079c {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    
    String nome,conceito,nomeMaior="";
    int totalAlunos=0,acimade80=0;
    double nota1,nota2,nota3,notaTrabalhoF,notaFinal=0,mediaTrabalhos,somaNotasF=0,mediaNotasF,somaNotaTrabalhos=0,maiorNota=0;
    
    do
    {
        keyboard.nextLine();

        System.out.println("Digite o seu nome:");
            nome = keyboard.nextLine();
            if(nome != "x" ){}
        
            keyboard.nextLine();
        
            totalAlunos++;
        

        System.out.println("Digite a sua nota da prova 1:");
            nota1= keyboard.nextDouble();

        
        System.out.println("Digite a sua nota da prova 2:");
            nota2= keyboard.nextDouble(); 


        System.out.println("Digite a sua nota da prova 3:");
            nota3= keyboard.nextDouble();

        System.out.println("Digite a sua nota do trabalho final:");
            notaTrabalhoF= keyboard.nextDouble();
            somaNotaTrabalhos+=notaTrabalhoF;
            if (notaTrabalhoF <= 0 )

        



        //CALCULO
        notaFinal= (nota1 + nota2 * 2 + nota3 * 3 + notaTrabalhoF) /7;
        somaNotasF+=notaFinal;

        mediaTrabalhos=somaNotaTrabalhos/totalAlunos;//fazendo a média dos trabalhos.
        mediaNotasF=somaNotasF/totalAlunos; //fazendo a média das notas Finais.

        if (somaNotasF > maiorNota) {
                    nomeMaior = nome;
                }
        //CONCEITO
        if (notaFinal < 60){
            conceito = "D";
        }
        else if (notaFinal < 70 && notaFinal >= 60){
            conceito = "C";
        }
        else if (notaFinal < 80 && notaFinal >= 70){
            conceito = "B";
        }
        else{
            conceito = "A";
            acimade80++;
        }
    
        
    } while (nome != "x");

    System.out.println("Quantidade de alunos que tiraram nota acima de 80 nas três provas = "+ acimade80);

    System.out.println("Média das notas finais = "+ mediaNotasF);

    System.out.println("Media das notas dos trabalhos finais que não foram zerados = "+mediaTrabalhos);

    System.out.println("O nome de um dos alunos que tirou a maior nota final = "+nomeMaior);

    }
}