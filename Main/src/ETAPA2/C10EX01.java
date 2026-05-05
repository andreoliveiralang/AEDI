package ETAPA2;

import java.util.Scanner;

//                            WHILE = ENQUANTO

public class C10EX01 
{
    public static void main(String[] args)
    {
    Scanner keyboard = new Scanner(System.in);
    int contador = 0;
    Double valor,multa,somaMultas =0.,media;
    
    do
    {
        System.out.println("Digite um valor (-1 para parar): ");
        valor = keyboard.nextDouble();

        if (valor != -1)
        { // "! = " DIFERENTE 
            multa = valor * 0.10;
            System.out.println("Multa: " + multa);

            somaMultas += multa; // ou somaMulta = somaMultas + multa
            contador++; // vai acumulando quantas multas calculou 
        }
        
    } while (valor != -1);

    if (contador > 0)
    {
        media = somaMultas / contador; //dividindo a soma de todas as multas pela quantidade de multas que colocamos.
        System.out.println("Média de multas: " + media);
    }
    else{
        System.out.println("Nenhum valor válido foi digitado.");
    }
    keyboard.close();
        
    }
}
