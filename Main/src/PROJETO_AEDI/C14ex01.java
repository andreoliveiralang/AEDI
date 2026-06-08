import java.util.Scanner;

public class C14ex01 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int opcao;

        do {

            System.out.println("Informe a opção desejada:");
            System.out.println("1 - Último sobrenome");
            System.out.println("2 - Nome ABNT");
            System.out.println("3 - Formatar NOME");
            System.out.println("4 - Verificar número par");
            System.out.println("5 - Calcular média");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {

                case 1:
                    C14ex01A.executar();
                    break;

                case 2:
                    C14ex01B.executar();
                    break;

                case 3:
                    C14ex01C.executar();
                    break;

                case 4:
                    C14ex01D.executar();
                    break;

                case 5:
                    C14ex01E.executar();
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        teclado.close();
    }
}