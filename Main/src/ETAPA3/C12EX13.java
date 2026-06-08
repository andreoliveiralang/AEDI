package ETAPA3;
import java.util.Scanner;

public class C12EX13 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String nomes[] = new String[10];

        // Ler os 10 nomes
        for (int rep = 0; rep < nomes.length; rep++) {
            System.out.print("Digite o nome da pessoa " + (rep + 1) + ": ");
            nomes[rep] = teclado.nextLine();
        }

        // Nome para pesquisar
        System.out.print("\nDigite o nome que deseja procurar: ");
        String pesquisa = teclado.nextLine();

        int posicao = 0;

        // Pesquisa na fila
        for (int rep = 0; rep < nomes.length; rep++) {

            if (pesquisa.equalsIgnoreCase(nomes[rep])) { //eu pesquiso em nomes, como nomes é um vetor, ele vai variar com o rep de 0 a 9(posições de um vetor) para tentar achar onde que esta a pessoa que eu escrevi, quando ele achar, ele vai armazenar a posição aducionando +1 no rep (pois rep = 0 inicialmente)
                posicao = rep + 1;
            }
        }

        // Resultado
        if (posicao != 0) {
            System.out.println("A pessoa está na posição " + posicao + " da fila.");
        } else {
            System.out.println("A pessoa não se encontra na fila.");
        }
        teclado.close();

    }
}