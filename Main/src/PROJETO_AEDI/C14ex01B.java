import java.util.Scanner;

public class C14ex01B {
    public static void executar() {

        Scanner teclado = new Scanner(System.in);

        System.out.println();
        System.out.println("\nVOCÊ SELECIONOU CORRETOR DE NOME PARA ABNT");
        
        System.out.print("Digite o nome do autor: ");
        String nome = teclado.nextLine().trim();

        String[] partes = nome.split(" ");

        String sobrenome = partes[partes.length - 1].toUpperCase();

        String iniciais = "";

        for (int i = 0; i < partes.length - 1; i++) {

            iniciais += partes[i].toUpperCase().charAt(0) + ". ";
        }

        System.out.println(sobrenome + ", " + iniciais);
    }
}
