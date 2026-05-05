package ETAPA2;

import java.util.Locale;
import java.util.Scanner;

public class C10EX07 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite a população total da região: ");
        double populacaoTotal = keyboard.nextDouble();

        double infectados = 1.0; // Começa com uma pessoa
        int diasDecorridos = 0;

        // O loop roda enquanto houver gente saudável
        while (infectados < populacaoTotal) {
            infectados += infectados * 0.003; // Aumenta 0,3%
            diasDecorridos++;
        }

        // Conversão de tempo conforme o enunciado
        int anos = diasDecorridos / 365;
        int meses = (diasDecorridos % 365) / 30;
        int dias = (diasDecorridos % 365) % 30;

        System.out.println("\n--- RESULTADO DA SIMULAÇÃO ---");
        System.out.println("Total de dias: " + diasDecorridos);
        System.out.printf("Tempo: %d Anos, %d Meses e %d Dias\n", anos, meses, dias);

        keyboard.close();
    }
}
