import java.util.Scanner;

public class C14ex01D {

    public static void executar() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("VOCÊ SELECIONOU PARA VERIFICAR SE O NUMERO É PAR");

        System.out.print("Digite um número: ");
        int numero = teclado.nextInt();

        if (numero % 2 == 0) {

            System.out.println("Número PAR");

        } else {

            System.out.println("Número ÍMPAR");
        }

    }
}
