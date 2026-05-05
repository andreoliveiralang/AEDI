package ETAPA2;

import java.util.Scanner;

public class C11EX04b {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String maisvelhanome = "", nome;

        double idadetotal = 0, quantidadePessoas = 0, valortotaldasmultas = 0, homensmultados = 0, mulheres7pontos = 0, maioridade = 0, rep = 0;

        do {
            System.out.print("Digite o nome (ou X para sair): ");
            nome = teclado.nextLine();

            // O break deve ocorrer se o nome FOR "X"
            if (nome.equalsIgnoreCase("X")) {
                break;
            }

            System.out.print("Digite a idade: ");
            int idade = teclado.nextInt();

            if (rep == 0 || idade > maioridade) {
                maioridade = idade;
                maisvelhanome = nome;
            }

            teclado.nextLine();

            System.out.print("Digite o sexo (M/F): ");
            String sexo = teclado.nextLine();

            System.out.print("Quantidade de pontos perdidos na carteira: ");
            int pontosPerdidos = teclado.nextInt();

            System.out.print("Valor da multa: ");
            double multa = teclado.nextDouble();
            teclado.nextLine();

            if (sexo.equalsIgnoreCase("Masculino") || sexo.equalsIgnoreCase("M")) {
                homensmultados++;
            }

            if ((sexo.equalsIgnoreCase("Feminino") || sexo.equalsIgnoreCase("F")) && pontosPerdidos == 7) {
                mulheres7pontos++;
            }

            idadetotal += idade;
            quantidadePessoas++;
            valortotaldasmultas += multa;
            rep++;

            System.out.println("-----------------------------------");

        } while (!nome.equalsIgnoreCase("X"));


        double mediaIdade = idadetotal / quantidadePessoas;
        System.out.println("Média da idade dos condutores: " + mediaIdade);

        System.out.println("Valor total das multas: " + valortotaldasmultas);

        System.out.println("Quantidade de homens multados: " + homensmultados);

        System.out.println("Porcentagem de homens multados: " + (homensmultados / quantidadePessoas) * 100 + "%");

        System.out.println("Quantidade de mulheres multadas com mais de 7 pontos: " + mulheres7pontos);

        System.out.println("Nome do condutor mais velho: " + maisvelhanome);

        teclado.close();
    }
}
