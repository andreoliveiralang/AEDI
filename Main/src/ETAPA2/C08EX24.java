package ETAPA2;

public class C08EX24 {
         public static void main(String[] args) 
    {    
        Double serie = 0., soma = 0.;

        for (int aux = 1; aux <= 99 ;aux+=2) {
        soma = soma + Math.pow(2, aux) ;
        }
        serie = (1.0/3.0) * soma;
        
        System.out.println("Valor da Série = "+ serie);

    }

}


