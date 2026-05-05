package ETAPA2;

import java.util.Scanner;

public class C11EX12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número (1-9): ");
        int n = teclado.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j); // Sobe
            for (int j = i - 1; j >= 1; j--)
                System.out.print(j); // Desce
            System.out.println();
        }

        teclado.close();
    }
}
