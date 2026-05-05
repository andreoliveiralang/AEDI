package ETAPA2;

public class C11EX14 {
    public static void main(String[] args) {
        double somaPi = 0;
        double denominador = 1;
        int termos = 0;
        boolean operacaoSoma = true;

        while (true) {
            if (operacaoSoma) {
                somaPi += 1.0 / denominador;
            } else {
                somaPi -= 1.0 / denominador;
            }

            double piAtual = 4 * somaPi;
            termos++;

            if (piAtual >= 3.1416 && piAtual <= 3.1417) {
                System.out.println("Valor de PI = " + piAtual);
                System.out.println("Termos necessários = " + termos);
                break;
            }

            denominador += 2;
            operacaoSoma = !operacaoSoma;
        }
    }
}
