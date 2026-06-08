package ETAPA3;
import java.util.Scanner;

public class C12EX23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int pos = 0;

        int vetor1[] = new int[10];
        int vetor2[] = new int[10];

        for (int rep = 0; rep < vetor1.length; rep++) {
            System.out.print("Informe um numero inteiro: ");
            vetor1[rep] = teclado.nextInt();
        }

        for (int rep = 0; rep < vetor1.length; rep++) {
            if (vetor1[rep] % 3 == 0) {
                vetor2[pos] = vetor1[rep];
                pos++;
            }
        }

        System.out.println("Vetor 2: ");
        for (int rep = 0; rep < vetor1.length; rep++) {
            System.out.println(vetor2[rep] + " ");
        }
        
        teclado.close();
    }
}
