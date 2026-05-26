package ETAPA3;

import java.util.Scanner;

public class C12Ex05 {
    
    public static void main(String[] args) 
    {

        Scanner keyboard = new Scanner(System.in);

        double angulo,radiano,seno,cosseno,tangente,arcoCosseno,arcoSeno,arcoTangente;
        
       System.out.println("Infoirme um ângulo em graus:");
       angulo = keyboard.nextDouble();

       radiano = angulo * (Math.PI/180);
       seno = Math.sin(radiano);
       cosseno = Math.cos(radiano);
       tangente = Math.tan(radiano);

       arcoSeno = 1/seno;
       arcoCosseno = 1/cosseno;
       arcoTangente = 1/tangente;
    
        System.out.println("Seno = "+ seno + "\nCosseno = " +cosseno + " \nTangente = "+ tangente);
        System.out.println();
        System.out.println("Arco Seno = "+ arcoSeno + "\nArco Cosseno = " +arcoCosseno + " \nArco Tangente = "+ arcoTangente);
    
    
       keyboard.close();
    }
}
