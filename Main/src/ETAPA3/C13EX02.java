package ETAPA3;
import java.util.Scanner;

public class C13EX02 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        C13ex02B funcao = new C13ex02B();

        double x;

        do {
            System.out.print("Digite um valor para x (-1 para sair): ");
            x = teclado.nextDouble();

            if (x != -1) {
                System.out.printf("f(%.2f) = %.4f%n", x , funcao.calcularF(x));
            }

        } while (x != -1);

        teclado.close();
    }
}