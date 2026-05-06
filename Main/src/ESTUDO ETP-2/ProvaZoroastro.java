import javax.swing.JOptionPane;
import java.lang.Math;

public class ProvaZoroastro {
    public static void main(String[] args) {
        String nomeAluno = "";
        String nomeMaisCaroPrimeiro = "", nomeMaisCaroUltimo = "", nomeMaisCaroMeio = "";
        
        double maiorPreco = -1.0, menorPreco = Double.MAX_VALUE;
        double somatorioGeral = 0, somaSerie = 0;
        int contador = 0, maioresQueCinquenta = 0;
        
        // 3 - DO WHILE (Flag Real)
        do {
            nomeAluno = JOptionPane.showInputDialog("Digite o nome do aluno (ou '!' para sair):");

            // Flag fictício (! em um if)
            if (!nomeAluno.equals("!")) {
                
                // Validação: Do While dentro do Do While (0 a 1 milhão)
                double preco;
                do {
                    preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço (0 a 1.000.000):"));
                } while (preco < 0 || preco > 1000000);

                // --- Lógica de Maior e Menor (Postos/Nomes) ---
                if (preco > maiorPreco) {
                    maiorPreco = preco;
                    nomeMaisCaroPrimeiro = nomeAluno; // Primeiro posto com maior preço
                }
                
                if (preco >= maiorPreco) {
                    nomeMaisCaroUltimo = nomeAluno; // Último posto com maior preço
                }

                if (preco < menorPreco) {
                    menorPreco = preco;
                }

                // --- Decomposição Numérica e Cálculos ---
                // Exemplo: Pegar o primeiro dígito de um número de 3 casas
                int numDecomposicao = (int) preco; 
                int primeiroDigito = numDecomposicao / 100; 
                double calculoRaiz = Math.pow(primeiroDigito, 1.0/5.0); // Raiz Quinta

                // --- Somatório e Média ---
                somatorioGeral += preco;
                contador++;
                if (preco > 50) maioresQueCinquenta++;

            }
        } while (!nomeAluno.equals("!")); // Flag Real

        // --- 2 - SÉRIE MATEMÁTICA (Somatório com Math) ---
        // Exemplo de série: S = (x^2 / 1) + (x^3 / 2) + (x^4 / 3)...
        double x = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de X para a série:"));
        for (int i = 1; i <= 5; i++) {
            // Usando o i como aux do meio para numerador e denominador
            somaSerie += Math.pow(x, i + 1) / i;
        }

        // --- Resultados Finais ---
        double media = (contador > 0) ? somatorioGeral / contador : 0;

        String output = String.format(
            "Média Geral: %.2f\n" +
            "Maiores que 50: %d\n" +
            "Primeiro mais caro: %s (%.2f)\n" +
            "Último mais caro: %s (%.2f)\n" +
            "Soma da Série: %.2f",
            media, maioresQueCinquenta, nomeMaisCaroPrimeiro, maiorPreco, nomeMaisCaroUltimo, maiorPreco, somaSerie
        );

        JOptionPane.showMessageDialog(null, output);
    }
}