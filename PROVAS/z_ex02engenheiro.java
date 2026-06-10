public class z_ex02engenheiro {
    // Esse método NÃO tem a palavra 'static' porque ele pertence à classe treino08_ex02a
    public double calcularFx(double x) {
        
        // Caminho 1: se x for exatamente igual a 4, a resposta é 0
        if (x == 4) {
            return 0;
        } 
        // Caminho 2: se x for menor que 4, faz a primeira fórmula do print
        else if (x < 4) {
            return (5 * x + 3) / Math.sqrt(16 - Math.pow(x, 2));
        } 
        // Caminho 3: se x for maior que 4, faz a última fórmula do print
        else {
            return (5 * x + 3) / Math.sqrt(Math.pow(x, 2) - 16);
        }
    }
}
