//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079

import java.util.Scanner;
public class C04EX01 {
    public static void main(String[] args){
        String primeiroNome;
        String segundoNome;
        String sobrenome;
        int idade;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Digite seu nome:");
        primeiroNome = keyboard.nextLine();

        System.out.print("Digite seu segundo nome:");
        segundoNome = keyboard.nextLine();

        System.out.print("Digite seu sobrenome:");
        sobrenome = keyboard.nextLine();

        System.out.print("Agora digite sua idade:");
        idade = keyboard.nextInt();

        System.out.println("");

        System.out.println(sobrenome + "," + primeiroNome + " " + segundoNome);
        System.out.println("Idade: " + idade + " anos ");

        keyboard.close();


    }
}