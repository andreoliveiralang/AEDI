public class FatorialProgressao {

    public static void main(String[] args) {

        // Variável que vai armazenar o resultado do fatorial
        int fatorial = 1;

        // Loop de 1 até 9 (progressão)
        for (int i = 1; i <= 9; i++) {

            // Multiplica o valor atual pelo número da vez
            fatorial *= i;

            // Mostra o resultado do fatorial de i
            System.out.println(i + "! = " + fatorial);
        }
    }
}