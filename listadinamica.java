import java.util.ArrayList; // OBRIGATORIO PARA LISTA DINAMICA
import java.util.Scanner;
public class listadinamica {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // 1. Criando as duas listas dinâmicas vazias
        ArrayList<String> registroAcademico = new ArrayList<>();
        ArrayList<String> nomeAlunos = new ArrayList<>();
      
        // LOOP DE CADASTRO
        while (true) {
            System.out.println("Digite o Registro Acadêmico (ou '0' para encerrar):");
            String ra = keyboard.nextLine();

            if (ra.equals("0")){
                break; // Para o cadastro
            }
            
            System.out.println("Digite o nome do aluno:");
            String nome = keyboard.nextLine();

            // 🌟 ADICIONANDO NA LISTA (.add)
            registroAcademico.add(ra);
            nomeAlunos.add(nome);
        }

        // LOOP DE BUSCA
        System.out.println("\nDigite o nome do aluno que queira buscar: ");
        String nomeBusca = keyboard.nextLine();

        boolean achou = false; 

        // 🌟 'nomeAlunos.size()' devolve exatamente quantos elementos foram cadastrados ''substitui o length'''
        for(int i = 0; i < nomeAlunos.size(); i++){
            
            // 🌟 'nomeAlunos.get(i)' é o equivalente a 'nomeAlunos[i]' do vetor comum
            if (nomeAlunos.get(i).equalsIgnoreCase(nomeBusca)){
                achou = true;

                System.out.println("Aluno encontrado!");
                System.out.println("RA: " + registroAcademico.get(i) + "\nNome: " + nomeAlunos.get(i));
                System.out.println("Posição na lista: " + i);
                break; 
            }
        } 

        if (!achou) {
            System.out.println("Aluno não encontrado.");
        }
        
        keyboard.close();
    }
}

