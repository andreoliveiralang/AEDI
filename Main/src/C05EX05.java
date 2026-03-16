//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079

import java.util.Scanner;
public class C05EX05 {
    public static void main (String[]args){
        int celsius, kelvin , fahrenheit;
        Scanner keyboard = new Scanner (System.in);

        System.out.print("Informe a temperatura em Celsius:");
        celsius = keyboard.nextInt();
        
        kelvin = celsius + 273;
        
        fahrenheit = (9 * celsius /5 ) + 32; //atentar aqui pra formula de divisão//


        System.out.print("Celsius = " + celsius + " --> Kelvin = " + kelvin + " e Fahrenheit = " + fahrenheit);

        keyboard.close();
    }
}