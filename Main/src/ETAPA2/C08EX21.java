package ETAPA2;

import java.util.Scanner;

public class C08EX21 {
        public static void main(String[] args) 
    {    
        Scanner keyboard = new Scanner(System.in);
        Double altura, imc=0.;
        
        System.out.println("Informe sua altura em metros = ");
        altura = keyboard.nextDouble();

        for (int aux = 60; aux <= 100; aux++){
           imc = aux/(Math.pow(altura,2));
           
           System.out.print(aux + "  ");

           if (imc <=19.91){
               System.out.print("   ABAIXO DO PESO          ");
            }
            else if (imc <=31.66){
                System.out.print("   PESO IDEAL              ");
            }
            else{
                System.out.print("   ACIMA DO PESO           ");
            }
            
            System.out.println(imc);
        }

    }
}

