package ETAPA2;

import java.util.Scanner;

public class C11EX10 {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número (1-9): ");
        int n = teclado.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("DH ");
            }
            System.out.println();
        }

        teclado.close();
    }
}
