package ETAPA3;
import java.util.Scanner;

public class C12EX09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int vetor[] = new int[10];
        int soma = 0;

        for (int aux2 = 0; aux2 < vetor.length; aux2++) {
            System.out.print("Informe um número inteiro: ");
            vetor[aux2] = teclado.nextInt();
        }

        for (int aux = 0; aux < vetor.length; aux++) {
            soma += vetor[aux];
        }

        System.out.print("Divisores da soma: ");
        
        for (int aux1 = 0; aux1 < vetor.length; aux1++) {

            if (soma % vetor[aux1] == 0) {
                System.out.print(vetor[aux1] + " ");
            }
        }

        teclado.close();
    }
}
