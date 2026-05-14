//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079
package ETAPA3;

import java.util.Scanner;

public class C12EX25 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String frase;

        System.out.println("Digite uma frase curta separando as palavras em (-). : ");
        frase = keyboard.nextLine();

        String palavras[] = frase.split("-");
        for (int aux = 0; aux < palavras.length; aux++) {
            System.out.println(palavras[aux]);
        }

        keyboard.close();
    }
}
