package ETAPA3;
import java.util.Scanner;
public class C13EX10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Solicita e lê o nome completo da pessoa
        System.out.print("Digite o nome completo: ");
        String nomeCompleto = scanner.nextLine();

        // 2. Converte todas as letras para maiúsculo
        String nomeMaiusculo = nomeCompleto.toUpperCase();

        System.out.println("\nNome na vertical:");
        
        // 3. Loop para percorrer cada caractere da String
        for (int i = 0; i < nomeMaiusculo.length(); i++) {
            // Pega a letra na posição 'i'
            char letra = nomeMaiusculo.charAt(i);
            
            // Imprime a letra e pula para a próxima linha
            System.out.println(letra);
        }

        scanner.close();
    }
}

