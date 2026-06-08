package ETAPA3;
import java.util.Scanner;

public class C12EX10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int nota[] = new int[8];
        String nome[] = new String[nota.length];
        double media = 0, somanota = 0;
        int contmedia = 0;

        for (int rep = 0; rep < nota.length; rep++) {
            System.out.print("Digite o nome do aluno " + (rep + 1) + ": ");
            nome[rep] = teclado.nextLine();

            System.out.print("Digite a nota do aluno " + (rep + 1) + ": ");
            nota[rep] = teclado.nextInt();

            teclado.nextLine();

            somanota += nota[rep];
            contmedia++;
        }

        media = somanota / contmedia;

        System.out.println();

        for (int aux = 0; aux < nota.length; aux++) {
            if (nota[aux] >= media) {
                System.out.println("Nome do aluno: " + nome[aux] + " nota = " + nota[aux]);

            }
        }

        teclado.close();
    }
}
