//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079

package ETAPA2;
public class C08EX28
{
        public static void main(String[] args) 
    {    
        int soma = 0, tudo=0,media;

        for (int aux = 1; aux <= 9 ;aux++) {
        soma = aux * (aux+1) * (aux +2);
        System.out.println(soma);
        }   for (int aux = 1; aux <= 9 ;aux++) {
            soma += aux * (aux+1) * (aux +2);
        }

        media = soma/9;
        System.out.println("Média = "+ media);

    }

}


