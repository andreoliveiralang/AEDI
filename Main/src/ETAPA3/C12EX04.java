//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079

package ETAPA3;

import java.util.Scanner;

public class C12EX04 {
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        int bat1[] = new int [21]; 

    System.out.println("Registro de chegada 1° Bateria:");
        for (int aux=1; aux<bat1.length; aux++){
            System.out.println("Digite o número do corredor que chegou em " + aux + "° lugar: ");
            bat1[aux] = keyboard.nextInt();
        }
        
        for (int aux=0;aux<20;aux++){
            System.out.println(bat1[aux] +"/"+ bat1[aux+10]);
        } 
    }
}


