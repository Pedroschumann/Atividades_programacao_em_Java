import java.util.Scanner;

public class URI_1018 {
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);
        
        int valorlido = entradas.nextInt();
        int valor = valorlido;

        int nota100 = valor / 100;
        valor = valor - (nota100 * 100);

        int nota50 = valor / 50;
        valor = valor - (nota50 * 50);

        int nota20 = valor / 20;
        valor = valor - (nota20 * 20);

        int nota10 = valor / 10;
        valor = valor - (nota10 * 10);

        int nota5 = valor / 5;
        valor = valor - (nota5 * 5);

        int nota2 = valor / 2;
        valor = valor - (nota2 * 2);

        int nota1 = valor / 1;

        System.out.println(valorlido);
        System.out.println(nota100 + " nota(s) de R$ 100,00");
        System.out.println(nota50 + " nota(s) de R$ 50,00");
        System.out.println(nota20 + " nota(s) de R$ 20,00");
        System.out.println(nota10 + " nota(s) de R$ 10,00");
        System.out.println(nota5 + " nota(s) de R$ 5,00");
        System.out.println(nota2 + " nota(s) de R$ 2,00");
        System.out.println(nota1 + " nota(s) de R$ 1,00");

        entradas.close();
    }
}
