
import java.util.Scanner;

public class C14ex01E {

    public static void executar() {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double n1 = teclado.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double n2 = teclado.nextDouble();

        double media = (n1 + n2) / 2;

        System.out.println("Média = " + media);

    }
}

