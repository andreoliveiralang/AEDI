import java.util.Scanner;

public class treino07_ex01 {

    //O MÉTOD MAIN (O Dono da Fábrica)
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // 1. Você atende o cliente e pede os números do Ponto 1
        System.out.println("Digite o X do Ponto 1:");
        double x1 = keyboard.nextDouble();
        System.out.println("Digite o Y do Ponto 1:");
        double y1 = keyboard.nextDouble();

        // 2. Você pede os números do Ponto 2
        System.out.println("Digite o X do Ponto 2:");
        double x2 = keyboard.nextDouble();
        System.out.println("Digite o Y do Ponto 2:");
        double y2 = keyboard.nextDouble();

        // 🌟 AQUI A MÁGICA ACONTECE:
        // Você chama o método pelo nome e passa os 4 valores que leu.
        // O resultado que o engenheiro calcular vai ser guardado na variável 'distanciaFinal'.
        double distanciaFinal = calcularDistancia(x1, y1, x2, y2);

        // Agora é só mostrar o resultado para o usuário
        System.out.println("A distância entre os pontos é: " + distanciaFinal);

        keyboard.close();
    }//------------------------------------------------------------------------- close metodo main

    // 2. A SALA DO ENGENHEIRO
    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        double parteX = Math.pow(x1 - x2, 2);
        double parteY = Math.pow(y1 - y2, 2);
        return Math.sqrt(parteX + parteY);
    }
}


