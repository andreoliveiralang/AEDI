//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079
package ETAPA2;
import java.util.Scanner;
public class C09EX04{
public static void main(String[] args) {
Scanner keyboard = new Scanner(System.in);
   double num, den, serie=0;
   int nTermos;

   System.out.println("Digite o número de termos a ser gerado:");
   nTermos = keyboard.nextInt();

   for (int aux=1; aux<= nTermos; aux++) {  // ? = quantidade de termos da série
     num = (aux * 4 - 3) * (aux * 4 - 2)   ;//? = implementação da variação do numerador
     den = (aux * 4 - 1) * (aux * 4) ;//? = implementação da variação do denominador
     serie += num / den;
   }
   
   System.out.print("Valor da Série = "+ Math.sqrt(serie));
 }
}