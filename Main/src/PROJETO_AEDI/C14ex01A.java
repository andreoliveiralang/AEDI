import java.util.Scanner;

public class C14ex01A {

    public static void executar() {

        Scanner teclado = new Scanner(System.in);

        System.out.println();
        System.out.println("\nVOCÊ SELECIONOU O ULTIMO SOBRENOE DE UM NOME COMPLETO");

        System.out.print("Digite o nome completo: ");
        String nomeCompleto = teclado.nextLine();

        String[] partes = nomeCompleto.trim().split(" ");

        String sobrenome = partes[partes.length - 1];

        System.out.println("Nome de família: " + sobrenome);
    }
}