package ETAPA3;
import java.util.Scanner;

public class C12EX18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numeros[] = new int[10];
        double numerosmultiplicados[] = new double[10];

        for (int rep = 0; rep < numeros.length; rep++) {
            System.out.println("Digite um numero inteiro: ");
            numeros[rep] = teclado.nextInt();
        }

        System.out.println("Digite um numero para multiplicar os 10 numeros informados anteriormente: ");
        double numeromultiplicador = teclado.nextDouble();

        System.out.print("Numeros impressos: ");

        for (int rep = 0; rep < numeros.length; rep++) {
            numerosmultiplicados[rep] = numeros[rep] * numeromultiplicador;
            System.out.print(numerosmultiplicados[rep] + " ");
        }
        teclado.close();

    }
}
