package ETAPA2;

import java.util.Locale;
import java.util.Scanner;

public class C10EX06 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in).useLocale(Locale.US);

        // 1. Valores fixos da reta
        System.out.println("Valores da reta R (Ax + By + C):");
        System.out.print("A: "); double a = keyboard.nextDouble();
        System.out.print("B: "); double b = keyboard.nextDouble();
        System.out.print("C: "); double c = keyboard.nextDouble();

        // 2. Primeira leitura de ponto para entrar no loop
        System.out.println("\nDigite as coordenadas do ponto P (Xo, Yo):");
        System.out.print("Xo: "); double xo = keyboard.nextDouble();
        System.out.print("Yo: "); double yo = keyboard.nextDouble();

        // Cálculo da distância (Equação da imagem)
        double distancia = (a * xo + b * yo + c) / Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        // 3. O Loop: enquanto a distância NÃO for zero
        while (distancia != 0) {
            System.out.printf("Distância calculada: %.5f\n", distancia);

            // Pede o próximo ponto
            System.out.println("\nDigite novo ponto P (ou um que resulte em D=0 para sair):");
            System.out.print("Xo: "); xo = keyboard.nextDouble();
            System.out.print("Yo: "); yo = keyboard.nextDouble();

            // Recalcula a distância com o novo ponto
            distancia = (a * xo + b * yo + c) / Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        }

        // 4. Finalização
        System.out.println("\n--- PONTO COINCIDENTE ENCONTRADO ---");
        System.out.printf("Coordenadas: (%.2f, %.2f)\n", xo, yo);

        keyboard.close();
    }
}

