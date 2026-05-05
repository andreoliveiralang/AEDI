package ETAPA2;

public class C08EX23 
{
     public static void main(String[] args) 
    {    
        int soma = 0;
        int contador = 0;
        Double media;

        for (int aux = 1000; aux <= 9999;aux++) {
            int milhar = aux / 1000;
            int centena = (aux % 1000) / 100;
            int dezena = (aux % 100) / 10;
            int unidade = aux % 10;

            // Regra do palíndromo para 4 dígitos
            if (milhar == unidade && centena == dezena) {
                System.out.println(aux);
                soma += aux;
                contador++;
            }
        }

        if (contador > 0) {
            media = (double) soma / contador; // trata o int como double so nesse momento, ÚTIL EM
            System.out.println("Média = " + media);
        }
    }
}

//Faça um programa que calcule e imprima todos os números compreendidos entre 1000 e 9999 que são palíndromos. Um palíndromo é uma sequência de caracteres que é lida da esquerda para a direita ou da direita para a esquerda resultando no mesmo valor final.  Ao final imprima a média destes números.​