package ETAPA3;
import java.util.Scanner;

public class C12EX20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numeros[] = new int[10];
        int contadornumeros =0;
        double numerossoma =0;

        for (int rep = 0; rep < numeros.length; rep++) {
            System.out.print("Digite o " + (rep + 1) + "º número inteiro: ");
            numeros[rep] = teclado.nextInt();
        }

        System.out.print("Numeros maiores que o ultimo numero informado: ");
        
        for (int rep = 0; rep < numeros.length; rep++) {
            if (numeros[rep] > numeros[9]) {
                System.out.print(numeros[rep] + " ");
                contadornumeros++;   
                numerossoma +=numeros[rep];            
            }
        }
        System.out.println("Media numeros impressos: " + (numerossoma/contadornumeros));

        teclado.close();
    }
}
