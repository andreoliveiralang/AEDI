package ETAPA2;

import java.util.Locale;
import java.util.Scanner;

public class C08EX13 {
    public static void main(String[] args) {
        int totalAcima1M = 0;
        int totalMaisMulheres = 0;
        int menorPop = Integer.MAX_VALUE;
        String cidadeMenorPop = "";

        try {
            // Tenta carregar o arquivo que está dentro do pacote ETAPA2
            var stream = C08EX13.class.getResourceAsStream("C08EX13.txt");

            if (stream == null) {
                System.out.println("ERRO: O arquivo C08EX13.txt não foi encontrado na pasta ETAPA2!");
                return;
            }

            Scanner leitor = new Scanner(stream).useLocale(Locale.US);

            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine().trim();
                if (linha.isEmpty()) continue;

                // Split por ponto e vírgula conforme discutido
                String[] dados = linha.split(";");
                
                if (dados.length < 5) continue;

                String nome = dados[0];
                // Remove pontos extras caso existam no TXT para não quebrar o parseInt
                int pop = Integer.parseInt(dados[1].replaceAll("\\.", ""));
                int eleitores = Integer.parseInt(dados[2].replaceAll("\\.", ""));
                int homens = Integer.parseInt(dados[3].replaceAll("\\.", ""));
                int mulheres = Integer.parseInt(dados[4].replaceAll("\\.", ""));

                // a) Mensagem se a soma de H+M diferir da população
                if ((homens + mulheres) != pop) {
                    System.out.println("X -> " + nome + ": Soma de homens e mulheres difere da população.");
                }

                // b) Percentual de eleitores
                double perc = (eleitores * 100.0) / pop;
                System.out.printf("%s: %.2f%% de eleitores\n", nome, perc);

                // c) Quantidade de cidades com pop > 1 milhão
                if (pop > 1000000) {
                    totalAcima1M++;
                }

                // d) Cidades com mais mulheres que homens
                if (mulheres > homens) {
                    totalMaisMulheres++;
                }

                // e) Nome da cidade de menor população
                if (pop < menorPop) {
                    menorPop = pop;
                    cidadeMenorPop = nome;
                }
            }
            leitor.close();

            // Saídas Finais (Rodapé da Screenshot 2026-05-05 161637.png)
            System.out.println("\n--- RESULTADOS FINAIS ---");
            System.out.println("Total de cidades com mais de 1 milhão: " + totalAcima1M);
            System.out.println("Cidades com mais mulheres que homens: " + totalMaisMulheres);
            System.out.println("Cidade com menor população: " + cidadeMenorPop);

        } catch (Exception e) {
            System.out.println("Erro crítico ao processar: " + e.getMessage());
        }
    }
}