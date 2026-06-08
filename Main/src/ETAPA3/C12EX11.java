package ETAPA3;
import java.util.Scanner;

public class C12EX11 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int nota[] = new int[50];
        String nome[] = new String[nota.length];

        int maiorNota = 0;
        String nomeMaior = "";

        for (int rep1 = 0; rep1 < nota.length; rep1++) {

            System.out.print("Digite o nome do aluno " + (rep1 + 1) + ": ");
            nome[rep1] = teclado.nextLine();

            System.out.print("Digite a nota do aluno " + (rep1 + 1) + ": ");
            nota[rep1] = teclado.nextInt();

            teclado.nextLine();

            if (rep1 == 0 || nota[rep1] > maiorNota) {

                maiorNota = nota[rep1];
                nomeMaior = nome[rep1];
            }
        }

        System.out.println();
        System.out.println("Aluno com a maior nota:");
        System.out.println(nomeMaior + " = " + maiorNota);

        teclado.close();
    }
}