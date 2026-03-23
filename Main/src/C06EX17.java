//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079

import javax.swing.JOptionPane;
public class C06EX17
{
     public static void main (String [] args)
    {   String resultado = "Apto", naoApto = "Não apto";
        int pergunta1,pergunta2,pergunta3,pergunta4,pergunta5,pergunta6,pergunta7,pergunta8,pergunta9;
        
        
            pergunta1 = JOptionPane.showConfirmDialog(null,"Você tem curso técnico de programação?");

            pergunta2 = JOptionPane.showConfirmDialog(null,"Você tem curso superior de programação?");

            pergunta3 = JOptionPane.showConfirmDialog(null, "Você tem menos de 3 anos de experiência em programação?");

            pergunta4 = JOptionPane.showConfirmDialog(null,"Você se considera uma pessoa criativa?");

            String[] opcoes1 = {"Prefiro Liderar", "Prefiro ser Liderado"};
            pergunta5 = JOptionPane.showOptionDialog( null,"Você prefere liderar a ser liderado?","pergunta 5",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,opcoes1,opcoes1[0]);

            String[] opcoes2 = {"Sozinho", "Equipe"};
            pergunta6 = JOptionPane.showOptionDialog( null,"Você prefere trabalhar sozinho a trabalhar em equipe?","pergunta 6",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,opcoes2,opcoes2[0]);

            pergunta7 = JOptionPane.showConfirmDialog(null, "Você é autodidata (aprende sozinho)?");

            pergunta8 = JOptionPane.showConfirmDialog(null,"Você aceitaria uma remuneração inicial de R$1500?");

            pergunta9 = JOptionPane.showConfirmDialog(null,"Você só aceitaria trabalhar em escritórios da empresa dentro da grande BH? ");
            
            //entendendo joptionpane, aqui como esta "showConfirmDialog" Ele mostra a caixinha para vc escolher uma opção.. onde   SIM= 0 e NÃO= 1 e CANCELAR = 2.


            if (pergunta4 == 1 || pergunta4 == 2)
                resultado = naoApto;

            if (pergunta6 == 0 || pergunta6 == 2)           // &&= e ||= ou
                resultado = naoApto;

            if (pergunta7 == 1 || pergunta7 == 2)
                resultado = naoApto;

            if (pergunta9 == 0 || pergunta9 == 2)
                resultado = naoApto;

            if (pergunta5 == 0 && pergunta8 == 0)
                resultado =naoApto;
            
            if (pergunta1 == 1 && pergunta2 == 1 && pergunta3 == 0 )
                resultado = naoApto;
                

            JOptionPane.showMessageDialog(null, resultado);
    
    }
}

//Crie um programa que faça as perguntas abaixo ao usuário, o qual responderá VERDADEIRO ou FALSO para cada uma delas. No final o programa deverá responder se a pessoa está apta ou não para exercer a função de programador na empresa.​

//Você tem curso técnico de programação?​

//Você tem curso superior de programação?​

//Você tem menos de 3 anos de experiência em programação? ​

//Você se considera uma pessoa criativa?​

//Você prefere liderar a ser liderado?​

//Você prefere trabalhar sozinho a trabalhar em equipe?​

//Você é autodidata (aprende sozinho)?​

//Você aceitaria uma remuneração inicial de R$1500?​

//Você só aceitaria trabalhar em escritórios da empresa dentro da grande BH? 



