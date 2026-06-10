import java.util.Scanner;
public class treino06_ex28 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        String registroAcademico[] = new String [100];
        String nomeAlunos[] = new String[100]; 
        int totalAlunos=0;
      
        for(int i=0; i < registroAcademico.length; i++){
            System.out.println("Digite Registro academico: (0 PARA ENCERRAR) " + (i+1)+ " :" );
            registroAcademico[i]=keyboard.nextLine();

            if (registroAcademico[i].equals("0")){
                break;
            }
            System.out.println("Digite o nome do aluno "+ (i+1)+ ":" );
            nomeAlunos[i] = keyboard.nextLine();

            totalAlunos++;
        }

        // SEGUNDO FOR PARA LOCALIZAR O CPF 
        System.out.println("Digite o nome do aluno que queira buscar: ");
        String nomeBusca = keyboard.nextLine();

        boolean achou = false; 

        // Mudado para 'totalCPF' para não testar gavetas vazias
        for(int i=0; i < totalAlunos; i++){
            if (nomeAlunos[i].equalsIgnoreCase(nomeBusca)){
                achou = true; // Marca que encontrou!

                System.out.println("Aluno encontrado");
                System.out.println("Registro acadêmico:" + registroAcademico[i] + "\n Nome: " + nomeAlunos[i+1]);
                System.out.println("posição na lista: "+i);
                break; // Para o laço já que encontrou o que queriad
                } 
            }

            if(!achou){
                System.out.println("Aluno não encontrado");
            }
            keyboard.close();
        }
    
    }


