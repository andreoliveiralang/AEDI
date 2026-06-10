import java.util.ArrayList;
import java.util.Scanner;

public class listadinamicaex1 {
     public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // 1. Criando as duas listas dinâmicas vazias
        ArrayList<Double> temperatura = new ArrayList<>();
       
      
        // LOOP DE CADASTRO
        while (true) {
            System.out.println("Digite a temperatura (ou '-99' para encerrar):");
            Double temp = keyboard.nextDouble();

            if (temp == -99){
                break; // Para o cadastro
            }
            temperatura.add(temp);
        }

        double soma=0;
        int acima40=0;

        for(int i = 0; i < temperatura.size(); i++){
            double tempAtual = temperatura.get(i);
            soma+=tempAtual;

            if (tempAtual > 40)
            acima40++;
            }
            double media = soma/temperatura.size();
            System.out.println("A Média das temperaturas é de:" +media);
            System.out.println("Quantidade de temperaturas acima de 40 : "+ acima40);
            
            keyboard.close();
        } 
        
    }

