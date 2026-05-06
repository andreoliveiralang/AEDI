import java.util.Scanner;

public class Alunos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome = "";
        int idade;

        int maiorIdade = -1;
        String nomeMaior = "";

        int soma = 0;
        int qtd = 0;

        do {
            System.out.print("Nome do aluno (FIM para encerrar): ");
            nome = teclado.nextLine();

            if (!nome.equals("FIM")) {

                do {
                    System.out.print("Idade: ");
                    idade = teclado.nextInt();
                } while (idade < 0 || idade > 120);

                teclado.nextLine();

                soma += idade;
                qtd++;

                if (idade > maiorIdade) {
                    maiorIdade = idade;
                    nomeMaior = nome;
                }
            }

        } while (!nome.equals("FIM"));

        double media = soma / qtd;

        System.out.println("Média das idades: " + media);
        System.out.println("Aluno mais velho: " + nomeMaior + " - " + maiorIdade);
    }
}