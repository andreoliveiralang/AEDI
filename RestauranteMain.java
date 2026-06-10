// Arquivo: RestauranteMain.java
import java.util.Scanner;

public class RestauranteMain {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // 1. Conectando com a outra classe (criando o ramal do engenheiro)
        GarcomEngenheiro garcom = new GarcomEngenheiro();

        // 2. Perguntando o valor para o cliente
        System.out.print("Digite o valor consumido (R$): ");
        double contaDoCliente = keyboard.nextDouble();

        // 3. Jogando o valor na mesa do engenheiro e guardando a resposta em 'total'
        double total = garcom.calcularTotalComDezPorCento(contaDoCliente);

        // 4. Mostrando o resultado final na tela
        System.out.println("O total da conta com os 10% é: R$ " + total);

        keyboard.close();
    }
}