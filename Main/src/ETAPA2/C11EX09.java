package ETAPA2;

import java.util.Scanner;

public class C11EX09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int[] contSetor = new int[5]; // Índices 1 a 4 para Gerência, Adm, Pesquisa, Obras
        int adm2010 = 0;
        String primeiroFunc = "", ultimoFunc = "";
        int rfMenor = 99999999, rfMaior = 0;
        String[] nomesSetores = {"", "Gerência", "Administração", "Pesquisa", "Obras"};

        while (true) {
            System.out.print("Nome do funcionário (ou 'fim'): ");
            String nome = teclado.next();
            if (nome.equalsIgnoreCase("fim")) break;

            System.out.print("RF (6 dígitos): ");
            String rfStr = teclado.next();

            // Validação (Item a)
            if (rfStr.length() != 6) {
                System.out.println("REGISTRO INVÁLIDO");
                continue;
            }

            int ano = Integer.parseInt(rfStr.substring(0, 2)) + 2000;
            int setor = Character.getNumericValue(rfStr.charAt(2));

            if (ano < 2010 || ano > 2014 || setor < 1 || setor > 4) {
                System.out.println("REGISTRO INVÁLIDO");
                continue;
            }

            // Estatísticas
            contSetor[setor]++; // Item b
            if (ano == 2010 && setor == 2) adm2010++; // Item c

            // Item e: Primeiro e último admitidos (pela lógica do RF numérico)
            int rfNum = Integer.parseInt(rfStr);
            if (rfNum < rfMenor) { rfMenor = rfNum; primeiroFunc = nome; }
            if (rfNum > rfMaior) { rfMaior = rfNum; ultimoFunc = nome; }
        }

        // Saídas
        System.out.println("\n--- RESULTADOS ---");
        for (int i = 1; i <= 4; i++) System.out.println(nomesSetores[i] + ": " + contSetor[i]);
        System.out.println("Admitidos em 2010 na Administração: " + adm2010);
        
        int max = -1, indMax = 1;
        for (int i = 1; i <= 4; i++) {
            if (contSetor[i] > max) { max = contSetor[i]; indMax = i; }
        }
        System.out.println("Setor com mais funcionários: " + nomesSetores[indMax]);
        System.out.println("Funcionário mais antigo: " + primeiroFunc);
        System.out.println("Funcionário mais novo: " + ultimoFunc);

        teclado.close();
    }
}
