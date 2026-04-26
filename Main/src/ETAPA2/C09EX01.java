//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079

// MODELO PARA SÉRIES MATEMATICAS SOMATÓRIO. //

package ETAPA2;
public class C09EX01 {
 public static void main(String[] args) {
   double num, den, serie=0;
   for (int aux=1; aux<= 37; aux++) {  // ? = quantidade de termos da série
     num = (38 - aux) * (39 -aux);//? = implementação da variação do numerador
     den = aux;//? = implementação da variação do denominador
     serie += num / den;
   }
   
   System.out.print("Valor da Série = "+serie);
 }
}
