import java.util.Scanner;

public class treino05_ex27 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        String cpf[] = new String [100];
        String endereço[] = new String[100]; 
        int totalCPF=0, opcao, opcao2;
      
        for(int i=0; i < cpf.length; i++){
            System.out.println("Digite um cpf: (0 PARA ENCERRAR)" + (i+1)+ ":" );
            cpf[i]=keyboard.nextLine();

            if (cpf[i].equals("0")){
                break;
            }
            System.out.println("Digite o endereço "+ (i+1)+ ":" );
            endereço[i] = keyboard.nextLine();

            totalCPF++;
        }

        // SEGUNDO FOR PARA LOCALIZAR O CPF 
        System.out.println("Digite o CPF que você deseja buscar: ");
        String nomeBusca = keyboard.nextLine();

        boolean achou = false; 

        // Mudado para 'totalCPF' para não testar gavetas vazias
        for(int i=0; i < totalCPF; i++){
            if (cpf[i].equals(nomeBusca)){
                achou = true; // Marca que encontrou!

                System.out.println("CPF encontrado!");
                // AJUSTADO: Adicionado o '[i]' para printar o conteúdo e não o endereço da memória
                System.out.println("CPF:" + cpf[i] + "\n Endereço: " + endereço[i] +"\n [1] ALTERAR | [2] EXCLUIR | [3] VOLTAR" );
                opcao = keyboard.nextInt();
                keyboard.nextLine(); // AJUSTADO: Limpando o buffer do int

                if (opcao == 1){
                    System.out.println("Digite o novo CPF:");
                    cpf[i] = keyboard.nextLine(); 
                    System.out.println("Digite o novo ENDEREÇO:");
                    endereço[i] = keyboard.nextLine();
                    System.out.println("Dados Atualizados Com Sucesso!");

                } else if(opcao == 2){                      
                    cpf[i] = cpf[totalCPF - 1];
                    endereço[i] = endereço[totalCPF - 1];
                    
                    // Limpa a última vaga que agora ficou duplicada
                    cpf[totalCPF - 1] = null;
                    endereço[totalCPF - 1] = null;
                    
                    totalCPF--; // Diminui o total cadastrado
                    System.out.println("CPF Excluído com sucesso! ");
                } else {
                    System.out.println("Operação cancelada");
                }
                break; // Para o laço já que encontrou o que queria
            }
        } // FIM DO LAÇO DE BUSCA

        // AJUSTADO: A tomada de decisão de incluir foi movida para FORA do laço
        if (!achou) {
            System.out.println("Nome não encontrado!");
            System.out.println("Deseja Incluir? [1] SIM | [2] NÃO ");
            opcao2 = keyboard.nextInt();
            keyboard.nextLine(); // AJUSTADO: Limpando o buffer

            if (opcao2 == 1){
                cpf[totalCPF] = nomeBusca;
                System.out.println("Digite o endereço deste cpf:");
                endereço[totalCPF] = keyboard.nextLine();
                totalCPF++;
                System.out.println("CPF incluído com sucesso!");
            } else {
                System.out.println("Operação Cancelada.");
            }
        }

        // AJUSTADO: A exibição da lista foi movida para FORA de todos os blocos de busca
        System.out.println("\n --- LISTA ---");
        for (int x = 0; x < totalCPF; x++) {
            System.out.println(cpf[x] + " - Endereço: " + endereço[x]);
        }

        keyboard.close();
    }
}