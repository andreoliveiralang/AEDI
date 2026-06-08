import java.util.Scanner;

public class C12EX14 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int numeros[] = new int[10];

        for ( int rep=0; rep < numeros.length; rep++) {
            System.out.print("Digite o número do " + (rep + 1) + "º bilhete : ");
            numeros[rep] = teclado.nextInt();
            
        }

        // Nome para pesquisar
        System.out.print("\nDigite o numero que deseja procurar: ");
        int pesquisa = teclado.nextInt();

        int posicao = 0;

        // Pesquisa na fila
        for (int rep = 0; rep < numeros.length; rep++) {

            if (pesquisa == numeros[rep]) { 
                posicao = rep + 1;
            }
        }

        // Resultado
        if (posicao != 0) {
            System.out.println("O número do bilhete é: " + posicao);
        } else {
            System.out.println("O número não se encontra na fila.");
        }

        teclado.close();
    }
}
