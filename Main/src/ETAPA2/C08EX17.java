package ETAPA2;

public class C08EX17 {
    public static void main(String[] args) 
    {    
        Double fx = 0.;
    
        
        for (int aux = 3; aux <= 12; aux++){
           fx = Math.sqrt(Math.pow(aux,2)- 3 );
           
           System.out.printf("x=%d f(x) = %.4f\n",aux, fx); // printf controla o formato: %d para inteiro, %.4f para 4 casas decimais
        
        }
    }
}
