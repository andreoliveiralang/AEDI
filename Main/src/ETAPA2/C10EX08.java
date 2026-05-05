package ETAPA2;

import java.util.Locale;
import java.util.Scanner;

public class C10EX08 {
    public static void main(String[] args) {
        // Variáveis para os cálculos
        int totalCidades = 0;
        long populacaoTotalEstado = 0;
        long totalEleitoresEstado = 0;
        int cidadesMaisMulheres = 0;
        long totalHomensEstado = 0;
        
        int menorPopulacao = Integer.MAX_VALUE;
        String cidadeMenorPop = "";

        try {
            var stream = C10EX08.class.getResourceAsStream("C10EX08.txt");
            if (stream == null) return;

            Scanner leitor = new Scanner(stream).useLocale(Locale.US);

            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine().trim();
                if (linha.isEmpty()) continue;

                String[] dados = linha.split(";");
                String nome = dados[0];
                int pop = Integer.parseInt(dados[1]);
                int eleitores = Integer.parseInt(dados[2]);
                int homens = Integer.parseInt(dados[3]);
                int mulheres = Integer.parseInt(dados[4]);

                // a) Verificar divergência
                if ((homens + mulheres) != pop) {
                    System.out.println("Aviso: Dados de " + nome + " estão divergentes!");
                }

                // Acumuladores para os totais
                totalCidades++;
                populacaoTotalEstado += pop;
                totalEleitoresEstado += eleitores;
                totalHomensEstado += homens;

                // e) Cidades com mais mulheres
                if (mulheres > homens) {
                    cidadesMaisMulheres++;
                }

                // g) Menor população
                if (pop < menorPopulacao) {
                    menorPopulacao = pop;
                    cidadeMenorPop = nome;
                }

                // A flag é o nome da cidade. Se for Zimbabue, o loop para DEPOIS de processar ela.
                if (nome.equalsIgnoreCase("Zimbabue de Minas")) break;
            }
            leitor.close();

            // Cálculos Finais
            double percEleitores = (totalEleitoresEstado * 100.0) / populacaoTotalEstado;
            double mediaHomens = (double) totalHomensEstado / totalCidades;

            // Saídas (Conforme Screenshot 2026-05-05 185322.png)
            System.out.println("\n--- RELATÓRIO DO IBGE ---");
            System.out.println("b) Total de cidades: " + totalCidades);
            System.out.println("c) População total do estado: " + populacaoTotalEstado);
            System.out.printf("d) Percentual de eleitores: %.3f%%\n", percEleitores);
            System.out.println("e) Cidades com mais mulheres: " + cidadesMaisMulheres);
            System.out.printf("f) Média de homens por cidade: %.3f\n", mediaHomens);
            System.out.println("g) Cidade com menor população: " + cidadeMenorPop);

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

