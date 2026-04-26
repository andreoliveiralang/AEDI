package ETAPA2;

import java.util.Scanner;

public class C09EX08 {
   public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
   double num, den, serie=0;

   for (int aux=1; aux<= 20; aux++) {  // ? = quantidade de termos da série
     num = (aux * 2 + 1) * Math.sqrt(aux * 4 + 1)   ;//? = implementação da variação do numerador
     den = (Math.pow(5,aux)) ;//? = DICA 2 - multiplos de um mesmo número
     serie += num / den;
   }
   
   System.out.print("Valor da Série = "+ (Math.pow(serie, 2))); 
 }

}
