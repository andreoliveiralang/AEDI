
//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079

package ETAPA2;

import javax.swing.JOptionPane;

public class C08EX11
{
     public static void main (String [] args)
    {  
        
        String [] opcoes = {"M", "F"} , opcoes1 = {"C", "S", "O"} , opcoes2 = {"A","C", "P","O"}, opcoes3 = {"L", "P" ,"C", "R"} , opcoes4 = {"1","2","3", "4"};
        String nomeMaior = "";
        Double salarioMaior = 0.0, menorSalarioH = 99999999.0 , maiorSalarioH = 0.0, diferencaSalario;
        

        int pergunta1,pergunta2,pergunta3,pergunta4,pergunta6, qtdMulheresEspecificas = 0;
        //---------------------------------------------------------------------------------------------------//
         for (int repeticao = 0; repeticao < 50; repeticao++)
     
        {
            String nome = JOptionPane.showInputDialog(null, "Qual seu nome? ");

            String idadeString = JOptionPane.showInputDialog(null, "Qual sua idade? ");
            int idade = Integer.parseInt(idadeString);

            pergunta1 = JOptionPane.showOptionDialog(null, "Qual o seu gênero?", "SEXO", JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,opcoes,opcoes[0]);

            pergunta2 = JOptionPane.showOptionDialog(null, "Qual seu estado Civil?", "Estado Civil", JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null, opcoes1, opcoes1[0]);

            pergunta3 = JOptionPane.showOptionDialog(null, "Qual a cor dos seus olhos?", "Cor olhos", JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null, opcoes2, opcoes2[0]);

            pergunta4 = JOptionPane.showOptionDialog(null, "Qual a cor dos seus cabelos?", "Cor cabelos", JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null, opcoes3, opcoes3[0]);

            String salario = JOptionPane.showInputDialog(null, "Insira o valor do seu salario: ");
            Double pergunta5 = Double.parseDouble(salario);

            pergunta6 = JOptionPane.showOptionDialog(null, "Qual a sua escolaridade?", "Escolaridade", JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null, opcoes4, opcoes4[0]);

            if (idade >= 18 && idade <= 25 && pergunta1 == 1 && pergunta2 == 1 && pergunta3 == 0 && pergunta4 == 0 && pergunta5 > 10000 && pergunta6 == 3 ){
            qtdMulheresEspecificas++;
            }

            if (repeticao == 0.0 || pergunta5 > salarioMaior){
                salarioMaior = pergunta5;
                nomeMaior = nome;
            }

            if (pergunta1 == 0){
                if (pergunta5 > maiorSalarioH){
                    maiorSalarioH = pergunta5;
                }
                if (pergunta5 < menorSalarioH){
                    menorSalarioH = pergunta5;
                }
            }
        }

        diferencaSalario = maiorSalarioH - menorSalarioH;
        
        JOptionPane.showMessageDialog(null,"Quantidade de Mulheres Loiras, de olhos azuis, com idade entre 18 e 25 anos, solteiras, salario maior que R$10 mil e curso superior completo é de = " + qtdMulheresEspecificas);

        JOptionPane.showMessageDialog(null,"Nome da pessoa com maior salario = " + nomeMaior);

        JOptionPane.showMessageDialog(null,"A diferença entre o maior e menor salario é de =" + diferencaSalario); 


        
    }
}