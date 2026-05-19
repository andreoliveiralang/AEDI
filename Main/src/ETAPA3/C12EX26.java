package ETAPA3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class C12EX26 {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    // DECLARAÇÃO DE UMA LISTA DINÂMICA DE STRINGS 
    List<String> listaNomes = new ArrayList<String>();
    List<Integer> listaSalarios = new ArrayList<Integer>();
    String nome;
    int salario;
     
    
do {

    System.out.print("Digite um nome (X para encerrar): ");
    nome = keyboard.nextLine();

    if (!nome.equalsIgnoreCase("X"))
          
       listaNomes.add(nome);
       
       System.out.print("Digite o salario:(0para encerrar): ");
       salario = keyboard.nextInt();

       listaSalarios.add(salario);

       keyboard.nextLine();

    } 
    while (!nome.equalsIgnoreCase("X") && salario != 0);

    }
}
