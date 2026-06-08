package ETAPA3;
import java.util.Scanner;

public class C13EX06 {
 
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int totalPessoas = 100;
        int contadorFamilia = 0;

        // Solicita o nome da família
        System.out.print("Digite o nome da família (ex: Silva): ");
        String familia = teclado.nextLine();

        System.out.println("\nDigite os " + totalPessoas + " nomes completos:");

        // Loop para ler as 100 pessoas
        for (int rep = 1; rep <= totalPessoas; rep++) {
            System.out.printf("Pessoa %d: ", rep);
            String nomeCompleto = teclado.nextLine();

            // Chama o método pertenceAFamilia
            // Se retornar true, incrementa o contador
            if (pertenceAFamilia(nomeCompleto, familia)) {
                contadorFamilia++;
            }
        }

        // Imprime o resultado final
        System.out.println("\n--- Resultado Final ---");
        System.out.printf("Quantidade de pessoas que pertencem à família %s: %d%n", familia, contadorFamilia);

        teclado.close();
    }

    public static boolean pertenceAFamilia(String nomeCompleto, String familia) {
        return nomeCompleto.trim().toLowerCase().endsWith(familia.trim().toLowerCase());
    }
}