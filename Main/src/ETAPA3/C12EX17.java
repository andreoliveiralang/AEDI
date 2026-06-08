package ETAPA3;
import java.util.Scanner;

public class C12EX17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeros[] = new int[10];
        int contadorpar = 0;
        int somapar = 0;

        for (int rep = 0; rep < numeros.length; rep++) {
            System.out.print("Digite o " + (rep + 1) + "º número inteiro: ");
            numeros[rep] = teclado.nextInt();
        }

        System.out.print("Números pares: ");

        for (int rep = 0; rep < numeros.length; rep++) {
            if (numeros[rep] % 2 == 0) {
                contadorpar++;
                somapar += numeros[rep];
                System.out.print(numeros[rep] + " ");
            }
        }
        System.out.println("A Média de numeros pares é: " + (somapar / contadorpar));
        teclado.close();
    }
}
