package ETAPA2;

import java.util.Scanner;

public class C11EX01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double fx, mediadefx = 0, quantidade = 0;

        System.out.print("Informe o número limite: ");
        int numero = teclado.nextInt();

        for (int rep = 1; rep <= numero; rep += 2) {
            fx = Math.pow(rep, 2) + ((4 * rep - 2) / 5.0);
            System.out.println("Para x = " + rep + ", f(x) = " + fx);

            mediadefx += fx;
            quantidade++;
        }

        double media = mediadefx / quantidade;
        System.out.println("\nMédia de f(x) = " + media);
        
        teclado.close();
    }
}

