package ETAPA3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
public class C13EXEXTRA03 {

    // Classe auxiliar interna para manter os dados de nome e imposto interligados
    static class Funcionario {
        String nome;
        double imposto;

        // O construtor deve ter o mesmo nome da classe interna (Funcionario)
        Funcionario(String nome, double imposto) {
            this.nome = nome;
            this.imposto = imposto;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Funcionario> listaFuncionarios = new ArrayList<>();

        System.out.println("--- Cadastro de Funcionários (Digite 'fim' para encerrar) ---");

        while (true) {
            System.out.print("\nNome do funcionário: ");
            String nome = scanner.nextLine();
            
            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Salário bruto: R$ ");
            double salario = scanner.nextDouble();

            System.out.print("Quantidade de dependentes: ");
            int dependentes = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do teclado DEPOIS de ler o número

            // Reutilizando o método público de cálculo do exercício anterior
            double impostoCalculado = calcularIRPF(salario, dependentes);

            // Guardando nas listas de dados agrupadas
            listaFuncionarios.add(new Funcionario(nome, impostoCalculado));
        }

        // Ordenando a lista em ordem alfabética (A-Z) pelo nome
        Collections.sort(listaFuncionarios, new Comparator<Funcionario>() {
            @Override
            public int compare(Funcionario f1, Funcionario f2) {
                return f1.nome.compareToIgnoreCase(f2.nome);
            }
        });

        // Impressão final das listas ordenadas
        System.out.println("\n--- Lista de Funcionários em Ordem Alfabética ---");
        for (Funcionario f : listaFuncionarios) {
            if (f.imposto == 0) {
                System.out.printf("Nome: %s | Imposto: Isento%n", f.nome);
            } else {
                System.out.printf("Nome: %s | Imposto: R$ %.2f%n", f.nome, f.imposto);
            }
        }

        scanner.close();
    }

    // ADICIONADO: O método de cálculo que estava faltando no seu código anterior!
    public static double calcularIRPF(double salario, int dependentes) {
        double salarioCalculo = salario - (dependentes * 150.0);
        
        if (salarioCalculo <= 1000) {
            return 0.0;
        } else if (salarioCalculo <= 5000) {
            return salarioCalculo * 0.10;
        } else if (salarioCalculo <= 10000) {
            return salarioCalculo * 0.15;
        } else {
            return salarioCalculo * 0.20;
        }
    }
}