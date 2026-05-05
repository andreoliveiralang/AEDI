package ETAPA2;

import java.util.Scanner;

public class C11EX07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int totaldedias = 5, contadorDiasMaiorTemp = 0;

        double mediatemperatura = 0;
        double menorTemp = 999999;
        double maiorTemp = -999999;

        for (int i = 1; i <= totaldedias; i++) {

            System.out.print("Digite a temperatura: ");
            double temperaturaatual = teclado.nextDouble();

            // menor temperatura
            if (temperaturaatual < menorTemp) {
                menorTemp = temperaturaatual;
            }

            // maior temperatura
            if (temperaturaatual > maiorTemp) {
                maiorTemp = temperaturaatual;
                contadorDiasMaiorTemp = 1;
                // Reinicia a contagem se encontrar uma nova máxima
            } else if (temperaturaatual == maiorTemp) {
                contadorDiasMaiorTemp++;
                // Incrementa se a temperatura repetir a máxima
            }

            mediatemperatura += temperaturaatual;

        }

        double media = mediatemperatura / totaldedias;

        System.out.println("Menor temperatura registrada: " + menorTemp);
        System.out.println("Maior temperatura registrada: " + maiorTemp);
        System.out.println("Média das temperaturas: " + media);

        System.out.println("Quantidade de dias com a temperatura máxima: " + contadorDiasMaiorTemp);

        teclado.close();
    }
}
