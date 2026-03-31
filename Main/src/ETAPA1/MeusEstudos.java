// --- MINHAS ANOTAÇÕES DE ALGORITMOS (André - CC) ---
// FOCO: UX ENGINEER | NÃO ESQUECER AS CHAVES!
package etapa1;

import javax.swing.JOptionPane;

public class MeusEstudos {
    public static void main(String[] args) {

        // 1. O PULO DO GATO: TRATAR ENTRADA
        // showInputDialog SEMPRE retorna String. Se não converter, o código é TRASH.
        String input = JOptionPane.showInputDialog("Valor da conta:");
        double valor = Double.parseDouble(input); // Converter p/ número decimal


        // 2. O "BIXO": PEGAR NÚMEROS DO MEIO (VAI CAIR!)
        // Exemplo: Número 456. Objetivo: Pegar o 5.
        int numInteiro = 456;
        int semUltimo = numInteiro / 10;   // 456 / 10 = 45 (Sumiu o 6)
        int soOMeio = semUltimo % 10;     // O resto de 45 / 10 é 5. PEGAMOS!

        // DICA: Divisão com decimal TEM que ter .0 (Ex: 10 / 4.0 = 2.5)


        // 3. COMPARAÇÃO (NÃO USA == EM TEXTO!)
        String pais = "Brasil";
        // .equalsIgnoreCase é vida: ignora se o user digitou BRASIL ou brasil.
        if (pais.equalsIgnoreCase("brasil")) {
            // && = E (as duas vdd) | || = OU (uma vdd)
            // Cuidado: Java NÃO entende ≥ ou ≤. Use >= ou <=.
            System.out.println("É brasileiro.");
        }


        // 4. SAÍDA "UX ENGINEER" (BONITINHA)
        // String.format é o printf das janelas. %.2f = 2 casas decimais.
        String msgFinal = String.format("O resultado final é: R$ %.2f", valor);
        JOptionPane.showMessageDialog(null, msgFinal);


        /* --- CHECKLIST ANTI-REPROVAÇÃO ---
           [ ] Apertei Ctrl + Alt + L (ou Alt + Shift + F) pra alinhar? 
           [ ] Se a chave } não alinhou, tá faltando fechar alguma lá em cima!
           [ ] Verifiquei se todos os ( tem seu ) ?
           [ ] Coloquei ; no final de tudo (menos no if e na class)?
           [ ] O "último else" tá sempre sozinho? (else { ... })
        */



        /*
========================================
📌 RESUMO - CLASSE Math EM JAVA
========================================

A classe Math já vem pronta no Java e possui vários métodos úteis
para fazer cálculos matemáticos. Não precisa importar.

----------------------------------------
🔢 POTÊNCIA (Math.pow)
----------------------------------------
Calcula a potência de um número.

Sintaxe:
Math.pow(base, expoente)

Exemplo:
double resultado = Math.pow(2, 3); // 2³ = 8.0

Obs:
- Sempre retorna double

----------------------------------------
√ RAIZ QUADRADA (Math.sqrt)
----------------------------------------
Calcula a raiz quadrada.

Sintaxe:
Math.sqrt(numero)

Exemplo:
double raiz = Math.sqrt(25); // 5.0

Obs:
- Só funciona com números positivos
- Retorna double

----------------------------------------
🔽 ARREDONDAMENTO
----------------------------------------

Math.round() → arredonda normalmente
Math.round(4.6); // 5
Math.round(4.4); // 4

Math.floor() → arredonda para baixo
Math.floor(4.9); // 4.0

Math.ceil() → arredonda para cima
Math.ceil(4.1); // 5.0

----------------------------------------
🔺 VALOR ABSOLUTO (Math.abs)
----------------------------------------
Transforma número negativo em positivo.

Exemplo:
Math.abs(-10); // 10

----------------------------------------
🎲 NÚMERO ALEATÓRIO (Math.random)
----------------------------------------
Gera número entre 0.0 e 1.0

Exemplo:
Math.random(); // ex: 0.345

Para gerar intervalo:
int num = (int)(Math.random() * 10); // 0 a 9

----------------------------------------
📊 MÁXIMO E MÍNIMO
----------------------------------------

Math.max(10, 20); // 20
Math.min(10, 20); // 10

----------------------------------------
⚠️ DICAS IMPORTANTES
----------------------------------------
- A classe Math é estática → não precisa criar objeto
- A maioria dos métodos retorna double
- Muito usada para cálculos em geral

========================================
*/
    } // Fecha o main
} // Fecha a class