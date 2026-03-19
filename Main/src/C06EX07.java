//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079

import java.util.Scanner;
public class C06EX07
{
     public static void main (String [] args)
    {   
        double salario,partLucro,impRenda, partLucroLiquido, salarioComPL;
        try (Scanner keyboard = new Scanner (System.in))
        {
            System.out.print("Insira o salario: ");
            salario = keyboard.nextDouble();

            if (salario <= 300){
            partLucro = 500 + (salario * 0.70);
            impRenda = 0.25 * partLucro;
            partLucroLiquido = partLucro - impRenda;
            System.out.println("PL liquido = " + partLucroLiquido);}
            
            else if (salario <= 1000){
            partLucro = 200 + (salario * 0.50);
            impRenda = partLucro * 0.25;
            partLucroLiquido = partLucro - impRenda;
            System.out.println("PL liquido = " + partLucroLiquido);}

            else if (salario > 1000){
            partLucro = 0 + (salario * 0.30);
            impRenda = 0.25 * partLucro;
            partLucroLiquido = partLucro - impRenda;
            System.out.println("PL liquido = " + partLucroLiquido);}

            else
            System.out.println("valor inserido invalido");
        }      
    }
}



























//                               --> INSTRUÇÕES PARA PROVA <--

//na prova obrigatorio colocar nome completo.
//ctrl + alt +L = alinhar identação.
//ficar atento co nomes de variaveis, coocar nomes apropriados cuidar com letra maiuscula, minuscula - easy.
// majiotariamente "long double e string" talvez "int".
//conversão de variaveis --> string para longo ou double.
// um next numerico dps um next line da bug, lembrar de colocar um teclado next entre eles
// /n quebra a linha da msg
// printf %.2f vai cair na prova                                 !!!!!!!!!!!         ESTUDAR MAIS
// joptionpane vai cair na prova                                 !!!!!!!!!!!         ESTUDAR MAIS
// inputdialog vai cair na prova                                 !!!!!!!!!!!         ESTUDAR MAIS
// conversão de string para VARIAVEL NUMÉRICA vai cair na prova  !!!!!!!!!!!         ESTUDAR MAIS
// leitura de arquivo txt NÃO sera cobrado.
// para divisao aparecr sem ser numero inteiro colocar tipo 10/6.0
// CUIDAR COM USO DE PARENTESES sou mestre para errar esse.

//dar uma olhada sobre pegar lados do numero. VAI CAIR NA PROVA, pegar numeros do meio que é o bixo.!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

//comando if e else obviamente vai cair na prova                 !!!!!!!!!!!         ESTUDAR MAIS
//cuidado com o sinal de  =, ==     &&
//ignore case                                                    !!!!!!!!!!!        ESTUDAR MAIS
//ultomo else sempre soziho


//1 questao expressao aritmetica cabuloso
//1 decomposiçao numerica digito a digito
//1 