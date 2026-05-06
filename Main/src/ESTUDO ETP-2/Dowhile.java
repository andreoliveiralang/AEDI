import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome = "";
        double valor;
        boolean flag = true;

        do {
            nome = teclado.nextLine();

            do {
                valor = teclado.nextDouble();
            } while (valor < 0 || valor > 1000000); // validação

            // processamento

            teclado.nextLine(); // limpar buffer

        } while (!nome.equals("FIM")); // flag real
    }
}
