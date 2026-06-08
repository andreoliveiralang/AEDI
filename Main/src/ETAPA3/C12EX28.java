package ETAPA3;
import java.util.Scanner;

public class C12EX28 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String nome[] = new String[20];
        int ra[] = new int[20];

        int rep = 0;

        do {

            System.out.println("Digite o nome do aluno:");
            nome[rep] = teclado.nextLine();

            if (nome[rep].equalsIgnoreCase("X")) {
                break;
            }

            System.out.println("Digite o RA do aluno:");
            ra[rep] = teclado.nextInt();

            teclado.nextLine();

            rep++;

        } while (true);

        // Ordenação alfabética
        for (int i = 0; i < rep - 1; i++) {
            for (int j = i + 1; j < rep; j++) {

                if (nome[i].compareToIgnoreCase(nome[j]) > 0) {

                    String auxNome = nome[i];
                    nome[i] = nome[j];
                    nome[j] = auxNome;

                    int auxRA = ra[i];
                    ra[i] = ra[j];
                    ra[j] = auxRA;
                }
            }
        }

        System.out.println("Digite o nome que deseja pesquisar:");
        String pesquisa = teclado.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < rep; i++) {

            if (nome[i].equalsIgnoreCase(pesquisa)) {

                encontrado = true;

                System.out.println("Nome encontrado!");
                System.out.println("RA: " + ra[i]);
                System.out.println("Posicao na lista: " + (i + 1));

                break;
            }
        }

        if (!encontrado) {
            System.out.println("NOME NAO ENCONTRADO");
        }

        teclado.close();
    }
}