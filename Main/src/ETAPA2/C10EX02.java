package ETAPA2;

import java.util.Scanner;

public class C10EX02 {
    public static void main(String[] args)
    {
    Scanner keyboard = new Scanner(System.in);
    int contador = 0, acima =0;
    Double valorRece,somaValores =0.,media;
    
    do
    {
        System.out.println("Digite os valores recebidos: (0 para parar) ");
        valorRece = keyboard.nextDouble();

        if (valorRece != 0) //0 é a flag // "! = " DIFERENTE
        {                                       
            somaValores += valorRece; // vai somando os valores 
            contador++; // vai acumulando quantos valores foram inseridos 
            if (valorRece >1000)
                acima++;
        }
    
    } while (valorRece != 0);

    
    if (contador > 0)
    {
        
        media = somaValores / contador; //dividindo a soma de todo valor pela quantidade de valores que colocamos.
        System.out.println("Valor total recebido = " + somaValores);
        System.out.println("Média de valores = " + media);
        System.out.println("Quantidade de valores acima de R$1000.00 = "+ acima);
    }
    else{
        System.out.println("Nenhum valor válido foi digitado.");
    }
    keyboard.close();
        
    }
}

