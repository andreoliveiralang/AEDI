
//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079

package ETAPA2;
import java.util.Scanner;

public class C08EX10 
{

    public static void main(String[] args) 
    {

        Scanner keyboard = new Scanner(System.in);
        
        String insumo, nomeMaior = "";
        int quantInsumoTotal= 0, quantInsumo = 0;
        Double precoInsumo = 0.,custoTotalProjeto= 0., precoMaior=0.;

        System.out.println(" - Insumos Consumidos no projeto - ");
        
        for (int repeticao = 0; repeticao < 4; repeticao++)
     
        {
            
            System.out.println("Digite o nome do insumo: ");
            insumo = keyboard.nextLine();
            
            System.out.println("Digite a quantidade desse insumo: ");
            quantInsumo = keyboard.nextInt();
            
            System.out.println("Digite o preço do Insumo: ");
            precoInsumo = keyboard.nextDouble();
            
            custoTotalProjeto += (quantInsumo * precoInsumo);//multiplicou a quantidade de insumos pelo preço dele e "guardou na caixinha"
            quantInsumoTotal++; // isso aqui faz com que a cada vez que o "FOR" repete o codigo, ele "acrescenta na caixinha"
            
            keyboard.nextLine();

            if (repeticao == 1 || precoInsumo > precoMaior){
                precoMaior = precoInsumo;
                nomeMaior = insumo;
            }

            

            System.out.println("______________________________________________\n");
    
        }
    
    System.out.printf("custo do projeto %.1f = ", custoTotalProjeto);
    System.out.println("Média dos Custos Parciais = " + custoTotalProjeto / quantInsumoTotal );
    System.out.println("Nome do Insumo de maior custo parcial = " + nomeMaior);
    
    
    }
}