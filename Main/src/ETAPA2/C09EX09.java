package ETAPA2;
import java.util.Scanner;
public class C09EX09 
{
    public static void main(String[] args)
    {
    Scanner keyboard = new Scanner(System.in);
    double num, den, serie=0 ,resultadoFinal;
    int nTermos;

    System.out.println("Digite o número de termos a ser gerado:");
    nTermos = keyboard.nextInt();

    for (int aux=1; aux<= nTermos; aux++) 
        {  // ? = quantidade de termos da série
            num = (Math.pow(3,aux + 1 ))  ;//? = implementação da variação do numerador
            den = (aux * 1 + 9 ) * Math.sqrt((Math.pow(aux,4))) ;//? = implementação da variação do denominador
            serie += num / den;
        }
    resultadoFinal = 100 - (Math.pow(serie,3));
    System.out.print("Valor da Série = "+ resultadoFinal); 
    }
}