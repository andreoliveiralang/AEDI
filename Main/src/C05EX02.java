//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079

import java.util.Scanner;
<<<<<<< HEAD
public class C05EX02 {
    public static void main(String[] args){
        
        Double valorDePi, valorDeRaio, area, volume;

        Scanner keyboard = new Scanner (System.in);
        
        valorDePi = Math.PI;

        System.out.println("Informe o raio da esfera:");
        valorDeRaio = keyboard.nextDouble();

        area = 4 * valorDePi * Math.pow(valorDeRaio,2);
        System.out.printf("Área = %.2f\n",area);

        volume = 4.0/3.0 * valorDePi * Math.pow(valorDeRaio,3);
        System.out.printf("Volume = %.2f\n", volume);

        keyboard.close();
   }
=======
public class C05EX02 {    
     public static void main(String[] args){
            Double valordePi, valorArea ,valorVolume;
            Scanner keyboard = new Scanner (System.in);
            System.out.print("Digite o raio da esfera (R): ");
            double raioEsfera = keyboard.nextDouble();
            
            valordePi = 3.1416;

            valorArea = 4* valordePi*raioEsfera*(Math.pow(raioEsfera,2));

            System.out.printf("resultado da Área:%.1f " ,valorArea);

            System.out.println();
            
            valorVolume = 4.0/3.0 * valordePi*(Math.pow(raioEsfera,3));

            System.out.printf("resultado do Volume: %.1f", valorVolume);
            
            keyboard.close(); 
    }
>>>>>>> 93ad8f3f875af4cf31cefeedd82884197a7d7737
}