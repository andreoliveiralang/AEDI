//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079

package ETAPA2;
public class C08EX26
{
    public static void main(String[] args)
    {
        String asteris = "*";
        {
            for (int linha=1; linha <=10; linha++)
            {
                for (int aux=1; aux<=linha; aux++)
                    System.out.print(" ");
                System.out.print(asteris);
                System.out.println();
            }
            for (int linha=10; linha >=1; linha--)
            {
                for (int aux=1; aux<=linha; aux++)
                    System.out.print(" ");
                System.out.print(asteris);
                System.out.println();
            }
            
           
        }
    }  
}