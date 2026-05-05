package ETAPA2;

import java.util.Scanner;

public class C08EX16 {
    public static void main(String[] args) 
    {    
        
        Scanner keyboard = new Scanner(System.in);

        Double soma = 0., media;
        int impares = 0;
        
        for (int aux = 1000; aux <= 2000; aux++){
            if (aux % 2 != 0){      // Se o resto da divisão NÃO FOR 0, é impar        
            soma += aux;            //
            impares ++;             // Acumula os IMPARES que achamos
            }
        }
        media = soma/ impares ;
        System.out.println("A média dos números impares entre 1000 a 2000 é = " + media);
    }

}
