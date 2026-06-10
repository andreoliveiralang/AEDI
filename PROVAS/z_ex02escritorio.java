import java.util.Scanner;

public class z_ex02escritorio {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        // 🌟 O SEGREDO DE DUAS CLASSES:
        // Como o engenheiro está em outro arquivo, precisamos "chamar" ele criando um objeto.
        // É como se estivéssemos instalando o ramal da Calculadora aqui no main.
        z_ex02engenheiro calc = new z_ex02engenheiro();
        
        // Um laço que roda direto para pedir "diversos valores de x"
        while (true) {
            System.out.print("\nDigite o valor de x (-1 PARA ENCERRAR): ");
            double x = keyboard.nextDouble();
            
            // Se o usuário digitar -1, o programa para na hora
            if (x == -1) {
                System.out.println("Programa encerrado.");
                break; 
            }
            
            // 🌟 USANDO O MÉTODO DA OUTRA CLASSE:
            // Chamamos o método usando o 'calc.' que criamos ali em cima.
            double fDeX = calc.calcularFx(x);
            
            // Printa com 4 casas decimais para bater com o exemplo do professor
            System.out.printf("f(x) = %.4f\n", fDeX);
        }
        
        keyboard.close();
    }
}
