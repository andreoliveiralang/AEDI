package etapa2;
import java.util.Scanner;

public class C08EX05
{
     public static void main (String [] args)
    {   
        String voto,ganhador;
        int totalFulano = 0, totalCiclano = 0, totalBeltrano = 0 ;

        Scanner keyboard = new Scanner (System.in);
        for (int repeticao = 0; repeticao < 100; repeticao ++) 
        {
            System.out.println(" Digite o número do seu candidato:\n-------------------------------\n -- Candidatos diponiveis para o cargo: \n     FULANO = 1 \n     CICLANO = 2 \n     BELTRANO = 3 --\n------------------------------- ");
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
            
            System.out.print("Votou em " + voto + "\n");
            System.out.println("__________________________________________");
        }
        if (totalFulano > totalCiclano && totalFulano > totalBeltrano){
            ganhador = "FULANO";
        }
        else if (totalCiclano > totalFulano && totalCiclano > totalBeltrano){
            ganhador = "CICLANO";
        }
        else {
            ganhador = "BELTRANO";
        }
        
        
        System.out.println("Votos Totais");
        System.out.println("FULANO = "+totalFulano +"\nCICLANO = "+totalCiclano +"\nBELTRANO = "+totalBeltrano );
        
        System.out.println("O ganhador é = "+ ganhador);

        






    }
}