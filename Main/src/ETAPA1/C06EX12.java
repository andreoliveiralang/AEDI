//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079
package ETAPA1;

import java.util.Scanner;
public class C06EX12
{
     public static void main (String [] args)
    {  
            double valorUniPapelao,valorAluguel,custoTotal,gastoAluguel,gastoTotalPapelao;
            int bolasProduzidas,galpao,bolasDefeito,mesesAteCopa,bolasBoas; 
        
        try (Scanner keyboard = new Scanner (System.in))
        {
            System.out.print("Digite a quantidade de bolas produzidas: ");
            bolasProduzidas = keyboard.nextInt();

            System.out.print("Digite a qaauntidade de bolas com defeito: ");
            bolasDefeito = keyboard.nextInt();

            System.out.print("Digite quantos meses faltam para a copa: ");
            mesesAteCopa = keyboard.nextInt();

            System.out.print("Digite o valor da caixa de papelão: ");
            valorUniPapelao = keyboard.nextDouble();

            System.out.print("Digite o valor do aluguel: ");
            valorAluguel = keyboard.nextDouble();

            bolasBoas = bolasProduzidas - bolasDefeito;
        
            galpao = 0; // tivemos que coloocar que ela é 0 se não deu bom.

            if (bolasBoas <= 8500){
            galpao = 1;}
            
            else if (bolasBoas > 8500  && bolasBoas <= 17000){
            galpao = 2;}

            else if (bolasBoas > 17000 && bolasBoas <= 25500){
            galpao = 3;}

            else if (bolasBoas > 25500 && bolasBoas <= 34000){
            galpao = 4;}

            else if (bolasBoas > 34000 && bolasBoas <= 42500){
            galpao = 5;}

            else if (bolasBoas > 42500 && bolasBoas <= 51000){
            galpao = 6;}

            else if (bolasBoas > 51000 && bolasBoas <= 59500){
            galpao = 7;}

            else if (bolasBoas > 59500 && bolasBoas <= 68000){
            galpao = 8;}

            else if (bolasBoas > 68000 && bolasBoas <= 76500){
            galpao = 9;}

            else if (bolasBoas > 76500 && bolasBoas <= 85000){
            galpao = 10;}

            else if (bolasBoas > 85000 && bolasBoas <= 93500){
            galpao = 11;}

            else if (bolasBoas > 93500 && bolasBoas <= 102000){
            galpao = 12;}

            else {
            System.out.println("Ensira um numero válido!");}
            
            
            gastoAluguel = (galpao * valorAluguel) * mesesAteCopa;

            gastoTotalPapelao = (bolasBoas / 10) * valorUniPapelao;

            custoTotal = gastoAluguel + gastoTotalPapelao;

            System.out.println("Custo Total = " + custoTotal);
            
        }      
    }
}

//Uma indústria produtora de  bolas de futebol fabricou uma grande quantidade para vender na época da Copa do Mundo em 2018. Para isto ela deverá estocar toda a produção em galpões a serem alugados até a Copa. As bolas serão armazenadas em caixas de papelão, que comportam até 10 bolas. Cada galpão a ser alugado comporta até 850 caixas de papelão. Faça um programa que leia a quantidade de bolas produzidas pela fábrica, a quantidade de bolas com defeito e que serão descartadas, o preço unitário das caixas de papelão, a quantidade de meses até a Copa, além do valor mensal do aluguel, e calcule e imprima o custo total de embalagem mais custo total de estocagem de toda a produção. ​

//Observação: A última caixa de papelão deverá ser estocada mesmo que incompleta. O último galpão deverá ser alugado mesmo que não esteja totalmente cheio.

//Para testar: 
     	//Produção de bolas = 85123    
        //Bolas com defeito = 103​
		//caixa Papelão = 0,50  
        //Aluguel Mensal = 100,00 
        //Meses para a Copa = 44  
        //Custo Total = R$ 52651,00​