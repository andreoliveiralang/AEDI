package ETAPA2;

import java.util.Scanner;

public class C09EX07 {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
   double num, den, serie=0;

   for (int aux=1; aux<= 6; aux++) {  // ? = quantidade de termos da série
     num = (aux * 2 - 2) + (aux * 3)   ;//? = implementação da variação do numerador
     den = (aux * 6 + 1) ;//? = implementação da variação do denominador
     serie += num / den;
   }
   
   System.out.print("Valor da Série = "+ serie); 
 }

}
