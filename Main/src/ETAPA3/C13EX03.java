package ETAPA3;
import java.util.Scanner;
public class C13EX03 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = teclado.nextInt();

        System.out.print("Digite a posição (de trás para frente): ");
        int posicao = teclado.nextInt();

        int digito = obterDigito(numero, posicao);

        System.out.println("Dígito encontrado: " + digito);

        teclado.close();
    }

    public static int obterDigito(int numero, int posicao) {

        for (int rep = 1; rep < posicao; rep++) {
            numero = numero / 10;
        }
        return numero % 10;
    }
}