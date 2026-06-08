package ETAPA3;
import java.util.Scanner;
public class C13EX08 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome completo do autor: ");
        String nome = teclado.nextLine().trim();

        // Divide o nome em partes
        String[] partes = nome.split(" ");

        // Último sobrenome em maiúsculo
        String sobrenome = partes[partes.length - 1].toUpperCase();

        // Monta as iniciais
        String iniciais = "";

        for (int i = 0; i < partes.length - 1; i++) {
            iniciais += partes[i].toUpperCase().charAt(0) + ". ";
        }

        // Resultado final
        System.out.println(sobrenome + ", " + iniciais);

        teclado.close();
    }
}