

//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079

import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class C04EX05 {

    //o "throws Exception" é necessário para lidar com a possível exceção de arquivo não encontrado, caso o arquivo "salario.txt" não exista no diretório do projeto. Ele permite que o programa compile e execute sem erros, mesmo que o arquivo não esteja presente. Se o arquivo for encontrado, ele será processado normalmente; caso contrário, uma mensagem de erro será exibida.
    public static void main(String[] args) throws Exception{

       //Localiza o arquivo "ficha.txt" no diretório do projeto.
        File arquivo = new File("src/ficha.txt");
        
        //Cria um objeto Scanner para ler o conteúdo do arquivo "salario.txt". O Scanner é usado para processar o arquivo linha por linha ou palavra por palavra, dependendo da necessidade.
        Scanner leitor = new Scanner(arquivo);

        String nome = leitor.nextLine(); //lê uma linha do arquivo e armazena na variável "nome". Presumivelmente, essa linha contém o nome do funcionário.
        String cpf = leitor.nextLine(); //lê a próxima linha do arquivo e armazena na variável "cpf". Presumivelmente, essa linha contém o CPF do funcionário.
        String identidade = leitor.nextLine(); //lê a próxima linha do arquivo e armazena na variável "identidade". Presumivelmente, essa linha contém a identidade do funcionário.
        String titulo = leitor.nextLine(); //lê a próxima linha do arquivo e armazena na variável "titulo". Presumivelmente, essa linha contém o título do funcionário.
        String carteira = leitor.nextLine(); //lê a próxima linha do arquivo e armazena na variável "Carteira". Presumivelmente, essa linha contém a carteira de trabalho do funcionário.
        String salario = leitor.nextLine(); //lê a próxima linha do arquivo e armazena na variável "salario". Presumivelmente, essa linha contém o salário do funcionário.
        String empresa = leitor.nextLine(); //lê a próxima linha do arquivo e armazena na variável "empresa". Presumivelmente, essa linha contém o nome da empresa onde o funcionário trabalha.


       String ficha=
        "FICHA FUNCIONAL DE: " + nome + "\n \n" +
        "Documentos:\n"+
        "CPF : .......................... " + cpf + "\n"+
        "C.I : ............................. " + identidade + "\n"+
        "Titulo de eleitor : ..... " + titulo + "\n"+
        "CNH : .......................... " + carteira + "\n \n" +
        "Empresa : ................... " + empresa + "\n" +
        "Salário : R$................... " + salario;

        JOptionPane.showMessageDialog(null,ficha,"FICHA FUNCIONAL",JOptionPane.INFORMATION_MESSAGE);








    }       
}