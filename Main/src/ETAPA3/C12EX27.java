package ETAPA3;
import java.util.Scanner;

public class C12EX27 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String endereco[] = new String[20];
        double cpf[] = new double[20];

        int rep = 0;

        do {
            System.out.println("Digite o endereco:");
            endereco[rep] = teclado.nextLine();

            System.out.println("Digite o CPF:");
            cpf[rep] = teclado.nextDouble();

            teclado.nextLine();

            if (cpf[rep] == 0) {
                break;
            }

            rep++;

        } while (true);

        System.out.println("Digite o CPF para pesquisar:");
        double cpfPesquisa = teclado.nextDouble();

        boolean encontrado = false;

        for (int aux = 0; aux < rep; aux++) {

            if (cpf[aux] == cpfPesquisa) {

                encontrado = true;

                System.out.println("CPF encontrado.");
                System.out.println("Alterar endereco ou excluir? (A/E)");
                String resposta = teclado.next();

                if (resposta.equalsIgnoreCase("A")) {

                    teclado.nextLine();

                    System.out.println("Novo endereco:");
                    endereco[aux] = teclado.nextLine();

                } else if (resposta.equalsIgnoreCase("E")) {

                    for (int i = aux; i < rep - 1; i++) {
                        cpf[i] = cpf[i + 1];
                        endereco[i] = endereco[i + 1];
                    }

                    rep--;

                    System.out.println("Cadastro excluido.");
                }

                break;
            }
        }

        if (!encontrado) {

            System.out.println("CPF nao encontrado.");
            System.out.println("Deseja incluir? (S/N)");

            String resposta = teclado.next();

            if (resposta.equalsIgnoreCase("S")) {

                teclado.nextLine();

                System.out.println("Digite o endereco:");
                endereco[rep] = teclado.nextLine();

                System.out.println("Digite o CPF:");
                cpf[rep] = teclado.nextDouble();

                rep++;

                System.out.println("Cadastro incluido.");
            }
        }

        System.out.println("\nLISTA FINAL");

        for (int i = 0; i < rep; i++) {
            System.out.println("CPF: " + cpf[i]
                    + " - Endereco: " + endereco[i]);
        }

        teclado.close();
    }
}