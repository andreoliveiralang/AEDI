package ETAPA3;
import java.util.Scanner;
public class C13EX01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura das coordenadas do Ponto 1
        System.out.print("Digite o x1 do Ponto 1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Digite o y1 do Ponto 1: ");
        double y1 = scanner.nextDouble();

        // Leitura das coordenadas do Ponto 2
        System.out.print("Digite o x2 do Ponto 2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Digite o y2 do Ponto 2: ");
        double y2 = scanner.nextDouble();

        // Chamada do método específico para calcular a distância
        double distancia = calcularDistancia(x1, y1, x2, y2);

        // Exibição do resultado formatado
        System.out.printf("%nA distância entre os pontos é: %.4f%n", distancia);

        scanner.close();
    }

    /**
     * Método específico que recebe as coordenadas de dois pontos
     * e retorna a distância cartesiana entre eles.
     */
    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        // Math.pow(base, expoente) calcula a potência
        // Math.sqrt(valor) calcula a raiz quadrada
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
}