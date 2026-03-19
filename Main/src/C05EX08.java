

//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079

import java.util.Scanner;
public class C05EX08{
    public static void main (String[]args){
        double valorS, valorA, raio, valorDePi;
        try (Scanner keyboard = new Scanner (System.in)) {
    
    System.out.print("Insira o valor da área de um setor circular: ");
    valorS = keyboard.nextDouble();

    System.out.print("Agora insira o ângulo: ");
    valorA = keyboard.nextDouble();

    valorDePi = Math.PI; 

    raio = Math.sqrt((360 * valorS) / (valorA * valorDePi)); // usei corretamente os parenteses //

    System.out.print(" R ="+ raio);

        }
    }
}