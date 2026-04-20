
//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079

package ETAPA2;
import java.util.Scanner;

public class C08EX12 
{

    public static void main(String[] args) 
    {
        int equipamento;
        Double valorDoEquipamento = 0.0, faturamentoTotal = 0.0;

        Scanner keyboard = new Scanner(System.in);
        
        for (int repeticao = 0; repeticao < 11; repeticao++)
        {
            System.out.println("Digite o código do modelo do equipamento");
            equipamento = keyboard.nextInt();
            
                switch (equipamento) {
                    case 1:
                        valorDoEquipamento = 1565.00;
                        break;
                    case 2:
                        valorDoEquipamento = 1890.00;
                        break;
                    case 3:
                        valorDoEquipamento = 2150.00;
                        break;
                    case 4: 
                        valorDoEquipamento = 2963.00;
                        break;
                    case 5:
                        valorDoEquipamento = 3750.00;
                        break;
                    }
                    faturamentoTotal += valorDoEquipamento; // '' += '' É uma forma curta de dizer ao Java: "pegue o que já está na variável e junte com este novo valor".

        }
        System.out.println("Faturamento =  " + faturamentoTotal);

           
        }

    }
