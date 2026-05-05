package ETAPA2;
import java.util.Scanner;
public class C08EX14 {
     public static void main(String[] args) 
    {    
        
        Scanner keyboard = new Scanner(System.in);

        int n;
        String simbolo;
        
        System.out.println("Digite um número entre 1 e 20: ");
        n = keyboard.nextInt();
       
        if (n > 20 || n < 1){
        System.out.println("Número inválido! O programa será encerrado.");
        return; // mata execução.
        }
        keyboard.nextLine();
        
        System.out.println("Digite um simbolo: ");
        simbolo = keyboard.nextLine();


        for (int aux = 0; aux < n; aux++)
        {
           for(int aux2 = 0; aux2 < n; aux2++)
           {
            System.out.print(simbolo + " ");
           }
            System.out.println();
        }
    }
}
        