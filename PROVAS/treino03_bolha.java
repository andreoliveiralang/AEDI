import java.util.Scanner;
public class treino03_bolha {
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        String nome[] = new String [5];
        double notas[] = new double [5]; 

        
        for(int i=0; i < nome.length; i++)

        { //vetor.lenght faz com que o for acompanhe o tamanho do vetor.
            System.out.println("Digite o NOME do aluno " + (i + 1) + ":");
            nome[i]=keyboard.nextLine();

            System.out.println("Digite a NOTA do aluno " + (i + 1)+ ":"); // le a nota na mesma posição
            notas[i] = keyboard.nextDouble();// Lê a nota na MESMA posição i

            keyboard.nextLine();//limpando buffer
        }
        // ⭐ NOVIDADE: BLOCO DO MÉTODO DA BOLHA (ORDEM ALFABÉTICA) ⭐
        // Ele compara os nomes vizinhos e troca os nomes E as notas de lugar juntos!
        for (int x = 0; x < nome.length - 1; x++) {
            for (int y = 0; y < nome.length - 1 - x; y++) {
                
                // Se o nome atual vier DEPOIS no alfabeto que o próximo nome...
                if (nome[y].compareToIgnoreCase(nome[y + 1]) > 0) {
                    
                    // Troca os NOMES de lugar usando a caixinha reserva (auxNome)
                    String auxNome = nome[y];
                    nome[y] = nome[y + 1];
                    nome[y + 1] = auxNome;

                    // Troca as NOTAS de lugar junto para manter a sincronia!
                    double auxNota = notas[y];
                    notas[y] = notas[y + 1];
                    notas[y + 1] = auxNota;
                }
            }
        }

        // EXIBIÇÃO DA LISTA ORDENADA (Para você testar se funcionou)
        System.out.println("\n--- LISTA EM ORDEM ALFABÉTICA ---");
        for (int i = 0; i < nome.length; i++) {
            System.out.println(nome[i] + " - Nota: " + notas[i]);
        }
    
    
        //SEGUNDO FOR PARA LOCALÇIZAR O NOME 
        System.out.println("Digite o nome do aluno que você deseja buscar: ");
        String nomeBusca = keyboard.nextLine();

        boolean achou = false; 

        for(int i=0; i < nome.length; i++){
            if (nome[i].equalsIgnoreCase(nomeBusca)){
                System.out.println("Aluno encontrado!");
                System.out.println("Posição na lista:" + i);
                System.out.println("Nota do aluno: "+ notas[i]);
                achou = true;
                break;
            }
        }
        if (achou == false){
            System.out.println("Aluno não encontrado");
        }
        keyboard.close();
} 
    
}
