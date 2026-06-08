package ETAPA3;
import java.util.Scanner;
public class C13EXEXTRA02 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Entrada de dados
        System.out.print("Digite o valor do salário bruto: R$ ");
        double salarioBruto = scanner.nextDouble();

        System.out.print("Digite a quantidade de dependentes: ");
        int dependentes = scanner.nextInt();

        // 2. Chamada do método criado para o cálculo
        double imposto = calcularIRPF(salarioBruto, dependentes);

        // 3. Exibição do resultado
        if (imposto == 0) {
            System.out.println("Imposto = 0 (isento)");
        } else {
            System.out.printf("Imposto = R$ %.2f%n", imposto);
        }

        scanner.close();
    }

    /**
     * Método que calcula o IRPF com base no salário e dependentes.
     * @param salario Bruto recebido.
     * @param dependentes Quantidade de dependentes.
     * @return O valor do imposto calculado.
     */
    public static double calcularIRPF(double salario, int dependentes) {
        // Abatimento dos dependentes (R$ 150,00 por dependente)
        double salarioCalculo = salario - (dependentes * 150.0);
        
        // Aplicação da tabela de alíquotas baseada nas regras anteriores
        if (salarioCalculo <= 1000) {
            return 0.0; // Isento
        } else if (salarioCalculo <= 5000) {
            return salarioCalculo * 0.10; // 10%
        } else if (salarioCalculo <= 10000) {
            return salarioCalculo * 0.15; // 15%
        } else {
            return salarioCalculo * 0.20; // 20%
        }
    }
}

