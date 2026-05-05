package ETAPA2;

import java.util.Scanner;

public class C10EX05 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String sexo = ""; // evita erro
        double peso, altura, somaAltura = 0;
        int totalMulheres = 0, totalHomens = 0, mulheresMenor60 = 0;
        double mediaAltura = 0;
        int totalPessoas = 0;

        do {
            System.out.println("Digite a sua altura em Metros: (0 para sair) ");
            altura = keyboard.nextDouble();

            if (altura != 0) {

                System.out.println("Peso: ");
                peso = keyboard.nextDouble();

                keyboard.nextLine();

                System.out.println("Sexo (M ou F): ");
                sexo = keyboard.nextLine();

                totalPessoas++;

                if (sexo.equalsIgnoreCase("F")) {
                    totalMulheres++;

                    if (peso < 60) { // agora correto
                        mulheresMenor60++;
                    }
                }

                if (sexo.equalsIgnoreCase("M")) {
                    totalHomens++;
                    somaAltura += altura;
                }
            }

        } while (altura != 0);

        if (totalHomens > 0) {
            mediaAltura = somaAltura / totalHomens;
        }

        System.out.println("Quantidades de pessoas pesquisadas = " + totalPessoas);
        System.out.println("Quantidade de Mulheres = " + totalMulheres);
        System.out.println("Altura média dos homens = " + mediaAltura);
        System.out.println("Mulheres com peso < 60 = " + mulheresMenor60);

        keyboard.close();
    }
}