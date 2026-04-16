package ETAPA2;
import java.util.Scanner;

public class C08EX05a2 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String voto, ganhador;
        int totalFulano = 0, totalCiclano = 0, totalBeltrano = 0, totalNulos = 0;

        // PRIMEIRO TURNO
        for (int repeticao = 0; repeticao < 4; repeticao++) {

            System.out.println("\nDigite o número do seu candidato:");
            System.out.println("1 = FULANO");
            System.out.println("2 = CICLANO");
            System.out.println("3 = BELTRANO");
            System.out.println("0 = NULO");

            voto = keyboard.nextLine();

            if (voto.equals("1")) {
                totalFulano++;
                System.out.println("Votou em FULANO");
            }
            else if (voto.equals("2")) {
                totalCiclano++;
                System.out.println("Votou em CICLANO");
            }
            else if (voto.equals("3")) {
                totalBeltrano++;
                System.out.println("Votou em BELTRANO");
            }
            else {
                totalNulos++;
                System.out.println("Voto NULO");
            }

            System.out.println("________________________");
        }

        int votosValidos = totalFulano + totalCiclano + totalBeltrano;

        // RESULTADO PRIMEIRO TURNO
        if (totalNulos >= votosValidos) {
            ganhador = "ELEIÇÃO ANULADA";
        }
        else if (totalFulano > totalCiclano && totalFulano > totalBeltrano) {
            ganhador = "FULANO";
        }
        else if (totalCiclano > totalFulano && totalCiclano > totalBeltrano) {
            ganhador = "CICLANO";
        }
        else if (totalBeltrano > totalFulano && totalBeltrano > totalCiclano) {
            ganhador = "BELTRANO";
        }
        else {
            ganhador = "EMPATE";
        }

        System.out.println("\nRESULTADO PRIMEIRO TURNO");
        System.out.println("FULANO = " + totalFulano);
        System.out.println("CICLANO = " + totalCiclano);
        System.out.println("BELTRANO = " + totalBeltrano);
        System.out.println("NULOS = " + totalNulos);
        System.out.println("Resultado: " + ganhador);

        // SEGUNDO TURNO SOMENTE SE EMPATE
        if (ganhador.equals("EMPATE")) {

            System.out.println("\nSEGUNDO TURNO");

            int total1 = 0;
            int total2 = 0;
            int nulos2 = 0;

            String candidato1 = "";
            String candidato2 = "";

            if (totalFulano == totalCiclano) {
                candidato1 = "FULANO";
                candidato2 = "CICLANO";
            }
            else if (totalFulano == totalBeltrano) {
                candidato1 = "FULANO";
                candidato2 = "BELTRANO";
            }
            else {
                candidato1 = "CICLANO";
                candidato2 = "BELTRANO";
            }

            for (int i = 0; i < 4; i++) {

                System.out.println("\nVote novamente:");
                System.out.println("1 = " + candidato1);
                System.out.println("2 = " + candidato2);
                System.out.println("0 = NULO");

                voto = keyboard.nextLine();

                if (voto.equals("1")) {
                    total1++;
                    System.out.println("Votou em " + candidato1);
                }
                else if (voto.equals("2")) {
                    total2++;
                    System.out.println("Votou em " + candidato2);
                }
                else {
                    nulos2++;
                    System.out.println("Voto NULO");
                }
            }

            System.out.println("\nRESULTADO SEGUNDO TURNO");

            System.out.println(candidato1 + " = " + total1);
            System.out.println(candidato2 + " = " + total2);
            System.out.println("NULOS = " + nulos2);

            if (nulos2 >= total1 + total2) {
                System.out.println("ELEIÇÃO ANULADA");
            }
            else if (total1 > total2) {
                System.out.println("Ganhador: " + candidato1);
            }
            else if (total2 > total1) {
                System.out.println("Ganhador: " + candidato2);
            }
            else {
                System.out.println("EMPATE NO SEGUNDO TURNO");
            }
        }

        keyboard.close();
    }
}