package ETAPA3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EXTRA {


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        List<String> listaNomes = new ArrayList<>();
        List<Double> listaNotas = new ArrayList<>(); // Double para salário
        Double nota= 0.0;
        
        // a) Preencher as duas listas de forma sincronizada
        while (true) { //cria um looping infinito, até alguem BREKAR, la em baixo.
            System.out.print("Digite um nome ((FIM) para encerrar): ");
            String nome = keyboard.nextLine();
            
            if (nome.equalsIgnoreCase("FIM")) {
                break; // Encerra imediatamente sem pedir salário
            }
            
            System.out.print("Digite a nota: ");
            nota = keyboard.nextDouble();
            keyboard.nextLine(); // Limpa o buffer
            
            
            
            listaNomes.add(nome);
            listaNotas.add(nota);
        }


        // d) Imprimir as duas listas de forma sincronizada
        System.out.println("\n--- Lista de alunos aprovados ---");
        for (int aux = 0; aux < listaNomes.size(); aux++) {
            
            if (listaNotas.get(aux) >= 7){
                System.out.println("Nome: " + listaNomes.get(aux) + " - Notas: " + listaNotas.get(aux));
            }
        }

        keyboard.close();
    }
}



