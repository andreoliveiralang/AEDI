//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079

import java.util.Scanner;
public class C04EX02 {
public static void main(String[] args)
{
    String nome, identidade, nomeEmpresa, cpf, salario;
    long tituloEleitor, carteiraMotorista;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("Digite seu nome:");
    nome = keyboard.nextLine();

    System.out.print("Digite o número da sua identidade:");
    identidade = keyboard.nextLine();

    System.out.print("Digite o nome da empresa que trabalha:");
    nomeEmpresa = keyboard.nextLine();

    System.out.print("Digite seu CPF:");
    cpf = keyboard.nextLine();

    System.out.print("Digite seu salario:");
    salario = keyboard.nextLine();

    System.out.print("Digite o número do seu titúlo de eleitor:");
    tituloEleitor = keyboard.nextLong();

    System.out.print("Digite o número da sua carteira de motorista:");
    carteiraMotorista = keyboard.nextLong();

    System.out.println();
    System.out.println("Documentos:");
    System.out.print("CPF ................................... " + cpf);
    System.out.println();
    System.out.print("C.I ................................... " + identidade);
    System.out.println();
    System.out.print("Titúlo de eleitor ..................... " + tituloEleitor);
    System.out.println();
    System.out.println("Carteira de motorista ................. " + carteiraMotorista);
    System.out.println();
    System.out.println("Empresa:" + nomeEmpresa);
    System.out.println("Salario: R$" + salario );

    keyboard.close();
}
}
