import javax.swing.JOptionPane;

public class PAR_IMPAR {
    public static void main(String[] args) {
        // Entrada de dados via caixa de diálogo
        String input = JOptionPane.showInputDialog("Digite um número inteiro:");
        
        // Conversão da String para int
        int numero = Integer.parseInt(input);
        
        // Lógica: se o resto da divisão por 2 for 0, é par
        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é PAR.");
        } else {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é ÍMPAR.");
        }
    }
}

