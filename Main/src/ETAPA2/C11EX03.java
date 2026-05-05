package ETAPA2;

import java.util.Scanner;

public class C11EX03 {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int dia, multas8pts15dias=0, pontos = 0;
        double valormulta =0 , valortotal = 0;

        do {
            System.out.print("Digite o dia: ");
            dia = teclado.nextInt();

            teclado.nextLine();
            
            if (dia != 99) {

                System.out.print("Digite a placa: ");
                String placa = teclado.nextLine();

                System.out.print("Digite os pontos: ");
                pontos = teclado.nextInt();
                 
                if (pontos ==3){
                    valormulta = 42;
                    valortotal += valormulta;
                }
                if (pontos == 5){
                    valormulta = 108;
                    valortotal += valormulta;
                }
                if (pontos == 8){
                    valormulta = 479;
                    valortotal += valormulta;
                }
                
                System.out.println("Placa: " + placa + " Valor da multa: " + valormulta);
                System.out.println("--------------");
            }
            
            if (dia <= 15 && pontos == 8) {
                multas8pts15dias ++;
            }

        } while (dia != 99);

        System.out.println("Quantidade de multas de pontuçao 8 nos primeiros 15 dias do mes: " + multas8pts15dias);

        System.out.println("Valor total: " + valortotal);

        teclado.close();
    }
}

