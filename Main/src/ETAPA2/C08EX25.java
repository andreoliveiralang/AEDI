//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079

package ETAPA2;
public class C08EX25
{
    public static void main(String[] args) 
    {
        String asteris = "*";
        for (int aux3 = 1; aux3 <=1; aux3 ++)
        {
            for (int aux2=1; aux2 <=10; aux2++)
            {
                for (int aux=1; aux<=aux2; aux++)
                    System.out.print(asteris+"");
                System.out.println();
            }
            for (int aux9 = 10; aux9 >=1; aux9 --)
            {
                for (int aux=1; aux <=aux9; aux++)
                    System.out.print(asteris+"");
                System.out.println();
            }
        }
    }   
}
