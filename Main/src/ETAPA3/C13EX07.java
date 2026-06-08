package ETAPA3;
import java.util.Scanner;
public class C13EX07 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome completo: ");
        String nomeCompleto = teclado.nextLine();

        // Remove espaços extras e divide o nome
        String[] partes = nomeCompleto.trim().split(" ");

        // Pega o último sobrenome
        String sobrenome = partes[partes.length - 1]; //esse partes.length - 1 pega o último elemento do array, que é o sobrenome, se eu quiser pegar o primeiro nome, seria partes[0], o segundo seria partes[1], e assim por diante

        System.out.println("Nome de família: " + sobrenome);

        teclado.close();
    }
}