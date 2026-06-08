package ETAPA3;
import java.util.Scanner;
public class C13EX09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Lê a frase curta informada pelo usuário
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        // 2. Divide a frase em um array de palavras usando os espaços em branco (" ")
        String[] palavras = frase.split(" ");
        
        // StringBuilder nos ajuda a reconstruir a frase de forma eficiente
        StringBuilder fraseFormatada = new StringBuilder();

        // 3. Percorre cada palavra obtida
        for (String palavra : palavras) {
            // Se a palavra não estiver vazia (evita problemas com espaços duplos)
            if (!palavra.isEmpty()) {
                
                // Pega a primeira letra e joga para Maiúsculo
                String primeiraLetra = palavra.substring(0, 1).toUpperCase();
                
                // Pega o restante da palavra (da posição 1 em diante) e joga para Minúsculo
                String restantePalavra = palavra.substring(1).toLowerCase();

                // Junta as partes e adiciona um espaço logo após a palavra
                fraseFormatada.append(primeiraLetra).append(restantePalavra).append(" ");
            }
        }

        // 4. Imprime o resultado final tirando o último espaço que sobrou no fim (.trim())
        System.out.println("=> " + fraseFormatada.toString().trim());

        scanner.close();
    }
}

