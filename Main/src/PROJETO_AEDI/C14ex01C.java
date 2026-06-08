import java.util.Scanner;

public class C14ex01C {

    public static void executar() {

        Scanner teclado = new Scanner(System.in);

        System.out.println();
        System.out.println("\nVOCÊ SELECIONOU O FORMATADOR DE NOME");

        System.out.print("Digite uma frase: ");
        String frase = teclado.nextLine();

        String[] palavras = frase.split(" ");

        String resultado = "";

        for (int i = 0; i < palavras.length; i++) {

            resultado += palavras[i].substring(0, 1).toUpperCase()
                    + palavras[i].substring(1).toLowerCase()
                    + " ";
        }

        System.out.println(resultado.trim());

    }
}
