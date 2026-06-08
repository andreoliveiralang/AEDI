package ETAPA3;
import java.util.Arrays;
import java.util.Scanner;

public class C12EX15 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String MESES[] = new String[12];

        for (int aux = 0; aux < MESES.length; aux++) {
            System.out.print("Informe o Mes:  ");
            // O .toUpperCase() transforma a string digitada em letras maiúsculas
            MESES[aux] = teclado.nextLine().toUpperCase();
            // MESES[aux] = teclado.nextLine();
        }

        Arrays.sort(MESES); // coloca em ordem decrescente (como é uma string, ele fica em ordem alfabética, se fosse int ele ficaria em ordem crescente do menor para o maior numero)

        for (int aux1 = 0; aux1 < MESES.length; aux1++) {
            System.out.println(MESES[aux1]);
        }

        teclado.close();
    }
}
