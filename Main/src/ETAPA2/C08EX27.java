//Nome: André Luiz De Oliveira Lang
//Curso: Ciências da computação
//Disciplina: Algoritmos e Estrutura de Dados I
//Matricula:D29079

package ETAPA2;
public class C08EX27
{
    public static void main(String[] args)
    {
        String asteris = "*";
        {
         for (int repeticao = 0; repeticao < 2; repeticao++) 
            {
                for (int aux2=1; aux2 <=128; aux2 *= 2)
                {
                    for (int aux=1; aux<=aux2; aux++)
                        System.out.print(asteris+"");
                    System.out.println();
                }
                for (int aux2=64; aux2 >= 1; aux2 = aux2 /2)
                {
                    for (int aux=1; aux<=aux2; aux++)
                        System.out.print(asteris+"");
                    System.out.println();
                }
            }
            
        }
    }  
}