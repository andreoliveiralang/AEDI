package ETAPA3;
import java.util.Scanner;

public class C12EX12 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int nota[] = new int[50];
        String nome[] = new String[nota.length];

        int maiorNota = 0;

        // Entrada de dados
        for (int rep1 = 0; rep1 < nota.length; rep1++) {

            System.out.print("Digite o nome do aluno " + (rep1 + 1) + ": ");
            nome[rep1] = teclado.nextLine();

            System.out.print("Digite a nota do aluno " + (rep1 + 1) + ": ");
            nota[rep1] = teclado.nextInt();

            teclado.nextLine();

            // Descobrir a maior nota
            if (rep1 == 0 || nota[rep1] > maiorNota) {

                maiorNota = nota[rep1];

            }
        }

        System.out.println();
        System.out.println("Maior nota da turma: " + maiorNota);

        System.out.println();
        System.out.println("Alunos com a maior nota:");

        // Mostrar todos os alunos com a maior nota
        for (int rep2 = 0; rep2 < nota.length; rep2++) {

            if (nota[rep2] == maiorNota) {

                System.out.println(nome[rep2]);
            }
        }

        teclado.close();
    }
}