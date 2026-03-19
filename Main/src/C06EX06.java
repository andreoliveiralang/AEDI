//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079

import java.util.Scanner;
public class C06EX06
{
     public static void main (String [] args)
    {   
        int valorA ,valorB ,valorC, raizes;
        double delta,x1,x2, funcaoX;
        try (Scanner keyboard = new Scanner (System.in))
        {

            System.out.print("Insira o valor de A: ");
            valorA = keyboard.nextInt();

            System.out.print("Insira o valor de B: ");
            valorB = keyboard.nextInt();

            System.out.print("Insira o valor de C: ");
            valorC = keyboard.nextInt();

            delta = Math.pow(valorB,2) - (4 * valorA) * valorC; 

            if (delta > 0){ //2 raizes
                x1 = (- valorB + Math.sqrt (delta)) / (2 * valorA);
                x2 = (- valorB - Math.sqrt (delta)) / (2 * valorA);
               
                funcaoX = (valorA * x2) + (valorB * x1) + valorC;
                
                System.out.printf("Teremos 2 raízes = %.0f e %.0f " ,x1, x2);}    // <-- <-- <-- PRINTF Dica. 
                

            else if (delta == 0){ //1 raiz
                x1 = (- valorB + Math.sqrt (delta)) / (2 * valorA);
                x2 = (- valorB - Math.sqrt (delta)) / (2 * valorA); 
                
                funcaoX = (valorA * x2) + (valorB * x1) + valorC; //como é igual a zero somando ou diminuindo vai dar o mesmo resultado. por isso dizemos que so tem uma raiz.
                System.out.printf("Teremos 1 raíz = %.0f ", x1 );}

            else {
                System.out.print("Não há raizes");}
        }      
    }
}

// ∆ = delta

//Pela fórmula de Báskara abaixo calculamos as raízes reais de uma
//equação do segundo grau. Faça um programa para solicitar ao
//usuário os valores de A, B e C e calcular e imprimir as raízes da
//função f(x).



//               delta > 0 -> 2 raizes reais
//         -->   delta = 0 -> 1 raíz
//               delta < 0 -> não tem raízes

//         -->   f(x) = Ax2 + Bx + C    -->  Raizes    -B ± v4
//                                                       2A                                                       
//         -->    ∆ = B(elevadoa2 - 4AC