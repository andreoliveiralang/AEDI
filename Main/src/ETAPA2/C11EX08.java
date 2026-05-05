package ETAPA2;

import java.util.Scanner;

public class C11EX08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double somahoras = 0, totalfolhapagamento = 0, maiorsalario = 0;
        
        int faixa1 = 0, faixa2 = 0, faixa3 = 0, totaltrabalhador = 0;

        String nomemaiorsalario = "", funcaomaiorsalario = "";

        System.out.print("Informe o valor da hora trabalhada: ");
        double valordahora = teclado.nextDouble();
        teclado.nextLine();

        while (true) {
            System.out.print("Qual o Nome do trabalhador (digite 'fim' para encerrar): ");
            String nome = teclado.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Função: ");
            String funcao = teclado.nextLine();

            System.out.print("Quantidade de horas trabalhadas: ");
            double horas = teclado.nextDouble();
            teclado.nextLine();

            double premio;

            if (horas <= 100) {
                premio = 1000.00;
                faixa1++;
            } else if (horas <= 500) {
                premio = horas * 10.00;
                faixa2++;
            } else {
                premio = (Math.floor(horas / 10)) * 100.00;
                faixa3++;
            }

            double salariototal = (horas * valordahora) + premio;

            System.out.printf("O trabalhador %s vai receber: R$ %.2f\n", nome, salariototal);

            totalfolhapagamento += salariototal;
            somahoras += horas;
            totaltrabalhador++;

            if (salariototal > maiorsalario) {
                maiorsalario = salariototal;
                nomemaiorsalario = nome;
                funcaomaiorsalario = funcao;
            }
        }

        System.out.println();

        if (totaltrabalhador > 0) {

            double mediahoras = somahoras / totaltrabalhador;
            System.out.printf("Média de horas trabalhadas por pessoa: %.2f horas\n", mediahoras);

            System.out.println("Maior salário: " + nomemaiorsalario + " Função: " + funcaomaiorsalario);

            System.out.println("Quantidade de pessoas por faixa de prêmio:");
            System.out.println("Até 100h: " + faixa1);
            System.out.println("Entre 100h e 500h: " + faixa2);
            System.out.println("Acima de 500h: " + faixa3);

            System.out.printf("Valor total da folha de pagamento: R$ %.2f\n", totalfolhapagamento);
        }

        teclado.close();
    }
}
