package ETAPA2;

import java.util.Scanner;

public class C10EX04 
{
    public static void main(String[] args)
    {
    Scanner keyboard = new Scanner(System.in);
   
    String nomeMaterial;
    double taxaBDI, precoMaterial,custoparcial,custototal = 0,bdi,precoFinal;
    int qtdMaterial;
    
    System.out.print("Digite a taxa de BDI = %");
    taxaBDI = keyboard.nextDouble();
    
    keyboard.nextLine();


    
        do{
            System.out.println("Nome do material (FIM para parar): ");
            nomeMaterial = keyboard.nextLine();
            if (!nomeMaterial.equals("FIM"))
            {

                System.out.println("Quantidade: ");
                qtdMaterial = keyboard.nextInt();

                System.out.println("Preco unitário:");
                precoMaterial = keyboard.nextDouble();

                keyboard.nextLine();

                //cálculo

                custoparcial = qtdMaterial * precoMaterial;
                System.out.println("Custo parcial: " + custoparcial);
                
                custototal += custoparcial;
            }
        
            } while (!nomeMaterial.equals("FIM"));
    
    bdi = custototal * (taxaBDI/100);
    precoFinal = custototal+bdi;

    System.out.println("Custo Total = " + custototal);
    System.out.println("BDI = "+ bdi);
    System.out.println("Preço final = " + precoFinal);
    }
}


