public class Fatorial {

    public static void main(String[] args) {

        /*
         📌 O que é fatorial?
         O fatorial de um número n (n!) é a multiplicação dele por todos os anteriores até 1.

         Ex:
         5! = 5 × 4 × 3 × 2 × 1 = 120
         4! = 4 × 3 × 2 × 1 = 24
         0! = 1 (por definição)
        */

        /*
         🧠 Fórmula:
         n! = n × (n-1) × (n-2) × ... × 1
        */

        // =========================================
        // ✔️ EXEMPLO 1: Fatorial de um número (for)
        // =========================================

        int n = 5;
        int fatorial = 1;

        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }

        System.out.println("Fatorial de " + n + " = " + fatorial);

        // =========================================
        // ✔️ EXEMPLO 2: Fatorial usando while
        // =========================================

        int n2 = 5;
        int fatorial2 = 1;
        int i = 1;

        while (i <= n2) {
            fatorial2 *= i;
            i++;
        }

        System.out.println("Fatorial (while) = " + fatorial2);

        // =========================================
        // ✔️ EXEMPLO 3: Progressão de 1 até 9
        // (o que mais cai em prova)
        // =========================================

        int fat = 1;

        for (int j = 1; j <= 9; j++) {
            fat *= j;
            System.out.println(j + "! = " + fat);
        }
    }

    // =========================================
    // ✔️ EXEMPLO 4: Recursão
    // =========================================

    public static int fatorialRecursivo(int n) {
        if (n == 0) return 1;
        return n * fatorialRecursivo(n - 1);
    }
}