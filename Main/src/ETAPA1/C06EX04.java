//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079

import java.util.Scanner;
public class C06EX04
{
     public static void main (String [] args)
    {   
        String nome;
        double altura, peso, iMC;
        try (Scanner keyboard = new Scanner (System.in))
        {

            System.out.print("Digite seu nome: ");
            nome = keyboard.nextLine();

            System.out.print("Digite sua altura (Metros): ");
            altura = keyboard.nextDouble();

            System.out.print("Digite seu peso (KG): ");
            peso = keyboard.nextDouble();

            iMC = (peso / (Math.pow(altura,2)));

            if (iMC <= 18)
            System.out.print(nome + ",está desnutrido(a).");

            else if (iMC < 20)
            System.out.print(nome + ",está abaixo do peso.");

            else if (iMC <= 25)
            System.out.print(nome + ",está no peso ideal.");
            
            else if (iMC <= 27)
            System.out.print(nome + ",está acima do peso.");
            
            else
            System.out.print(nome + ",está obeso(a).");
            
            //ELSE IF = se nao for esse entao tenta esse, se nao for o proximo, tenta o outro... e assim sucessivamente.//
            
            //O último sempre tem que ser "ELSE" sozinho//
        }      
    }
}
            


//Exercício 4
//Faça um programa para ler o nome, a altura (em
//metros) e o peso (em kg) de uma pessoa e informar a
//ela a sua situação corporal de acordo com o seu IMC
//(Índice de Massa Corporal) que será calculado pelo
//programa.

//FORMULA: IMC = Peso / Altura2//

//IMC menor que 18 > pessoa está desnutrida
//IMC menor que 20 > pessoa está abaixo do peso
//IMC entre 20 e 25 > pessoa está no peso ideal
//IMC maior que 25 > pessoa está acima do peso
//IMC maior que 27 > pessoa esta obesa

//Para testar:Altura = 1,75 e Peso = 87,5 -> Pessoa está obesa
//            Altura = 1,75 e Peso = 76,5 -> Pessoa está no peso ideal




//FORMULAS:
// Math.pow(x.y) = Calcula a potência de X elevado a Y 
// Math.sart(x)  = Calcula a raiz quadrada de X
// Math.cbrt(x)  = Calcula a raiz cúbica de X