//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079

package ETAPA1;


import java.util.Scanner;
public class C06EX18extra
{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite os 9 primeiros dígitos do CPF (um por um):");
        
        // Vamos usar variáveis separadas para cada dígito para ficar mais fácil
        int d1 = teclado.nextInt();
        int d2 = teclado.nextInt();
        int d3 = teclado.nextInt();
        int d4 = teclado.nextInt();
        int d5 = teclado.nextInt();
        int d6 = teclado.nextInt();
        int d7 = teclado.nextInt();
        int d8 = teclado.nextInt();
        int d9 = teclado.nextInt();

        // CÁLCULO DO PENÚLTIMO DÍGITO (Tabela 1)
        int soma1 = (d1*1) + (d2*2) + (d3*3) + (d4*4) + (d5*5) + (d6*6) + (d7*7) + (d8*8) + (d9*9);
        int dv1 = soma1 % 11;
        if (dv1 == 10) dv1 = 0; // Regra do enunciado: Resto 10 vira 0

        // CÁLCULO DO ÚLTIMO DÍGITO (Tabela 2)
        // Note que agora incluímos o dv1 no cálculo e os pesos mudam (0 a 9)
        int soma2 = (d1*0) + (d2*1) + (d3*2) + (d4*3) + (d5*4) + (d6*5) + (d7*6) + (d8*7) + (d9*8) + (dv1*9);
        int dv2 = soma2 % 11;
        if (dv2 == 10) dv2 = 0;

        // RESULTADO FINAL
        System.out.println("O CPF completo é: " + d1+d2+d3 + "." + d4+d5+d6 + "." + d7+d8+d9 + "-" + dv1 + dv2);

        teclado.close();
    }
}