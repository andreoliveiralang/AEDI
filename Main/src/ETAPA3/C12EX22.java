package ETAPA3;
import java.util.Scanner;

public class C12EX22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String placa[] = new String[100];
        String nome[] = new String[100];

        for (int rep = 0; rep < placa.length; rep++) {
            System.out.print("Informe a placa: ");
            placa[rep] = teclado.nextLine();

            System.out.print("Informe o nome: ");
            nome[rep] = teclado.nextLine();
        }

        System.out.print("Digite uma placa ou um nome para pesquisar: ");
        String pesquisa = teclado.nextLine();

        boolean encontrou = false;

        for (int rep = 0; rep < 100; rep++) {

            if (placa[rep].equalsIgnoreCase(pesquisa) ||
                nome[rep].equalsIgnoreCase(pesquisa)) {

                System.out.println("Vaga encontrada: " + (rep + 1));
                encontrou = true;
                break;
            }
        }

        if (!encontrou) {
            System.out.println("Placa ou nome não encontrado.");
        }

        teclado.close();
    }
}