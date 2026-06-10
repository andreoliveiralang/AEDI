import java.util.Scanner;
public class treino04_ex26 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        String funcionario[] = new String [100];
        double salario[] = new double [100]; 
        int totalFuncionarios=0;
        double porcentagem, indiceAume;

        
        for(int i=0; i < funcionario.length; i++)

        { //vetor.lenght faz com que o for acompanhe o tamanho do vetor.
            System.out.println("Digite o NOME do funcionario (X PARA ENCERRAR) " + ( i + 1) + ":");
            funcionario[i]=keyboard.nextLine();
            if (funcionario[i].equalsIgnoreCase("X")){
                break; // sai do for
            }

            System.out.println("Digite o SALARIO do funcionario " + (i + 1)+ ":");
            salario[i] = keyboard.nextDouble();// Lê a nota na MESMA posição i

            keyboard.nextLine();//limpando buffer
            totalFuncionarios++;
        }
        System.out.println("Digite a porcentagem de reajuste no salario(ex:10 para 10% de aumento)");
        porcentagem = keyboard.nextDouble();

        indiceAume = 1 +(porcentagem / 100); //transforama o numero digitado em porcentagem.

        for(int i=0; i < funcionario.length; i++) // aplicando o aumento no vetor.
            if (salario[i] < 1000){
                salario[i]*=indiceAume;
            }

         System.out.println("\n--- LISTA ---");
        for (int i = 0; i < totalFuncionarios; i++) {
            System.out.println(funcionario[i] + " - Salário: " + salario[i]);
        }

        keyboard.close();
} 
} 
