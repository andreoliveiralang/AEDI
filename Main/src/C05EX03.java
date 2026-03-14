//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079

<<<<<<< HEAD

import java.util.Scanner;
public class C05EX03 {
    public static void main (String[]args){
        double salario, liquido,impostoDeRenda;
        int nDependentes;

        Scanner keyboard = new Scanner (System.in);
        
        
        System.out.print("Digite o valor do seu salário:");
        salario = keyboard.nextInt();
        
        System.out.print("Digite o número de Dependentes:");
        nDependentes = keyboard.nextInt();
        
        liquido = salario - (nDependentes * 60.00);
        
        impostoDeRenda = (liquido * 0.15);
        
        System.out.printf("Salário = %.0f",salario);
        System.out.print(" e Dependentes = " + nDependentes);
        System.out.printf(" --> IR = %.0f\n", impostoDeRenda);
        
        keyboard.close();
=======
import java.util.Scanner;
public class C05EX03 {
    public static void main(String[] args){
        
        double salario numDependentes;

        Scanner keyboard = new Scanner (System.in);

        System.out.print("Digite o seu salário:");
        salario = keyboard.nextInt();

        System.out.print("Digite o numero de dependentes:");
        numDependentes = keyboard.nextdouble();











>>>>>>> 93ad8f3f875af4cf31cefeedd82884197a7d7737
    }
}
