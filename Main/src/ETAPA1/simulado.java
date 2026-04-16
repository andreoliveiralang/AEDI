//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079
package ETAPA1;

import javax.swing.JOptionPane;
public class simulado
{
     public static void main (String [] args)
    {   
        String valorConta,mensagemFinal;  
        Double totalGeral,taxaGarcom;
        
    
        valorConta = JOptionPane.showInputDialog(null,"Qual valor total da conta do restaurante?",                  //mensagem corpo da caixa
        "aula de java:"           // titulo da caixa
        ,JOptionPane.QUESTION_MESSAGE);   // tipo do dialogo, iconizinho da caixa 
        
        double valor = Double.parseDouble(valorConta);

        taxaGarcom = valor * 0.10;
        totalGeral = valor + taxaGarcom;

        mensagemFinal = String.format("O valor total da conta é: R$ %.2f", totalGeral); //String.format é basicamente o printf do JOption pane.

        JOptionPane.showMessageDialog(null, mensagemFinal,"Valor da sua conta é:",JOptionPane.INFORMATION_MESSAGE);
        
        







    }      
}
  