package ETAPA3;
import java.util.Scanner;

public class C12EX26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String funcionario[] = new String[20];
        double salario[] = new double[20];

        int rep = 0;

        do {
            System.out.println("Digite o nome do " + (rep + 1) + "º funcionario: ");
            funcionario[rep] = teclado.nextLine();

            if (funcionario[rep].equalsIgnoreCase("X")) {
                break;
            }

            System.out.println("Digite o salario do " + (rep + 1) + "º funcionario: ");
            salario[rep] = teclado.nextDouble();

            teclado.nextLine();

            rep++;

        } while (true);

        System.out.println("Digite o indice de reajuste salarial (%): ");
        double reajuste = teclado.nextDouble();

        for (int aux = 0; aux < rep; aux++) {
            if (salario[aux] < 1000) {
                salario[aux] += salario[aux] * reajuste / 100;
            }
        }

        System.out.println("\nFuncionarios e salarios atualizados:");

        for (int aux = 0; aux < rep; aux++) {
            System.out.println("Funcionario: " + funcionario[aux]
                    + " - Salario: R$ " + salario[aux]);
        }

        teclado.close();
    }
}