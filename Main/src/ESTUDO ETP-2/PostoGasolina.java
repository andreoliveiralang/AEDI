import java.util.Scanner;

public class PostoGasolina {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome = "";
        double preco;

        double soma = 0;
        int qtd = 0;

        double maior = -1;
        double menor = 999999;

        String nomeMaior = "";
        String nomeMenor = "";

        double primeiroPreco = 0;
        double ultimoPreco = 0;

        int i = 0;

        do {
            System.out.print("Nome do posto (FIM para encerrar): ");
            nome = teclado.nextLine();

            if (!nome.equals("FIM")) {

                // validação
                do {
                    System.out.print("Preço da gasolina: ");
                    preco = teclado.nextDouble();
                } while (preco < 0 || preco > 1000000);

                teclado.nextLine();

                i++;

                // primeiro
                if (i == 1) {
                    primeiroPreco = preco;
                }

                // último
                ultimoPreco = preco;

                // soma
                soma += preco;
                qtd++;

                // maior
                if (preco > maior) {
                    maior = preco;
                    nomeMaior = nome;
                }

                // menor
                if (preco < menor) {
                    menor = preco;
                    nomeMenor = nome;
                }
            }

        } while (!nome.equals("FIM"));

        double media = soma / qtd;

        System.out.println("Média: " + media);
        System.out.println("Mais caro: " + nomeMaior + " - " + maior);
        System.out.println("Mais barato: " + nomeMenor + " - " + menor);
        System.out.println("Primeiro preço: " + primeiroPreco);
        System.out.println("Último preço: " + ultimoPreco);
    }
}