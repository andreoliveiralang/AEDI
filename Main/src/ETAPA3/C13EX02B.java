package ETAPA3;
public class C13EX02B {

    public double calcularF(double x) {

        if (x < 4) {
            return (5 * x + 3) / Math.sqrt(16 - Math.pow(x, 2));
        } else if (x == 4) {
            return 0;
        } else {
            return (5 * x + 3) / Math.sqrt(Math.pow(x, 2) - 16);
        }

    }
}