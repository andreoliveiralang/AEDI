package ETAPA2;

import java.util.Scanner;

public class C11EX06 {
     public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Variáveis para acumular a audiência de cada canal
        int aud4 = 0, aud5 = 0, aud7 = 0, aud12 = 0;
        int totalGeralPessoas = 0;
        int casasValidas = 78;

        System.out.println("--- Início da Pesquisa de Audiência ---");

        for (int i = 1; i <= casasValidas; i++) {
            System.out.println("Casa nº " + i);
            
            System.out.print("Digite o número do canal (4, 5, 7, 12): ");
            int canal = teclado.nextInt();
            
            System.out.print("Digite o número de pessoas assistindo: ");
            int pessoas = teclado.nextInt();

            // Soma ao total geral para o cálculo da média posterior
            totalGeralPessoas += pessoas;

            // Atribui a audiência ao canal correspondente
            switch (canal) {
                case 4: aud4 += pessoas; break;
                case 5: aud5 += pessoas; break;
                case 7: aud7 += pessoas; break;
                case 12: aud12 += pessoas; break;
                default:
                    System.out.println("Canal fora da pesquisa. (Dados somados apenas ao total)");
            }
        }

        // Cálculos
        double totalAudienciaCanais = aud4 + aud5 + aud7 + aud12;
        double mediaPessoasPorCasa = (double) totalGeralPessoas / casasValidas;

        // Determinar o canal mais assistido
        int maiorAudiencia = aud4;
        int canalMaisAssistido = 4;

        if (aud5 > maiorAudiencia) { maiorAudiencia = aud5; canalMaisAssistido = 5; }
        if (aud7 > maiorAudiencia) { maiorAudiencia = aud7; canalMaisAssistido = 7; }
        if (aud12 > maiorAudiencia) { maiorAudiencia = aud12; canalMaisAssistido = 12; }

        // Exibição dos Resultados
        System.out.println("\n--- RESULTADOS DA PESQUISA ---");
        
        // a) Audiência total
        System.out.println("Audiência Total:");
        System.out.println("Canal 4: " + aud4);
        System.out.println("Canal 5: " + aud5);
        System.out.println("Canal 7: " + aud7);
        System.out.println("Canal 12: " + aud12);

        // b) Porcentagem
        System.out.println("\nPorcentagem de Audiência:");
        System.out.printf("Canal 4: %.2f%%\n", (aud4 / totalAudienciaCanais) * 100);
        System.out.printf("Canal 5: %.2f%%\n", (aud5 / totalAudienciaCanais) * 100);
        System.out.printf("Canal 7: %.2f%%\n", (aud7 / totalAudienciaCanais) * 100);
        System.out.printf("Canal 12: %.2f%%\n", (aud12 / totalAudienciaCanais) * 100);

        // c) Canal mais assistido
        System.out.println("\nCanal mais assistido: Canal " + canalMaisAssistido);

        // d) Média de pessoas
        System.out.printf("Média de pessoas por casa: %.2f\n", mediaPessoasPorCasa);

        teclado.close();
    }
}
}
