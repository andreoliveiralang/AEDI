package ETAPA2;

import java.util.Scanner;

public class C11EX13 {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Número de termos: ");
        int n = teclado.nextInt();

        double soma = 0;
        int i = 1;
        while (i <= n) {
            double numerador = i * Math.pow(10 + (i - 1) * 9, 2 * i);
            double denominador = Math.pow(7, i - 1);
            soma += (numerador / denominador);
            i++;
        }

        double s = 71 + Math.cbrt(soma);
        System.out.println("Valor da Série = " + s);

        teclado.close();
    }
}
