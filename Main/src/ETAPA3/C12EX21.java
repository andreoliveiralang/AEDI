package ETAPA3;
import java.util.Scanner;

public class C12EX21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numeros[] = new int[20];

        for (int rep = 0; rep < numeros.length; rep++) {
            System.out.println("Informe 20 numeros inteiros: ");
            numeros[rep] = teclado.nextInt();
        }
        for (int rep = 0; rep < numeros.length; rep += 2) {
            System.out.print(numeros[rep] + " ");
        }

        for (int rep = 1; rep < numeros.length; rep += 2) {
            System.out.print(numeros[rep] + " ");
        }
        
        teclado.close();
    }
}
