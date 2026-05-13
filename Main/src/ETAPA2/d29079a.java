//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079



package ETAPA2;

import java.util.Scanner;

public class d29079a {
    public static void main(String[] args) 
    {    
        Scanner keyboard = new Scanner(System.in);
       

        for (int aux = 100000; aux <= 999999; aux++){

           int primeiroDigito= aux / 100000;
           int segundoDigito= aux / 10000 % 10;
           int terceiroDigito= aux / 1000 % 10;
           int quartoDigito= aux / 100 % 10;
           int quintoDigito= aux / 10 % 10;
           int sextoDigito= aux % 10;

           if (aux % 9 == 0 || aux % 5 == 0){
            System.out.println(aux);
           }
           else if (primeiroDigito + segundoDigito = terceiroDigito){
            System.out.println(aux);
        }
           else if()


           }

        
           
          

        }

    }
}


