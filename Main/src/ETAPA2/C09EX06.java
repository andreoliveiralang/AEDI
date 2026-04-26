package ETAPA2;

import java.util.Scanner;

public class C09EX06 {
 
       public static void main(String[] args) {
Scanner keyboard = new Scanner(System.in);
   double num, den, serie=0;

   for (int aux=1; aux<= 20; aux++) {  // ? = quantidade de termos da série
     num = (aux)   ;//? = implementação da variação do numerador
     den = (Math.sqrt(aux * 2)) ;//? = implementação da variação do denominador
     serie += num / den;
   }
   
   System.out.print("Valor da Série = "+ (10 + serie)); // numerozinho que fica fora do parenteses se não tiver sinal de + ou - é multiplicando.
   // aqui  cuidar pois dps do mais '+' tiver uma conta, tem que por parenteses.
 }

}
