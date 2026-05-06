import java.util.Scanner;

public class Decomposicao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = teclado.nextInt();

        int soma = 0;

        while (num > 0) {
            int digito = num % 10;
            soma += digito;
            num = num / 10;
        }

        System.out.println("Soma dos dígitos: " + soma);
    }
}