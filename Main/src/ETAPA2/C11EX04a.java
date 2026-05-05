package ETAPA2;

import java.util.Scanner;

public class C11EX04a {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String maisvelhanome = "";

        double idadetotal = 0, quantidadePessoas = 0, valortotaldasmultas = 0, homensmultados = 0, mulheres7pontos = 0, maioridade = 0;

        for (int rep = 1; rep <= 4; rep++) {

            System.out.print("Digite o nome: ");
            String nome = teclado.nextLine();

            System.out.print("Digite a idade: ");
            int idade = teclado.nextInt();

            if (rep == 1 || idade > maioridade) {
                maioridade = idade;
                maisvelhanome = nome;
            }

            teclado.nextLine();

            System.out.print("Digite o sexo: ");
            String sexo = teclado.nextLine();

            System.out.print("Quantidade de pontos perdidos na certeira: ");
            int pontosPerdidos = teclado.nextInt();

            System.out.print("Valor da multa: ");
            double multa = teclado.nextDouble();
            teclado.nextLine();
            
            if (sexo.equalsIgnoreCase("Masculino") || sexo.equalsIgnoreCase("M")) {
                homensmultados++;
            }

            if (sexo.equalsIgnoreCase("Feminino") || sexo.equalsIgnoreCase("F")) {
                if (pontosPerdidos > 7) {
                    mulheres7pontos++;
                }
            }

            idadetotal += idade;
            quantidadePessoas++;

            valortotaldasmultas += multa;

            System.out.println("-----------------------------------");

        }
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
