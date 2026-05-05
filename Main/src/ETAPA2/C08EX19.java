package ETAPA2;

public class C08EX19 
{
     public static void main(String[] args) 
    {    
        int conta = 0;

        for (int aux = 1; aux <= 100; aux++){
           conta += Math.pow(aux,2);
           System.out.println(aux * aux);
        }

        System.out.print("A soma dos 100 primeiros termos é = " + conta);
    }
}

