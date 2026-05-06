import java.util.Scanner;

public class serie {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        int x = teclado.nextInt();

        double soma = 0;

        for (int i = 1; i <= x; i++) {
            soma += (double) i / (i + 1);
        }

        System.out.println("Resultado do somatório: " + soma);
    }
}