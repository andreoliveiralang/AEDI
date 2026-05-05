package ETAPA2;

import java.util.Scanner;

public class C11EX02 {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String menoraplicacao = "";
        int bronze = 0, prata = 0, ouro = 0;
        double totalaplicacao = 0, aplicacaobronze = 0;
        double menorValor = 0;

        for (int rep = 1; rep <= 538; rep++) {

            System.out.print("Nome: ");
            String nome = teclado.nextLine();

            System.out.print("Valor aplicado: ");
            double valoraplicado = teclado.nextDouble();

            teclado.nextLine();

            // lógica do menor valor
            if (rep == 1 || valoraplicado < menorValor) {
                menorValor = valoraplicado;
                menoraplicacao = nome;
            }

            if (valoraplicado <= 1000) {
                System.out.println("Nome: " + nome + " | Classificação = Bronze");
                bronze++;
                aplicacaobronze += valoraplicado;

            } else if (valoraplicado <= 5000) {
                System.out.println("Nome: " + nome + " | Classificação = Prata");
                prata++;

            } else {
                System.out.println("Nome: " + nome + " | Classificação = Ouro");
                ouro++;
            }

            totalaplicacao += valoraplicado;

            System.out.println("-----------------------");
        }

        System.out.println("Total de pessoas:");
        System.out.println("Bronze = " + bronze);
        System.out.println("Prata = " + prata);
        System.out.println("Ouro = " + ouro);

        System.out.println("Media aplicações clientes Bronze = " + (aplicacaobronze / bronze));

        System.out.printf("Total das aplicações: %.2f%n", totalaplicacao);
        System.out.println("Nome do aplicador de menor aplicação: " + menoraplicacao);

        teclado.close();

    }
}

