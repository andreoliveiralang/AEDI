package ETAPA3;
import java.util.Scanner;

public class C12EX24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome[] = new String[20];
        int pontuacao[] = new int[20];

        for (int rep = 0; rep < nome.length; rep++) {
            System.out.print("Informe o nome da equipe: ");
            nome[rep] = teclado.nextLine();

            System.out.print("Informe a pontuação: ");
            pontuacao[rep] = teclado.nextInt();
            teclado.nextLine(); 
        }

        // Ordenação decrescente pela pontuação
        for (int i = 0; i < pontuacao.length - 1; i++) {
            for (int j = i + 1; j < pontuacao.length; j++) {

                if (pontuacao[j] > pontuacao[i]) {

                    int auxPontos = pontuacao[i];
                    pontuacao[i] = pontuacao[j];
                    pontuacao[j] = auxPontos;

                    String auxNome = nome[i];
                    nome[i] = nome[j];
                    nome[j] = auxNome;
                }
            }
        }

        // Pesquisa da equipe
        System.out.print("\nDigite o nome da equipe que deseja pesquisar: ");
        String pesquisa = teclado.nextLine();

        boolean encontrou = false;

        for (int i = 0; i < nome.length; i++) {

            if (nome[i].equalsIgnoreCase(pesquisa)) {

                int posicao = i + 1;

                System.out.println("\nEquipe: " + nome[i]);
                System.out.println("Posição: " + posicao);

                if (posicao >= 1 && posicao <= 4) {
                    System.out.println("Situação: Copa Libertadores");
                } else if (posicao >= 5 && posicao <= 12) {
                    System.out.println("Situação: Copa Sul-Americana");
                } else if (posicao >= 17 && posicao <= 20) {
                    System.out.println("Situação: Rebaixada");
                } else {
                    System.out.println("Situação: Sem classificação especial");
                }

                encontrou = true;
                break;
            }
        }

        if (!encontrou) {
            System.out.println("Equipe não encontrada.");
        }

        teclado.close();
    }
}