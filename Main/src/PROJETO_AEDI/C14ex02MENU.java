import java.util.Scanner;

public class C14ex02MENU {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int opcao = 0;
        double area = 0;

        while (opcao != 9) {

            System.out.println("\n===== FIGURAS GEOMÉTRICAS =====");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Retângulo");
            System.out.println("3 - Triângulo Retângulo");
            System.out.println("4 - Círculo");
            System.out.println("9 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = teclado.nextInt();

            switch (opcao) {

                case 1:

                    System.out.print("Digite o lado: ");
                    double lado = teclado.nextDouble();

                    area = C14ex02MENUAREA.calcularQuadrado(lado);

                    System.out.println("Área = " + area);
                    break;

                case 2:

                    System.out.print("Digite a base: ");
                    double base = teclado.nextDouble();

                    System.out.print("Digite a altura: ");
                    double altura = teclado.nextDouble();

                    area = C14ex02MENUAREA.calcularRetangulo(base, altura);

                    System.out.println("Área = " + area);
                    break;

                case 3:

                    System.out.print("Digite a base: ");
                    base = teclado.nextDouble();

                    System.out.print("Digite a altura: ");
                    altura = teclado.nextDouble();

                    area = C14ex02MENUAREA.calcularTriangulo(base, altura);

                    System.out.println("Área = " + area);
                    break;

                case 4:

                    System.out.print("Digite o raio: ");
                    double raio = teclado.nextDouble();

                    area = C14ex02MENUAREA.calcularCirculo(raio);

                    System.out.println("Área = " + area);
                    break;

                case 9:

                    System.out.println("FIM DO PROGRAMA");
                    break;

                default:

                    System.out.println("OPÇÃO INVÁLIDA");
            }
        }

        teclado.close();
    }
}