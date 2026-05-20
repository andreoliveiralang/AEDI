package ETAPA3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C12EX26 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        List<String> listaNomes = new ArrayList<>();
        List<Double> listaSalarios = new ArrayList<>(); // Double para salário
        
        // a) Preencher as duas listas de forma sincronizada
        while (true) {
            System.out.print("Digite um nome (X para encerrar): ");
            String nome = keyboard.nextLine();
            
            if (nome.equalsIgnoreCase("X")) {
                break; // Encerra imediatamente sem pedir salário
            }
            
            System.out.print("Digite o salário: ");
            double salario = keyboard.nextDouble();
            keyboard.nextLine(); // Limpa o buffer
            
            listaNomes.add(nome);
            listaSalarios.add(salario);
        }

        // b) Pedir um índice de reajuste salarial (ex: 0.10 para 10%)
        System.out.print("\nInforme o índice de reajuste salarial (ex: 0,10 para 10%): ");
        double indice = keyboard.nextDouble();

        // c) Reajustar os salários menores que R$1000
        for (int i = 0; i < listaSalarios.size(); i++) {
            double salarioAtual = listaSalarios.get(i);
            if (salarioAtual < 1000.0) {
                double novoSalario = salarioAtual * (1 + indice);
                listaSalarios.set(i, novoSalario);
            }
        }

        // d) Imprimir as duas listas de forma sincronizada
        System.out.println("\n--- Lista de Funcionários Atualizada ---");
        for (int i = 0; i < listaNomes.size(); i++) {
            System.out.printf("Nome: %s - Salário: R$ %.2f%n", listaNomes.get(i), listaSalarios.get(i));
        }

        keyboard.close();
    }
}

