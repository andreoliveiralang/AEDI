//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079
package etapa1;

import java.util.Scanner;

public class C07EX04 {
    public static void main(String[] args) {
        String equipe, estado = "";

        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.print("Digite o nome da equipe de futebol: ");
            // Lendo e convertendo para MAIÚSCULO para evitar erro de digitação
            equipe = keyboard.nextLine().toUpperCase();

            switch (equipe) {
                // MINAS GERAIS
                case "AMERICA":
                case "ATLETICO":
                case "CRUZEIRO":
                case "VILLA NOVA":
                    estado = "Minas Gerais";
                    break;

                // RIO DE JANEIRO
                case "BOTAFOGO":
                case "FLAMENGO":
                case "FLUMINENSE":
                case "VASCO":
                    estado = "Rio de Janeiro";
                    break;

                // SÃO PAULO
                case "CORINTHIANS":
                case "PALMEIRAS":
                case "SANTOS":
                case "SÃO PAULO":
                    estado = "São Paulo";
                    break;

                // RIO GRANDE DO SUL
                case "GREMIO":
                case "INTERNACIONAL":
                case "JUVENTUDE":
                    estado = "Rio Grande do Sul";
                    break;

                // PERNAMBUCO
                case "NAUTICO":
                case "SANTA CRUZ":
                case "SPORT":
                    estado = "Pernambuco";
                    break;

                default:
                    estado = "Estado desconhecido ou equipe não listada.";
                    break;
            }

            System.out.println("O estado da equipe " + equipe + " é: " + estado);
        }
    }
}