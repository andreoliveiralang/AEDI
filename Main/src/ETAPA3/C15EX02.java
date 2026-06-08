package ETAPA3;
public class C15EX02 extends C15EX01 {

    private int potencia;
    private double velocidadeMaxima;

    // Construtor
    public C15EX02(String marca, String modelo, int ano,
                          String cor, double preco,
                          int potencia, double velocidadeMaxima) {

        super(marca, modelo, ano, cor, preco);
        this.potencia = potencia;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    // Getters e Setters
    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    // Métodos
    public void acelerar() {
        System.out.println("O carro esportivo acelerou!");
    }

    public void exibirDesempenho() {
        System.out.println("Potência: " + potencia + " cv");
        System.out.println("Velocidade Máxima: " + velocidadeMaxima + " km/h");
    }
}