package etapa2;
import java.util.Scanner;

public class C08EX05a
{
     public static void main (String [] args)
    {   
        
        Scanner keyboard = new Scanner (System.in);
        String voto,ganhador;
        int totalFulano = 0, totalCiclano = 0, totalBeltrano = 0, totalNulos = 0 ;
        for (int repeticao = 0; repeticao < 4; repeticao ++) 
        {
            System.out.println(" Digite o número do seu candidato:\n-------------------------------\n -- Opções diponiveis para o voto: \n     FULANO = 1 \n     CICLANO = 2 \n     BELTRANO = 3 \n     NULO = 0 --\n------------------------------- ");
            voto = keyboard.nextLine();

            if (voto.equals("1")){
            voto = "FULANO";
            totalFulano++;
            }
            else if (voto.equals("2")){
            voto = "CICLANO";
            totalCiclano++;
            }
            else if (voto.equals("3")){
            voto = "BELTRANO";
            totalBeltrano++;
            }
            else if (voto.equals("0")){
            voto = "NULO";
            totalNulos++;
            }
            
            System.out.print("Votou em " + voto + "\n");
            System.out.println("__________________________________________");
        }
        if (totalFulano > totalCiclano && totalFulano > totalBeltrano){
            ganhador = "FULANO";
        }
        else if (totalCiclano > totalFulano && totalCiclano > totalBeltrano){
            ganhador = "CICLANO";
        }
        else if (totalBeltrano > totalFulano && totalBeltrano > totalCiclano){
            ganhador = "BELTRANO";
        }
        else if (totalNulos > totalFulano+totalCiclano+totalBeltrano){
        ganhador= "AS ELEIÇOES FORAM ANULADAS";
        }
        else {
        ganhador = "EMPATE";
        }
        
        System.out.println("Votos Totais");
        System.out.println("FULANO = "+totalFulano +"\nCICLANO = "+totalCiclano +"\nBELTRANO = "+totalBeltrano +"\nNULOS = "+totalNulos);
        
        System.out.println("O ganhador é = "+ ganhador);

        if (ganhador .equals("EMPATE"))
{

            
             //------------------------------------------------------------------------//
            
            System.out.println("\n VOTE PARA O SEGUNDO TURNO");
            
            String voto2,ganhador2;
            int totalFulano2 = 0, totalCiclano2 = 0, totalNulos2 = 0;
            for (int repeticao = 0; repeticao < 4; repeticao ++)
        {
                if (totalFulano == totalCiclano)
            {

                System.out.println(" Digite o número do seu candidato:\n-------------------------------\n -- Opções diponiveis para o voto: \n     FULANO = 1 \n     CICLANO = 2  \n     NULO = 0 --\n------------------------------- ");
                
                    voto = keyboard.nextLine();

                    if (voto.equals("1")){
                    voto2 = "FULANO";
                    totalFulano2++;
                    }
                    else if (voto.equals("2")){
                    voto2 = "CICLANO";
                    totalCiclano2++;
                    }
                    else if (voto.equals("0")){
                    voto2 = "NULO";
                    totalNulos2++;
                    }
                    System.out.print("Votou em " + voto + "\n");
                    System.out.println("__________________________________________");
                
                
                if (totalFulano2 > totalCiclano2){
                    ganhador2 = "FULANO";
                }
                else if (totalCiclano2 > totalFulano2){
                    ganhador2 = "CICLANO";
                }
                else if (totalNulos2 > totalFulano2+totalCiclano2){
                    ganhador2 = "AS ELEIÇOES FORAM ANULADAS";
                }
                else {
                    ganhador2 = "EMPATE";
                }
                System.out.println("Votos Totais");
                System.out.println("FULANO = "+totalFulano2 +"\nCICLANO = "+totalCiclano2 +"\nNULOS =" +totalNulos2);
            
                System.out.println("O ganhador é = "+ ganhador2);
            }
        }
    }

            //-------------------------------------------------------------------------------------------------------------------//

    else if(totalFulano == totalBeltrano)
    {
        System.out.println("\n VOTE PARA O SEGUNDO TURNO");
            
        String voto3,ganhador3;
        int totalFulano3 = 0, totalBeltrano3 = 0, totalNulos3 = 0;
        for (int repeticao = 0; repeticao < 4; repeticao ++)
        {
            if (totalFulano3 == totalBeltrano3)
            {

                System.out.println(" Digite o número do seu candidato:\n-------------------------------\n -- Opções diponiveis para o voto: \n     FULANO = 1 \n     BELTRANO = 2  \n     NULO = 0 --\n------------------------------- ");
                
                    voto = keyboard.nextLine();

                    if (voto.equals("1")){
                    voto3 = "FULANO";
                    totalFulano3++;
                    }
                    else if (voto.equals("2")){
                    voto3 = "BELTRANO";
                    totalBeltrano3++;
                    }
                    else if (voto.equals("0")){
                    voto3 = "NULO";
                    totalNulos3++;
                    }
                    System.out.print("Votou em " + voto + "\n");
                    System.out.println("__________________________________________");
                
                    }
                    if (totalFulano3 > totalBeltrano3){
                        ganhador3 = "FULANO";
                    }
                    else if (totalFulano3 > totalBeltrano3){
                        ganhador3 = "BELTRANO";
                    }
                    else if (totalNulos3 > totalFulano3+totalBeltrano3){
                        ganhador3 = "AS ELEIÇOES FORAM ANULADAS";
                    }
                    else {
                        ganhador3 = "EMPATE";
                    }
                    System.out.println("Votos Totais");
                    System.out.println("FULANO = "+totalFulano3 +"\nBELTRANO = "+totalBeltrano3 +"\nNULOS =" +totalNulos3);
                
                    System.out.println("O ganhador é = "+ ganhador3);
                    
            
            }
        }
        System.out.println("\n VOTE PARA O SEGUNDO TURNO");
            
            String voto4,ganhador4;
            int totalBeltrano4 = 0, totalCiclano4 = 0, totalNulos4 = 0;
            for (int repeticao = 0; repeticao < 4; repeticao ++)
        {
                if (totalBeltrano == totalCiclano)
            {

                System.out.println(" Digite o número do seu candidato:\n-------------------------------\n -- Opções diponiveis para o voto: \n     BELTRANO = 1 \n     CICLANO = 2  \n     NULO = 0 --\n------------------------------- ");
                
                    voto = keyboard.nextLine();

                    if (voto.equals("1")){
                    voto4 = "BELTRANO";
                    totalBeltrano4++;
                    }
                    else if (voto.equals("2")){
                    voto4 = "CICLANO";
                    totalCiclano4++;
                    }
                    else if (voto.equals("0")){
                    voto4 = "NULO";
                    totalNulos4++;
                    }
                    System.out.print("Votou em " + voto + "\n");
                    System.out.println("__________________________________________");
                
                
                if (totalBeltrano4 > totalCiclano4){
                    ganhador4 = "FULANO";
                }
                else if (totalCiclano4 > totalBeltrano4){
                    ganhador4 = "CICLANO";
                }
                else if (totalNulos4 > totalBeltrano4 + totalCiclano4){
                    ganhador4 = "AS ELEIÇOES FORAM ANULADAS";
                }
                else {
                    ganhador4 = "EMPATE";
                }
                System.out.println("Votos Totais");
                System.out.println("FULANO = "+totalBeltrano4 +"\nCICLANO = "+totalCiclano4 +"\nNULOS =" +totalNulos4);
            
                System.out.println("O ganhador é = "+ ganhador4);
            }
        }
    




    }
}