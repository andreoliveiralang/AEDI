package ETAPA3;
import java.util.Scanner;

public class C12EX19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int vetor1[] = new int[10];
        int vetor2_inverso[] = new int[10];

        for (int rep = 0; rep < vetor1.length; rep++) {
            System.out.print("Digite os 10 numeros do vetor: ");
            vetor1[rep] = teclado.nextInt();
        }

        for (int rep = 0; rep < vetor1.length; rep++) {
            vetor2_inverso[9 - rep] = vetor1[rep];
        }

        System.out.print("Vetor 2: ");

        for (int rep = 0; rep < vetor2_inverso.length; rep++) {
            System.out.print(vetor2_inverso[rep] + " ");
        }

        teclado.close();
    }
}
