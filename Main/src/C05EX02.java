//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079

import java.util.Scanner;
public class C05EX02 {
    public static void main(String[] args){
        
        Double valorDePi, valorDeRaio, area, volume;

        try (Scanner keyboard = new Scanner (System.in)) {
        
        valorDePi = Math.PI;

        System.out.println("Informe o raio da esfera:");
        valorDeRaio = keyboard.nextDouble();

        area = 4 * valorDePi * Math.pow(valorDeRaio,2);
        System.out.printf("Área = %.2f\n",area);

        volume = 4.0/3.0 * valorDePi * Math.pow(valorDeRaio,3);
        System.out.printf("Volume = %.2f\n", volume);
        
        }    
    }
}