package ETAPA3;
public class C15EX03 {

    public static void main(String[] args) {

        C15EX02 carro1 = new C15EX02(
                "Ferrari", "F8", 2023,
                "Vermelho", 2500000,
                720, 340);

        C15EX02 carro2 = new C15EX02(
                "Porsche", "911 Turbo", 2024,
                "Cinza", 1300000,
                650, 330);

        C15EX02 carro3 = new C15EX02(
                "Lamborghini", "Huracan", 2022,
                "Amarelo", 2800000,
                640, 325);

        carro1.imprimirCarro();
        carro1.exibirDesempenho();

        System.out.println("---------------------");

        carro2.imprimirCarro();
        carro2.exibirDesempenho();

        System.out.println("---------------------");

        carro3.imprimirCarro();
        carro3.exibirDesempenho();
    }
}