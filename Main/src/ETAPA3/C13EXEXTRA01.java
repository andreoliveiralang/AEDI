package ETAPA3;
import java.util.Scanner;
public class C13EXEXTRA01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Leitura dos dados do usuário
        System.out.print("Digite o valor do salário bruto: R$ ");
        double salarioBruto = scanner.nextDouble();

        System.out.print("Digite a quantidade de dependentes: ");
        int dependentes = scanner.nextInt();

        // 2. Abatimento dos dependentes (R$ 150,00 por dependente)
        double salarioCalculo = salarioBruto - (dependentes * 150.0);
        
        double imposto = 0.0;

        // 3. Aplicação da tabela de alíquotas
        if (salarioCalculo <= 1000) {
            imposto = 0.0; // Isento
        } else if (salarioCalculo <= 5000) {
            imposto = salarioCalculo * 0.10; // 10%
        } else if (salarioCalculo <= 10000) {
            imposto = salarioCalculo * 0.15; // 15%
        } else {
            imposto = salarioCalculo * 0.20; // 20%
        }

        // 4. Impressão do resultado
        if (imposto == 0) {
            System.out.println("Imposto = 0 (isento)");
        } else {
            System.out.printf("Imposto = R$ %.2f%n", imposto);
        }

        scanner.close();
    }
}

