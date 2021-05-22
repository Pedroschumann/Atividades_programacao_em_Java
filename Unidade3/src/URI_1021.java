import java.util.Scanner;

public class URI_1021 {
    public static void main(String[] args) {

        Scanner entradas = new Scanner(System.in);

        float valor = entradas.nextFloat();
            float valorResultado = valor * 100;
            System.out.println(valorResultado);


            int valorFinal = (int) valorResultado;
            System.out.print(valorFinal);

        /*double valor = entradas.nextDouble();

        double valorMultiplicado = valor * 100;
        int valorFinal = (int) valorMultiplicado;


        // ----------- Notas -------------
        int nota100 = valorFinal / 10000;
        valorFinal = valorFinal - (nota100 * 10000);

        int nota50 = valorFinal / 5000;
        valorFinal = valorFinal - (nota50 * 5000);

        int nota20 = valorFinal / 2000;
        valorFinal = valorFinal - (nota20 * 2000);

        int nota10 = valorFinal / 1000;
        valorFinal = valorFinal - (nota10 * 1000);

        int nota5 = valorFinal / 500;
        valorFinal = valorFinal - (nota5 * 500);

        int nota2 = valorFinal / 200;
        valorFinal = valorFinal - (nota2 * 200);

        // ----------- Moedas -------------
        int moeda1real = valorFinal / 100;
        valorFinal = valorFinal - (moeda1real * 100);

        int moeda50 = valorFinal / 50;
        valorFinal = valorFinal - (moeda50 * 50);

        int moeda25 = valorFinal / 25;
        valorFinal = valorFinal - (moeda25 * 25);

        int moeda10 = valorFinal / 10;
        valorFinal = valorFinal - (moeda10 * 10);

        int moeda5 = valorFinal / 5;
        valorFinal = valorFinal - (moeda5 * 5);

        int moeda1 = valorFinal / 1;

        System.out.println("NOTAS:");
        System.out.println(nota100 + " nota(s) de R$ 100.00");
        System.out.println(nota50 + " nota(s) de R$ 50.00");
        System.out.println(nota20 + " nota(s) de R$ 20.00");
        System.out.println(nota10 + " nota(s) de R$ 10.00");
        System.out.println(nota5 + " nota(s) de R$ 5.00");
        System.out.println(nota2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(moeda1real + " moeda(s) de R$ 1.00");
        System.out.println(moeda50 + " moeda(s) de R$ 0.50");
        System.out.println(moeda25 + " moeda(s) de R$ 0.25");
        System.out.println(moeda10 + " moeda(s) de R$ 0.10");
        System.out.println(moeda5 + " moeda(s) de R$ 0.05");
        System.out.println(moeda1 + " moeda(s) de R$ 0.01");*/

        entradas.close();
    }
}
