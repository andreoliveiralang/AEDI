package ETAPA3;

import java.util.Scanner;

public class C12EX03 {
    public static void main(String[] args) 
    {

        Scanner keyboard = new Scanner(System.in);

        int valoresInteiros[] = new int [10];
        int contador =0, resolucao=0;
        
        for (int rep=0; rep < valoresInteiros.length; rep ++){          // lenght usado para medir a capacidade maxima de um vetor.
            System.out.println("Digite um valor númerico inteiro : ");
            valoresInteiros[rep] = keyboard.nextInt();
        }
        
        System.out.print("Números Impressos: ");

        for (int rep=0; rep < valoresInteiros.length; rep++){
            if (valoresInteiros [rep] > 0){
            resolucao = valoresInteiros[rep] * valoresInteiros[rep];  // aqui havia colocado -> "resolucao = Math.pow(valoresInteiros[rep], 2)" da certo!, porem o MATH POW, converte em double, obrigatoriamente, oque no resultado fica aparecendo um .0 chato.. assim evitamos essa visualização, ""quebrada"""
            }
        
        System.out.print(resolucao + " , ");
        }

    }
}
