import java.util.Scanner;

public class MathExemplo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double num = teclado.nextDouble();

        double quadrado = Math.pow(num, 2);
        double cubo = Math.pow(num, 3);
        double quinta = Math.pow(num, 5);
        double raizQuadrada = Math.sqrt(num);
        double raizQuinta = Math.pow(num, 1.0/5);

        System.out.println("Quadrado: " + quadrado);
        System.out.println("Cubo: " + cubo);
        System.out.println("Quinta potência: " + quinta);
        System.out.println("Raiz quadrada: " + raizQuadrada);
        System.out.println("Raiz quinta: " + raizQuinta);
    }
}