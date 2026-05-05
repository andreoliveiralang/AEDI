package ETAPA2;

import java.util.Locale;
import java.util.Scanner;

public class C08EX15 {
    public static void main(String[] args) {
        double somaSalariosAte18 = 0;
        int contAte18 = 0;
        double maiorSalario = -1.0;
        String nomeMaiorSalario = "";
        String cargoMaiorSalario = "";

        try {
            var stream = C08EX15.class.getResourceAsStream("C08EX15.txt");
            if (stream == null) {
                System.out.println("Arquivo não encontrado!");
                return;
            }

            // Locale.GERMAN trata a vírgula como separador decimal (ex: 14850,60)
            Scanner leitor = new Scanner(stream).useLocale(Locale.GERMAN);

            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine().trim();
                if (linha.isEmpty()) continue;

                String[] dados = linha.split(";");
                String nome = dados[0];
                String cargo = dados[1];
                // Substitui vírgula por ponto para o Java converter corretamente
                double salario = Double.parseDouble(dados[2].replace(",", "."));
                int idade = Integer.parseInt(dados[3]);

                // a) Classificação SÊNIOR (Salário > 10k E idade > 50)
                if (salario > 10000 && idade > 50) {
                    System.out.println(nome + " - SÊNIOR [X]");
                } else {
                    System.out.println(nome + " - Junior/Pleno");
                }

                // b) Média salários com até 18 anos
                if (idade <= 18) {
                    somaSalariosAte18 += salario;
                    contAte18++;
                }

                // c) Maior salário
                if (salario > maiorSalario) {
                    maiorSalario = salario;
                    nomeMaiorSalario = nome;
                    cargoMaiorSalario = cargo;
                }
            }
            leitor.close();

            // Saídas Finais
            System.out.println("\n--- RESULTADOS ---");
            if (contAte18 > 0) {
                System.out.printf("Média salários (até 18 anos): R$%.2f\n", (somaSalariosAte18 / contAte18));
            }
            System.out.println("Maior salário: " + nomeMaiorSalario + " - " + cargoMaiorSalario);

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}