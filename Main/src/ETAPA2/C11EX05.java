package ETAPA2;

import java.util.Scanner;

public class C11EX05 {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int valordamensalidade, alunosIngles = 0, alunosfrances = 0, alunosespanhol = 0, mediaMensalidade = 0;
        
        String nome;

        do {
            System.out.println("Digite o nome do aluno (ou FIM para sair): ");
            nome = teclado.nextLine();
            if (nome.equalsIgnoreCase("FIM")) {
                break;
            }
            System.out.println("Digite o codigo da lingua (1, 2 ou 3): ");
            int codigoLingua = teclado.nextInt();
            teclado.nextLine();

            if (codigoLingua == 1) {
                valordamensalidade = 100;
                System.out.println("Nome do aluno: " + nome);
                System.out.println("Valor da mensalidade: " + valordamensalidade);
                mediaMensalidade += valordamensalidade;

                alunosIngles++;
            } else if (codigoLingua == 2) {
                valordamensalidade = 150;
                System.out.println("Nome do aluno: " + nome);
                System.out.println("Valor da mensalidade: " + valordamensalidade);
                alunosfrances++;
                mediaMensalidade += valordamensalidade;

            } else if (codigoLingua == 3) {
                valordamensalidade = 120;
                System.out.println("Nome do aluno: " + nome);
                System.out.println("Valor da mensalidade: " + valordamensalidade);
                mediaMensalidade += valordamensalidade;
                alunosespanhol++;

            } else {
                System.out.println("Código de língua inválido. Tente novamente.");
                continue;
            }

        } while (nome.equalsIgnoreCase("FIM") == false);

        System.out.println("Quantidade de alunos matriculados na turma de ingles: " + alunosIngles);

        System.out.println(
                "Media da mensalidade: " + (mediaMensalidade / (alunosIngles + alunosfrances + alunosespanhol)));

        System.out.println("Valor da mensalidade ingles: " + alunosIngles * 100);
        System.out.println("Valor da mensalidade frances: " + alunosfrances * 150);
        System.out.println("Valor da mensalidade espanhol: " + alunosespanhol * 120);

        teclado.close();
    }
}
