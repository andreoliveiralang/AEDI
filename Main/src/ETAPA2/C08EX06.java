//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079

package ETAPA2;
import java.util.Scanner;

public class C08EX06 
{

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

    
        int numero, soma = 0, quantidade = 0;

        // PRIMEIRO TURNO
        for (int repeticao = 0; repeticao < 10; repeticao++) 
        {
            System.out.print("Digite um numero inteiro: ");
            numero = keyboard.nextInt();
            

            if (numero % 2 == 0){
            System.out.println("número Par");
            }else{
            System.out.println("número Impar");
            }if (numero % 4 == 0){
                soma += numero; 
            }if (numero % 3 == 0){
                quantidade = quantidade+1;
            }


        }
        System.out.println(" A soma dos números divisiveis por 4 foi = " + soma);
        System.out.println(" Quantidade de números diviseveis por 3 é = " + quantidade);
    }
}
// exercicio 13 PROVA //