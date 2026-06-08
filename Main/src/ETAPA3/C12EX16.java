package ETAPA3;
import java.util.Scanner;

public class C12EX16 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String[] nome = new String[100];
        String[] estado = new String[nome.length];
        int[] populacao = new int[nome.length];

        for (int i = 0; i < 100; i++) {
            System.out.print("Nome da cidade: ");
            nome[i] = teclado.nextLine();

            System.out.print("Estado: ");
            estado[i] = teclado.nextLine();

            System.out.print("População: ");
            populacao[i] = Integer.parseInt(teclado.nextLine());
        }

        // Ordenação decrescente
        for (int i = 0; i < 99; i++) {
            for (int j = i + 1; j < 100; j++) {

                if (populacao[j] > populacao[i]) {

                    int auxPop = populacao[i];
                    populacao[i] = populacao[j];
                    populacao[j] = auxPop;

                    String auxNome = nome[i];
                    nome[i] = nome[j];
                    nome[j] = auxNome;

                    String auxEstado = estado[i];
                    estado[i] = estado[j];
                    estado[j] = auxEstado;
                }
            }
        }

        System.out.println("\n10 maiores cidades:");

        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "º - " + nome[i] + " - " + estado[i]);
        }

        teclado.close();
    }
}