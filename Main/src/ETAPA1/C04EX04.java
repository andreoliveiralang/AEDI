//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079

package ETAPA1;
import javax.swing.JOptionPane;
public class C04EX04 {
    public static void main(String[] args) {
        
        String primeiroNome = JOptionPane.showInputDialog("Digite seu primeiro nome:");
        String sobrenome = JOptionPane.showInputDialog("Digite seu sobrenome:");
        String segundoNome = JOptionPane.showInputDialog("Digite seu segundo nome:");
        
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));

        
        JOptionPane.showMessageDialog(null, sobrenome + ", " + primeiroNome + " " + segundoNome + "\nIdade: " + idade + " anos.");         

    
    }
}

