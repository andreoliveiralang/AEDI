package ETAPA2;

import java.util.Scanner;

public class C08EX31 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
       
        String nome, cargo;
        double salarioB = 0, mediaSalario = 0;
        int acimasalario = 0, outrosAcima = 0;
        
        
        double somaSalarioAdm = 0;
        int contAdm = 0;
        double menorSalario = 999999999; // Valor alto para começar
        String nomeMenor = "", cargoMenor = "";

        
        System.out.println("Quantidade de engenheiros: ");
        int n = keyboard.nextInt();
        keyboard.nextLine(); 

        for (int aux = 1; aux <= n; aux++) { 
            System.out.println("Insira seu nome: ");
            nome = keyboard.nextLine();

            System.out.println("Insira seu salário bruto: ");
            salarioB = keyboard.nextDouble();
            keyboard.nextLine(); // Limpa o buffer

            System.out.println("Insira seu código (C, P, O, A ou X): ");
            cargo = keyboard.nextLine();

            // Correção dos valores: 2500 em vez de 2.500
            if (cargo.equalsIgnoreCase("c") && salarioB < 2500) System.out.println("ABAIXO DO SALÁRIO MÍNIMO");
            else if (cargo.equalsIgnoreCase("p") && salarioB < 4650) System.out.println("ABAIXO DO SALÁRIO MÍNIMO");
            else if (cargo.equalsIgnoreCase("o") && salarioB < 3200) System.out.println("ABAIXO DO SALÁRIO MÍNIMO");
            else if (cargo.equalsIgnoreCase("a") && salarioB < 5100) System.out.println("ABAIXO DO SALÁRIO MÍNIMO");

            // b) Contagem de salários iguais ou acima do mínimo
            if (cargo.equalsIgnoreCase("c") && salarioB >= 2500) acimasalario++;
            else if (cargo.equalsIgnoreCase("p") && salarioB >= 4650) acimasalario++;
            else if (cargo.equalsIgnoreCase("o") && salarioB >= 3200) acimasalario++;
            else if (cargo.equalsIgnoreCase("a") && salarioB >= 5100) acimasalario++;

            // c) Acumular dados para média de Administradores
            if (cargo.equalsIgnoreCase("a")) {
                somaSalarioAdm += salarioB;
                contAdm++;
            }

            // d) Outros acima de 5000
            if (cargo.equalsIgnoreCase("x") && salarioB > 5000) {
                outrosAcima++;
            }

            // e) Lógica para achar o menor salário
            if (salarioB < menorSalario) {
                menorSalario = salarioB;
                nomeMenor = nome;
                // Converte código para descrição para o output final
                if(cargo.equalsIgnoreCase("c")) cargoMenor = "Engenheiro Calculista";
                else if(cargo.equalsIgnoreCase("p")) cargoMenor = "Engenheiro Projetista";
                else if(cargo.equalsIgnoreCase("o")) cargoMenor = "Engenheiro de Obra";
                else if(cargo.equalsIgnoreCase("a")) cargoMenor = "Engenheiro Administrador";
                else cargoMenor = "Outros";
            }
        }

        if (contAdm > 0) {
            mediaSalario = somaSalarioAdm / contAdm;
            System.out.println("Média dos salários dos Administradores = " + mediaSalario);
        }

        System.out.println("A quantidade de sálarios acima do minimo = " + acimasalario);
        System.out.println("Quantidade de 'Outros' acima de R$5000 = " + outrosAcima);
        System.out.println("Menor salário = " + nomeMenor + ", " + cargoMenor + ", R$" + menorSalario);
    }
}
