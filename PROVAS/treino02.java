
import java.util.Scanner;
public class treino02 {
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