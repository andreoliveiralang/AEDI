package ETAPA2;

import java.util.Scanner;

public class C09EX05 {
    public static void main(String[] args) {
Scanner keyboard = new Scanner(System.in);
   double num, den, serie=0;
   int nTermos;

   System.out.println("Digite o número de termos a ser gerado:");
   nTermos = keyboard.nextInt();

   for (int aux=1; aux<= nTermos; aux++) {  // ? = quantidade de termos da série
     num = (aux * 2 - 2) + (aux * 3)   ;//? = implementação da variação do numerador
     den = (aux * 6 + 1) ;//? = implementação da variação do denominador
     serie += num / den;
   }
   
   System.out.print("Valor da Série = "+ 5 * serie); // numerozinho que fica fora do parenteses é multiplicando.
 }
}
